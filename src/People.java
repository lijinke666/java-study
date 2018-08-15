/**
 * 基类
 */

public class People {
    private String name;
    private int age;
    /**
     * 构造器
     */
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void say (){
        System.out.print("我是:"+ this.name);
        System.out.print("今年:"+ this.age);
    }
}

class Boy extends People{
    Boy(){
        super("男生",18);
        super.say();   //调用父类的方法
    }
    public static void main (String [] args){
        Boy boy = new Boy();
        boy.say();
    }
}

/**
 * 多继承
 */

interface React {
    public void setState();
    public void componentDidMount();
}

interface  Vue {
    public void mouted();
}

class Ljk implements React,Vue {
    public static void main (String[] args){
        Ljk my = new Ljk();
        my.componentDidMount();
    }

    @Override
    public void componentDidMount() {
        System.out.print("componentDidMount()");
    }

    @Override
    public void mouted() {

    }

    @Override
    public void setState() {

    }
}



