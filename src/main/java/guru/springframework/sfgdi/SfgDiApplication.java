package guru.springframework.sfgdi;

import guru.springframework.sfgdi.beans.FakeDataSource;
import guru.springframework.sfgdi.beans.FakeJmsBroker;
import guru.springframework.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru"}) //Scan directory guru
public class SfgDiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        System.out.println("--- Primary");
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

        System.out.println("--- Profiles");
        var i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println("i18nController.stayGreeting() = " + i18nController.sayGreetings());


        var fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("fakeDataSource.getUsername() = " + fakeDataSource.getUsername());
        System.out.println("fakeDataSource.getPassword() = " + fakeDataSource.getPassword());
        System.out.println("fakeDataSource.getUrl() = " + fakeDataSource.getUrl());


        var fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println("fakeJmBroker.getUsername() = " + fakeJmsBroker.getUsername());
        System.out.println("fakeJmBroker.getPassword() = " + fakeJmsBroker.getPassword());
        System.out.println("fakeJmBroker.getUrl() = " + fakeJmsBroker.getUrl());


    }

}
