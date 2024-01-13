package zam;

import java.util.Arrays;

class MethodRes{
   int[] price;
   static int stCnt = 0;   // 전체 메뉴 갯수
   static int psCnt = 0;
   static int pzCnt = 0;
   
   int[] Tot;
   String [] menu;
   int ttot;
   
   int setCnt;
   int stCntt;   //주문서 별 메뉴 갯수
   int psCntt;
   int pzCntt ;
   
   
   void init(String ...menu) {
      this.menu = menu;
      order();
   }
   
      
   void order() {
      for (int i = 0; i < menu.length; i++) {
         switch(menu[i]) {
         case "스테이크":
            stCnt ++;
            stCntt ++;
            break;
         case "파스타":
            psCnt ++;
            psCntt ++;
            break;
         case "피자":
            pzCnt ++;
            pzCntt ++;
            break;
         }
         
         if(stCntt > 0 && psCntt > 0 && pzCntt >0) {
            stCntt--;
            psCntt--;
            pzCntt--;
            setCnt++;
         }
         price[i] = stCntt*30000 + psCntt*10000 + pzCntt*20000 + setCnt*50000;
         Tot[i]+=price[i];
      }
     
     
      for (int i = 0; i < Tot.length; i++) {
    	 
    	  ttot+=Tot[i];
	}
    	  
	}
     
   
   
   
   
   
   void pnt() {
      System.out.println(Arrays.toString(menu)+"\t"+ "가격: "+price   );
   }
   
}
class MenuInit{
   MethodRes makeOrd(String ...menu) {
      MethodRes mr = new MethodRes();
      mr.init(menu);
      return mr;
   }
}

public class Restaurant {

   public static void main(String[] args) {
      MenuInit mi = new MenuInit();
      
      
      MethodRes [] prin = {
            mi.makeOrd("스테이크", "파스타", "파스타"),
            mi.makeOrd("스테이크", "스테이크", "피자","파스타"),
            mi.makeOrd("파스타", "피자"),
            mi.makeOrd("피자", "파스타", "피자"),
            mi.makeOrd("스테이크", "스테이크", "피자", "피자","파스타","파스타"),
            mi.makeOrd("피자", "피자"),
      };
      
      for (MethodRes pp : prin) {
         pp.pnt();
      }
      
      MethodRes res = new MethodRes();
      
      System.out.println("스테이크 수량 : "+ res.stCnt +"\n파스타 수량 : "+ res.psCnt +
            "\n피자 수량 : "+ res.pzCnt + "\n총 매출 : " + res.Tot +
            "\n부가세 : " + res.ttot + "\n순이익 : "  );
      
      
   }
}