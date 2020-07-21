package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        var myController = (MyController) ctx.getBean("myController");
        var greetings = myController.sayHello();
        System.out.println("greetings = " + greetings);

        System.out.println("--- Property");
        var propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("propertyInjectedController.sayGreeting() = " + propertyInjectedController.sayGreeting());
        System.out.println("--- Setter");
        var setterIjectedControoler = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println("setterIjectedControoler.sayGreeting() = " + setterIjectedControoler.sayGreeting());
        System.out.println("--- Constructor");
        var constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println("constructorInjectedController.sayGreeting() = " + constructorInjectedController.sayGreeting());
    }

}
