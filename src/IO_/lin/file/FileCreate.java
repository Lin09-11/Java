package IO_.lin.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author lin
 * @creat 2022--12--10:34
 *
 * 演示创建文件
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1 new File(String pathname)
    @Test
    public void create01() {
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);

//        创建文件
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //方式2 new File(File parent,String child) //根据父目录文件+子路径构建
    //e:\\news2.txt
    @Test
    public  void create02() {
        File parentFile = new File("d:\\");//父路径
        String fileName = "news2.txt";//子路径
        //这里的file对象，在java程序中，只是一个对象
        //只有执行了createNewFile 方法，才会真正的，在磁盘创建该文件
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent,String child) //根据父目录+子路径构建
    @Test
    public void create03() {
        //String parentPath = "e:/";-与下面的等价
        String parentPath = "d:\\";
        String fileName = "news4.txt ";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //下面四个都是抽象类
    //
    //InputStream
    //OutputStream
    //Reader //字符输入流
    //Writer  //字符输出流
}

