import java.lang.annotation.*;

// 自定义注解
@Target({ElementType.METHOD, ElementType.FIELD}) // 描述应用范围
@Retention(RetentionPolicy.RUNTIME)  // 注解的生命周期
public @interface MyDecortar {
    String name() default "ljk";
    int age() default 18;
}
