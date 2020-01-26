import java.text.*;
import java.util.*;

public class DateClass {
    public static void main(String[] args) {
        // 获取当前时间:
        Date date = new Date();
        System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));

        // 通过 Calendar 类 来获取时间
        Calendar c = Calendar.getInstance();

        // getTime 将 calendar 转成 date 类型
        System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
    }
}
