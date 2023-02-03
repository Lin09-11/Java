package IO_.lin.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lin
 * @creat 2022--12--19:16
 *
 * 演示BufferedWriter的使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\ok.txt";
        //创建BufferedWriter
        //说明:
        //1. new FileWriter(filePath, true) 表示以追加的方式写入
        //2. new FileWriter(filePath) , 表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));//此时流没有关闭，所以不会被覆盖
        bufferedWriter.write("hello, 韩顺平教育!");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello2, 韩顺平教育!");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3, 韩顺平教育!");
        bufferedWriter.newLine();

        //说明：关闭外层流即可 ， 传入的 new FileWriter(filePath) ,会在底层关闭
        bufferedWriter.close();

        /*认为覆盖的认知是在当前操作，覆盖了，之前的文件数据（这是对的此处覆盖了）
        注意，覆盖指的是你在创建节点流的时候，会创建一个你传入路径的空文件，如果原本有这个文件，空文件就会覆盖
        覆盖指的是对目标文件的覆盖,分多次write,实际上就是一次write
        */

    }
}

