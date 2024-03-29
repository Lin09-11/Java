package Operator_mid.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author lin
 * @creat 2022--11--16:32
 */
public class SmallChangeSys {

//    化繁为简
//    1.先完成显示菜单，并可以选择菜单，给出对应提示
//    2.完成零钱通明细
    /**（1）可以把收益入账和消费，保存到数组
     （2）可以使用对象
     （3）简单的话，可以使用String拼接*/
//    3.完成收益入账
//    4.完成消费
//    5.退出
//    6.退出确认（确认退出吗y/n)
//    7. 在收益入账和消费时，判断金额是否合理，并给出相应的提示


    public static void main(String[] args) {

//        定义相关的变量
//        loop--控制显示菜单
        boolean loop=true;
        Scanner scanner = new Scanner(System.in);
//        接收选择
        String key="";

//        2.完成零钱通明细
        String details="------------零钱通明细-------------";

//    3.完成收益入账  完成功能驱动程序员增加新的变化和代码
//        思路：定义新的变量
        double money=0;
        double balance=0;
        Date date=null;//date 是 import java.util.Date类，表示日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化的

//        4.完成消费
//        定义新变量，保存消费的原因
        String note=null;

        do {
            System.out.println("\n==============零钱通菜单=================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退      出");

            System.out.println("请选择（1-4）");
            key=scanner.next();

//            使用switch 分支控制
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额");
                    money=scanner.nextDouble();
//                    money 的值范围应该校验，
                    //找出不正确的金额条件，然后给出提示, 就直接break
                        if(money<=0){
                            System.out.println("收益入账金额 需要 大于 0");
                            break;
                        }
                    balance+=money;
//                    拼接收益入账信息到 details
                    date=new Date();//获取当前日期
//                    System.out.println(sdf.format(date));
                    details+="\n收益入账\t"+money+"\t"+sdf.format(date)+"\t"+balance;

                    break;
                case "3":
                    System.out.println("消费金额");
                    money=scanner.nextDouble();
//                    money 的值范围应该校验，
                    //找出不正确的金额条件，然后给出提示, 就直接break
                    if(money<=0 || money>balance){
                        System.out.println("您的消费金额应该在0-"+balance);
                        break;
                    }
                    System.out.println("请输入消费说明");
                    note=scanner.next();
                    balance-=money;
//                    拼接消费信息到 details
                    date=new Date();//获取当前日期
//                    System.out.println(sdf.format(date));
                    details+="\n"+note+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
                    break;
                case "4":
                    //用户输入4退出时，给出提示"你确定要退出吗? y/n"，必须输入正确的y/n ，
                    // 否则循环输入指令，直到输入y 或者 n
                    // 老韩思路分析
                    // (1) 定义一个变量 choice, 接收用户的输入
                    // (2) 使用 while + break, 来处理接收到的输入时 y 或者 n
                    // (3) 退出while后，再判断choice是y还是n ,就可以决定是否退出
                    // (4) 建议一段代码，完成一个小功能，尽量不要混在一起

                    String choice="";
                    while (true){//这个while用于限制输入的必须是y或者n
                        System.out.println("你确定要退出吗？y/n");
                        choice=scanner.next();
                        if("y".equals(choice)|| "n".equals(choice)){
                            break;
                        }
                    }

//                    当用户退出while后，进行判断
                    if(choice.equals("y")){//这个if判断是y还是n
                            loop=false;//输入y的时候，要退出整个程序
                    }
//                    如果输入n，则不退出，重新输出菜单
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        }while (loop);

        System.out.println("--------退出零钱通项目-----------");
    }
}
