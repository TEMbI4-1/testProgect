package aop.servis;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* add*(..))")
    public void addBookPointcut(){

    }
}
