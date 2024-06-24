package cg.codegym.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Logger {

//    @AfterThrowing(pointcut = "execution(public * cg.codegym.service.CustomerService.findAll(..))", throwing = "e")
//    public void logMethod(Exception e) {
//        System.out.println("[CMS] co loi xay ra: " + e.getMessage());
//    }
//
    @AfterThrowing(pointcut = "execution(public * cg.codegym.service.CustomerService.*(..))", throwing = "e")
    public void logClass(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.printf("[CMS] co loi xay ra: %s.%s%s: %s%n", className, method, args, e.getMessage());
    }

//    @Before("showListPointCut()")
//    public void loggingTest() {
//        System.out.println("test logger");
//    }
//
//
//    @Pointcut("execution(* cg.codegym.controller.CustomerController.showList())")
//    public void showListPointCut() {
//    }

    @Before("execution(* cg.codegym.controller.CustomerController.*(..))")
    public void testAll(JoinPoint joinPoint) {
        System.out.println("all method " + joinPoint.getTarget().getClass().getSimpleName());
        System.out.println(joinPoint.getSignature().getName());
    }

    @Pointcut("execution(* cg.codegym.controller.CustomerController..*.*(..))")
    public void allMethod() {
    }
    public String test(){
        return "test";
    }
}
