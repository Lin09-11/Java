package Operator_junior;

/**
 * @author lin
 * @creat 2022--11--08 20:02
 */
//验证

public class Test {

    //编写一个main方法
    public static void main(String[] args) {

         int x = 5;
         int y=5;
         if(x++==6 & ++y==6){ //逻辑与
         	x = 11;
         }
         System.out.println("x="+x+",y="+y);//6, 6

         int x1 = 5,y1 = 5;

         if(x1++==6 && ++y1==6){
         	x1 = 11;
         }
         System.out.println("x1="+x1+",y1="+y1);//6, 5


         int x2 = 5,y2 = 5;
         if(x2++==5 | ++y2==5){
         	x2 =11;
         }
         System.out.println("x2="+x2+",y2="+y2);//11, 6


         int x3 = 5,y3 = 5;
         if(x3++==5 || ++y3==5){
         	x3 =11;
         }
         System.out.println("x3="+x3+",y3="+y3);//11, 5


        boolean x4=true;
        boolean y4=false;
        short z=46;
        if( (z++==46)&& (y4=true) )  //把true赋为true
            z++;
        if((x4=false) || (++z==49))
            z++;
        System. out.println("z="+z); //50

    }
}
