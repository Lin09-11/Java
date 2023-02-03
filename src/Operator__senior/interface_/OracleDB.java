package Operator__senior.interface_;

/**
 * @author lin
 * @creat 2022--11--22:35
 */
//B程序员连接Oracle
public class OracleDB implements DBInterface{

    @Override
    public void connect() {
        System.out.println("连接oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle");
    }
}

