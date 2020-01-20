import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class FileDemo {
    public static void main(String[] args) {
        // 文件的分隔符 linux / windows
        System.out.println(File.separator); // => /
    }
    public void readFile() throws IOException {
        try (InputStream input = new FileInputStream("./Hello.class")) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        } // 编译器在此自动为我们写入finally并调用close()
    }
}
