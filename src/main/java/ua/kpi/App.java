package ua.kpi;

import java.util.concurrent.locks.ReentrantLock;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kpi.controller.Controller;
import ua.kpi.view.View;
import ua.kpi.view.Viewable;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
    Viewable view = ctx.getBean("view", Viewable.class);
    Controller controller = ctx
        .getBean("controller", Controller.class);//new Controller( System.in , view );
    controller.processUser();

  }
}
