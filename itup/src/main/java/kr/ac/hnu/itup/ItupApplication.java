package kr.ac.hnu.itup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@SpringBootApplication
// @ImportResource("classpath:root-context.xml")
public class ItupApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ItupApplication.class, args);
		Restaurent restaurent = context.getBean("restaurent", Restaurent.class);
		log.info("restaurant: {}", restaurent);

		Chef chef = context.getBean("chef", Chef.class);
		Ingredient ingredient = chef.prepare();

		Food food = chef.cook(ingredient);
		log.info("food: {}", food);

	}

}
