import java.io.IOException;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("输入任ddddddddddddddd意按键退出 ~ ");

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"ServiceProvider.xml"});
            context.start();

            System.out.println("输入任意按键退出 ~ ");
            System.in.read();
            context.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
