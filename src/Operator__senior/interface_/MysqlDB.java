package Operator__senior.interface_;

/**
 * @author lin
 * @creat 2022--11--22:33
 */
//A程序
public class MysqlDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}

