package kr.ac.hnu.itup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class RestaurantConfig {
    @Bean
    public Restaurent restaurant() {
        Restaurent restaurent = new Restaurent();
        restaurent.setName("미소천국");
        restaurent.setAddress("대전광역시 동구");
        restaurent.setPhone("042-222-3333");
        restaurent.setChef(chef());
        return restaurent;
    }

    @Bean
    public Chef chef(){
        Chef chef = new Chef();
        chef.setName("백종원");
        chef.setAge(57);
        return chef;
    }
}
