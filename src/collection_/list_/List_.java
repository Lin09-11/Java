package collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lin
 * @creat 2022--11--11:17
 */
public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1. List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复 [案例]
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println("list=" + list);
        //2. List集合中的每个元素都有其对应的顺序索引，即支持索引
        //   索引是从0开始的
        System.out.println(list.get(3));//hsp
        //3.List容器中的元素都对于一个整数类型的序号记载在其容器中的位置，可以根据序号取容器中的元素
    }
}

