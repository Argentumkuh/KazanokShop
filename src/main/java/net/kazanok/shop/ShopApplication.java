package net.kazanok.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShopApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ShopApplication.class, args);
        System.out.println("Inspecting created beans:");
        String[] beans = context.getBeanDefinitionNames();
        for (String bean: beans) {
            System.out.println(bean);
        }
    }
}
