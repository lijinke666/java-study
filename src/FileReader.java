/**
 * 读取文件目录
 */

import java.io.File;

public class FileReader {
    public static void main (String[] args) {
        String dirname = "/src";
        File file = new File(dirname);
        if ( file.isDirectory() ) {
            //申明一个 字符串类型的数组
            String list[] = file.list();    //提取当前文件夹包含的文件和文件列表
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i]);
            }
        } else {
            System.out.print(dirname + " 不是一个目录");
        }
    }
}
