/**
 * 基本的一个类
 * constructor 在 java 里  要写成 和类型一样的 Dog
 * 实例化的时候 : 类型 变量 = new 类名('参数')
 */
public class Dog {
    String name;
    String sex;
    public Dog(String name, String sex){
        this.name = name;
        this.sex = sex;
    }
    //    方法都是从 main 执行
    public static void main(String[] args){
        Dog dog = new Dog("二哈","男");
        dog.say();
    }
    public void say(){
        System.out.print("我是:" + name);
        System.out.print("性别:" + sex);
    }
}
