import java.text.*;
import java.util.*;

public class DateClass {
    public static void main(String[] args) {
        // 获取当前时间:
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
