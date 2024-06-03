package kr.ac.hnu.itup.aop;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class ForLoopTest {

    @Test

    void factorial() {
        ForLoop forLoop = new ForLoop();
        long factorial = forLoop.factorial(5);
        System.out.println(factorial);
        log.info("factorial: {}", factorial); // test에서는 lombok인 @Slf4j 사용 불가. 일일히 import 하고 private ~~ 해줘야함
        // lombok 쓰고싶으면 gradle가서 수정.

    }
}