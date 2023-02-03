package IO_.lin.outputStream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author lin
 * @creat 2022--12--10:42
 *
 * 演示ObjectOutputStream的使用, 完成数据的序列化
 */
public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "e:\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 e:\data.dat
        oos.writeInt(100);// int -> Integer (实现了 Serializable)
        oos.writeBoolean(true);// boolean -> Boolean (实现了 Serializable)
        oos.writeChar('a');// char -> Character (实现了 Serializable)
        oos.writeDouble(9.5);// double -> Double (实现了 Serializable)
//        writeUTF---保持字符串
        oos.writeUTF("韩顺平教育");//String
        //保存一个dog对象
//        如果此Dog对象没有实现Serializable接口，则报错
        oos.writeObject(new Dog("旺财", 10, "日本", "白色"));
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");


    }
}


