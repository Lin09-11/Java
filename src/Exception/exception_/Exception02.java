package Exception.exception_;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lin
 * @creat 2022--11--23:43
 */
public class Exception02 {
    public static void main(String[] args) {

        try {
            FileInputStream fis;
            fis = new FileInputStream("d:\\aa.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

