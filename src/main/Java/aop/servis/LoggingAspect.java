package aop.servis;

import aop.Book;
import aop.Person;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.GregorianCalendar;

@Aspect
@Component
public class LoggingAspect {

    @Before("aop.servis.Pointcuts.addBookPointcut()")
    public void beforeLoggingAddBookAdvice(JoinPoint joinPoint){
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder
                .append(new GregorianCalendar().getTime())
                .append(" calling method - ")
                .append(joinPoint.getSignature().toShortString())
                .append(" attempt add book " );

        Object[] arg = joinPoint.getArgs();
        for (Object o : arg) {
            if (o instanceof Book){
                Book book = (Book)o;
                stringBuilder
                        .append(book.getName()).append(" ")
                        .append(book.getAuthor()).append(" ")
                        .append(book.getDateOfPublication()).append(" ");

            }
            if (o instanceof Person){
                Person person = (Person)o;
                stringBuilder
                        .append("ID=").append(person.getId()).append(" ")
                        .append(person.getFirstName()).append(" ")
                        .append(person.getLastName()).append(" ")
                        .append(person.getAge()).append(" ");
            }
        }
        System.out.println(stringBuilder.toString());

    }
    @AfterReturning(pointcut = "aop.servis.Pointcuts.addBookPointcut()", returning = "book")
    public void afterLoggingAddBookAdvice(JoinPoint joinPoint,Book book){
        book.setAuthor("Petrov");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(new GregorianCalendar().getTime())
                .append(" calling method - ")
                .append(joinPoint.getSignature().toShortString())
                .append(" book was added");
        System.out.println(stringBuilder.toString());

    }

    public void afterThrowingAddBookAdvice(){

    }


}
