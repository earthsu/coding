package kr.ac.hnu.itup.aop;

import org.springframework.stereotype.Component;

@Component
public class RecursiveFuction implements Calculator {
    @Override
    public long factorial(int n) {

        if(n == 1){
            return 1;
        }

        return factorial(n-1)*n;
    }
}
