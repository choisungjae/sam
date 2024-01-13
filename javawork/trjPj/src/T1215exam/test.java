package T1215exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class test {

    Map<String, DataOutputStream> clientMap = new HashMap<>();

    public test() {
        Collections.synchronizedMap(clientMap);

        try {
            ServerSocket server = new ServerSocket(7777);
            System.out.println("서버시작");

            while (true) {
                Socket client = server.accept();
                new MulReceiver(client).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class MulReceiver extends Thread {
        String name;
        DataOutputStream dos;
        DataInputStream dis;

        public MulReceiver(Socket client) {
            try {
                name = "[" + client.getInetAddress() + "]";
                dos = new DataOutputStream(client.getOutputStream());
                dis = new DataInputStream(client.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                sendToAll(name + "입장");
                clientMap.put(name, dos);
                sendToAll("접속자 수:" + clientMap.size());

                while (dis != null) {
                    sendToAll(name + dis.readUTF());
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                clientMap.remove(name);
                sendToAll(name + "퇴장");
                sendToAll("접속자 수:" + clientMap.size());
            }
        }
    }

    void sendToAll(String msg) {
        for (DataOutputStream dos : clientMap.values()) {
            try {
                dos.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MultiServerMain();
    }
}