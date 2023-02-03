package Operator_mid.houserent.view;

import Operator_mid.houserent.utils.Utility;

/**
 * @author lin
 * @creat 2022--11--21:02
 *
 *  * 1. 显示界面
 *  * 2. 接收用户的输入
 *  * 3. 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop=true;//控制显示菜单
    private char key=' ';//接收用户选择

//    显示主菜单
    public void mainMenu(){

        do {
            System.out.println("===============房屋出租系统菜单====================");
            System.out.println("\t\t\t 1 新增房源");
            System.out.println("\t\t\t 2 查找房屋");
            System.out.println("\t\t\t 3 删除房屋信息");
            System.out.println("\t\t\t 4 修改房屋信息");
            System.out.println("\t\t\t 5 显示房屋信息");
            System.out.println("\t\t\t 6 退出");
            System.out.println("请输入你的选择(1-6)");
            key= Utility.readChar();
            switch (key){
                case '1':

                    break;
                case '2':

                    break;
                case '3':

                    break;
                case '4':

                    break;
                case '5':

                    break;
                case '6':

                    break;
                default:
            }
        }while (loop);
    }
}
