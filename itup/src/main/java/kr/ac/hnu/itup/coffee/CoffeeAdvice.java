package kr.ac.hnu.itup.coffee;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Slf4j
public class CoffeeAdvice {

    @Before("execution(* kr..*.brew(..))") //"" 안에 어떠한 메소드가 실행되기 전인지 넣어줘야함 * = 모든값 / .. = 패키지 안에 있는 모든 값
    public void grind(){
        log.info("원두를 갈아줍니다.");  //proxy
    }

    @After("execution(* kr..*.brew(..))")
    public void putCoffeeInACup(){
        log.info("커피를 컵에 담아줍니다.");
    }
}
