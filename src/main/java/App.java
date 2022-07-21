import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catFirst = (Cat) applicationContext.getBean("cat");
        Cat catSecond = (Cat) applicationContext.getBean("cat");

        System.out.println("HelloWord - " + (beanOne == beanTwo));
        System.out.println("Cat - " + (catFirst == catSecond));

        //System.out.println(beanOne.getMessage());
    }
}