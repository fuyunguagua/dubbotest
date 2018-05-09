import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "cusumer.xml" });
        context.start();
        DemoService service = (DemoService) context.getBean("demoService");
        System.out.println(service.sayHello("world"));
        context.close();
    }
}
