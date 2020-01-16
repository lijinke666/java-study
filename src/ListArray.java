import java.util.*;

public class ListArray {
    public static void main (String[] args){
        //<String> 表示泛形 告诉 数组 value 是什么 类型
        List<String> list = new ArrayList<>();

        //相当于 js 的  [].push(xxx)

        list.add("李");
        list.add("金");
        list.add("珂");

        System.out.println(list);   // [李,金,珂]
        System.out.println(list.size());    // 3 => js list.length

        // 普通遍历
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }

        // 迭代器 速度更快
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

        // for each 本身支持 迭代器 所以可以简写为
        for( String str : list ){
            System.out.println(str);
        }

        // List => Array
        String[] array = list.toArray(new String[list.size()]);

        // 这种函数式写法要报错?
//        String[] array2 = list.toArray(String[]::new);

        // Array => List
        Integer[] arr = {1,2,3};
//        List<Integer> list2 = List.of(arr);
    }
}
