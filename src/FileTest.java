//导入 io 相关的模块
// const fs = require('fs')
import java.io.*;

/**
 * 可读流 和 可写
 */
public class FileTest {
    public static void main (String[] args) {
        try {
            File file = new File("Hello.java");
            FileOutputStream fop = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");

            writer.append("test");
            writer.close();
            fop.close();
        } catch (IOException e) {
            System.out.print("异常");
        }
    }
}
