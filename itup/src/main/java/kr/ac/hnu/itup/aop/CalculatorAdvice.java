package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component // Config 에서 => 내가 만든거 아니면 Bean으로 만들고 ,, 내가 만들고 수정 가능하면 Component 사용가능
public class CalculatorAdvice {
    @Around("execution(* kr..*.factorial(..))")
    public Object calculate(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();

        Object proceed = joinPoint.proceed(); // 우리가 원하는 factorial()을 호출해주는 것

        long end = System.nanoTime();

        log.info("걸린 시간: {} ns", end-start);
        return proceed;
    }
}
