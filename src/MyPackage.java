import module.Fn;

//如果 package 和 类 在同一级 可以不用 import 进来

/**
 * 实现接口 方法名 和 参数名 必须一致
 */
public class MyPackage implements Fn {
    private int num;

    @Override
    public void add (int num){
        this.num += num;
    }
    @Override
    public int sum (int a, int b){
        return this.num + a + b;
    }

    public static void main (String[] args) {
        MyPackage p = new MyPackage();
        p.add(1);
        int str = p.sum(1, 2);
        System.out.print(str);
    }
}
