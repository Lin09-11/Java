package IO_.lin.reader_;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author lin
 * @creat 2022--12--17:18
 */
public class FileReader_ {
    public static void main(String[] args) {


    }

    /**
     * 单个字符读取文件
     */
    @Test
    public void readFile01() {
        String filePath = "d:\\story.txt";
        FileReader fileReader = null;
        int data = 0;
        //1. 创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read, 单个字符读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字符数组读取文件
     */
    @Test
    public void readFile02() {
        System.out.println("~~~readFile02 ~~~");
        String filePath = "e:\\story.txt";
        FileReader fileReader = null;

        int readLen = 0;
        //先将文件中的内容读取到buf，一次读取8个后面，在将这8个文件传出
        char[] buf = new char[8];
        //1. 创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read(buf), 返回的是实际读取到的字符数
            //如果返回-1, 说明到文件结束
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

