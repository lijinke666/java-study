/**
 * java 中的 修饰符
 * 访问修饰符
 * 非访问修饰符
 */
public class Modifier {
    /**
     * 默认访问修饰符 不适用任何关键字
     * 变量隐式声明 public static final
     * 方法隐式声明  public
     */

    /**
     * main 最先执行 有先后顺序 如果 不加  static version 此时  Modifier 还没有实例化 所以拿不到
     */
    static String version = "0.0.1";

    public static void main (String[] args) {
        My name = new My();
        String _name = name.getName();
        System.out.print(_name);
        System.out.print(version);
    }

    public static class My {
        /**
         * private 私有 当前类可以访问
         */
        private String name = "李金珂";
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}



