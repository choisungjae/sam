package Restaurant;



import java.util.Arrays;



class MethodRes{
   
   static int stCnt;   // 전체 메뉴 갯수
   static int psCnt;
   static int pzCnt;
   String [] menu;
   int price;
         
   int setCnt=0;
   int stCntt = 0;   //주문서 별 메뉴 갯수
   int psCntt = 0;
   int pzCntt = 0;
   //-----------------------------------------------
   int hi = 0;
   String hiName, lowName;
   int low = 0;
   //-----------------------------------------------
    static int[] ttotArr = new int[2];
   static int tot;
   int [] total = {0,0};
   int[] rank = new int[total.length];
      
         
   void order(String ...menu) {
      this.menu = menu;

       for (int i = 0; i < this.menu.length; i++) {
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
       }
       price = stCntt*30000 + psCntt*10000 + pzCntt*20000 + setCnt*50000;
       tot += price;
       ttotArr[0] += price;
       
   }
   void order2(String ...menu) {
      this.menu = menu;

       for (int i = 0; i < this.menu.length; i++) {
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
       }
       price = stCntt*30000 + psCntt*10000 + pzCntt*20000 + setCnt*50000;
       tot += price;
       ttotArr[1] +=price;
       
   }
      
   
   void calc() {
      int [] orderCnt = {stCnt, psCnt, pzCnt};
      //System.out.println(Arrays.toString(orderCnt));
      String[] MenuName = {"스테이크", "파스타", "피자"};
      hi = orderCnt[0];
      low = orderCnt[0];
      lowName = "";
      hiName = "";
      for (int i = 0; i < orderCnt.length; i++) {
         if(orderCnt[i] <= low) {
            low = orderCnt[i];
            lowName = MenuName[i];
         }
         if(orderCnt[i] >= hi) {
            hi = orderCnt[i];
            hiName = MenuName[i];
         }
      }


      pnt2();
   }
   
   void rank_meth1() {
      for (int me = 0; me < ttotArr.length; me++) {
         for (int you = me + 1; you < ttotArr.length; you++) {
            if (ttotArr[me] < ttotArr[you]) {
               int buf = ttotArr[me];
               ttotArr[me] = ttotArr[you];
               ttotArr[you] = buf;
            }
         }
      }
      for (int me = 0; me < rank.length; me++) {
         rank[me] = 1;
         for (int you : ttotArr) {

            if (ttotArr[me] < you) {
               rank[me]++;
            }
         }
         System.out.println(rank[me] + "등  점포판매총액 :" + ttotArr[me]);
      }
   
   }
   
      
      
      
   void pnt() {
      System.out.println(Arrays.toString(menu)+"\t"+ "가격: "+price);

   }
   void pnt2() {
       System.out.println("\n지점 매출 : " + tot +"\n부가세 : " + tot/10 + "\n순이익 : " + (tot - tot/10));
      System.out.println("최대: "+hiName+"\t\t"+"판매량:"+ hi);
      System.out.println("최소: "+lowName+"\t"+"판매량:"+ low);
      
      
      stCnt =0;
      psCnt=0;
      pzCnt=0;
      tot=0;
      
   }
   void pnt3() {
      rank_meth1();
      System.out.print("브랜드 총매출:" );
      System.out.println(ttotArr[0]+ttotArr[1]);
   }

}

class MenuInit1{
   MethodRes makeOrd(String ...menu) {
   MethodRes mr = new MethodRes();
   mr.order(menu);
   return mr;
   }
}

class MenuInit2{
   MethodRes makeOrd(String ...menu) {
   MethodRes mr = new MethodRes();
   mr.order2(menu);
   return mr;
   }
}



public class ddd {

   public static void main(String[] args) {
      MenuInit1 mi1 = new MenuInit1();
      MenuInit2 mi2 = new MenuInit2();
      MethodRes res = new MethodRes();

      MethodRes [] prin1 = {
         mi1.makeOrd("스테이크", "파스타", "파스타"),
         mi1.makeOrd("스테이크", "스테이크", "피자","파스타"),
         mi1.makeOrd("파스타", "피자"),
         mi1.makeOrd("피자", "파스타", "피자"),
         mi1.makeOrd("스테이크", "스테이크", "피자", "피자","파스타","파스타"),
         mi1.makeOrd("피자", "피자"),
       };
      
      System.out.println("지점1");
       for (MethodRes pp : prin1) {
          pp.pnt();
            
       }
       res.calc();
       System.out.println("---------------------------------------------------------------------");
       
      MethodRes [] prin2 = {
         mi2.makeOrd("스테이크", "파스타", "파스타", "피자", "피자"),
         mi2.makeOrd("스테이크", "스테이크", "피자","파스타", "파스타", "파스타"),
         mi2.makeOrd("파스타", "피자", "스테이크", "피스타"),
         mi2.makeOrd("피자", "파스타", "피자","스테이크"),
         mi2.makeOrd("스테이크", "스테이크", "피자", "피자","파스타"),
         mi2.makeOrd("피자", "피자", "스테이크"),
          };
       

       
       
       System.out.println("지점2");
       for (MethodRes tt : prin2) {
          tt.pnt();
            
       }
       res.calc();
       res.pnt3();


      
   }

}