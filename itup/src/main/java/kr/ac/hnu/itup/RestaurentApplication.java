package kr.ac.hnu.itup;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
@Slf4j
public class RestaurentApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
        context = new AnnotationConfigApplicationContext();

        Restaurent restaurent = context.getBean("restaurant", Restaurent.class);
        log.info("restaurant: {}", restaurent);

    }


}
