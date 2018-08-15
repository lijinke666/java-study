import java.util.*;

public class ListArray {
    public static void main (String[] args){
        //<String> 表示泛形 告诉 数组 value 是什么 类型
        List<String> list = new ArrayList<String>();

        //相当于 js 的  [].push(xxx)

        list.add("李");
        list.add("金");
        list.add("珂");

        System.out.println(list);   // [李,金,珂]
        System.out.println(list.size());    // 3 => js list.length

//        for (int i=0; i<list.size(); i++){
//            System.out.print(list[i]);
//        }

        for( String str : list ){
            System.out.println(str);
        }
    }
}
