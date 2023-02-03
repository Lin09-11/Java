package programControlStructure;

/**
 * @author lin
 * @creat 2022--11--09 0:19
 */
public class ForExercise02 {

    public static void main(String[] args) {

        //化繁为简
        //先死后活
        int n = 9;
        for( int i = 0; i <= n; i++) {
            System.out.println(i + "+" + (n-i) + "=" + n);
        }
    }
}
