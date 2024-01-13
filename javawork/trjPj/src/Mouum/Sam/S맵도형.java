package Mouum.Sam;



import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;



class TrShape2 implements Comparable{
   String name;
   int area, border;
   
   @Override
   public int compareTo(Object o) {
      TrShape2 you = (TrShape2)o;
      int res = name.compareTo(you.name);
            
      if(res==0) {
         res = you.area - area;
      }
      if(res==0) {
         res = you.border - border;
      }
      return res;
   }

   public TrShape2(String name, int area, int border) {
      this.name = name;
      this.area = area;
      this.border = border;
   }

   
   public String toString() {
      return name + "\t" + area + "\t" + border;
   }
   
   
   
}

public class S맵도형 {

   public static void main(String[] args) {
  
      ArrayList<TrShape2> shapes = new ArrayList();
      
      shapes.add(new TrShape2("직사각형", 11, 22));
      shapes.add(new TrShape2("직각삼각형", 44, 33));
      shapes.add(new TrShape2("원", 66,55 ));
      shapes.add(new TrShape2("직사각형", 66, 11));
      shapes.add(new TrShape2("직각삼각형", 22, 44));
      shapes.add(new TrShape2("원", 44, 33));
      shapes.add(new TrShape2("직사각형",44 ,44 ));
      shapes.add(new TrShape2("직각삼각형", 50, 66));
      shapes.add(new TrShape2("원", 44, 33));
      shapes.add(new TrShape2("원", 11,22 ));
      shapes.add(new TrShape2("직사각형",22 ,33 ));
      shapes.add(new TrShape2("직각삼각형", 66, 55));
      shapes.add(new TrShape2("원", 33, 33));
      shapes.add(new TrShape2("직사각형", 11, 22));
      
      
      TreeMap<String,TreeSet<TrShape2>> totMap = new TreeMap();
      
      for (TrShape2 obj : shapes) {            //형변환 
//         TrShape2 ts2 = (TrShape2)obj;
         TreeSet<TrShape2> shapeTS = null;            //트리셋 빈통생성
         
         if(totMap.containsKey(obj.name)) {      //원소 같은지확인
            shapeTS = totMap.get(obj.name); //같으면 트리맵겟해서 트리셋에 넣기 -변환+
         }
         else {
            shapeTS = new TreeSet();
            totMap.put(obj.name, shapeTS);
         }
         
         shapeTS.add(obj);
      }
      
      for  (Map.Entry<String, TreeSet<TrShape2>> doo : totMap.entrySet()) {
        
         System.out.println(doo.getKey()+"\t +");
         for (Object object2 : doo.getValue()) {
            System.out.println(object2);
         }
      }
   }

}