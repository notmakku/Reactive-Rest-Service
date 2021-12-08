package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(Application.class, args);
        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        System.out.println(">>message = " + greetingClient.getMessage().block());
    }
}
