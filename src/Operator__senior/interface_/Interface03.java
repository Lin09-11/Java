package Operator__senior.interface_;

/**
 * @author lin
 * @creat 2022--11--22:35
 */
public class Interface03 {
    public static void main(String[] args) {

        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}

