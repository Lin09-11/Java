package Array;

/**
 * @author lin
 * @creat 2022--11--08 23:18
 */
public class ArrayAssign {

    public static void main(String[] args) {

//        基本数据类型赋值，赋值方式为值拷贝
//        n2的变化，不会影响n1的值
        int n1=10;
        int n2=n1;

        n2=80;
        System.out.println(n1);//10
        System.out.println(n2);//80

//        数组在默认情况下是引用传递，赋的是地址，赋值方式为引用传达
//        是一个地址,arr2变化影响arr1
        int[] arr1={1,2,3};
        int[] arr2=arr1;//把arr1赋值给arr2
        arr2[0]=10;

        System.out.println("==========arr1的值=============");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
