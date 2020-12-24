package bean_tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.management.*;
import java.lang.management.ManagementFactory;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws InterruptedException, MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
         Controller controller = new Controller();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        server.registerMBean(controller,new ObjectName("Config_Java","name","enable"));


        while (true) {
            if (controller.enable){
                System.out.println("enable");
            }

            Thread.sleep(100);
            Person person = context.getBean("person",Person.class);
            person.callPet();
            person.getPet();


        }

    }
}
