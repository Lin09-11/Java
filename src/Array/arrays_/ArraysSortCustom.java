package Array.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lin
 * @creat 2022--11--16:51
 */
public class ArraysSortCustom {
    public static void main(String[] args) {

        int[] arr = {1, -1, 8, 0, 20};
        //bubble01(arr);

        //结合冒泡 + 定制测试
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;//向下转型+拆箱
                int i2 = (Integer) o2;//向下转型+拆箱
                ///从小到大
                return i1 - i2;// return i2 - i1;
            }
        });

        System.out.println("==定制排序后的情况==");
        System.out.println(Arrays.toString(arr));

    }

    //使用冒泡完成排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组排序由 c.compare(arr[j], arr[j + 1])返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

