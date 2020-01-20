import java.util.*;

public class Collection {

    public static void main(String[] args) {
        // 有序列表的集合
        List<String> list = new ArrayList<>();

        // 没有重复元素的集合, js es6 也实现了这种数据结构
        Set<String> set = new HashSet<>();

        // 键值对的集合
        Map<String, String> map = new HashMap<>();

        map.put("key","value");

        // 队列
        Queue<String> q = new LinkedList<>();

        // 入队
        q.offer("测试 1");
        q.offer("测试 2");

        // 出队
        q.poll();
    }
}
