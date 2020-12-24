package bean_tests;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import javax.management.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Component
public class PostInitAnnotationBeanPostProcessor implements BeanPostProcessor {






    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();


        for (Field field : fields) {
            PostInit annotation = field.getAnnotation(PostInit.class);
            if (annotation != null) {
                int i = annotation.i();
                field.setAccessible(true);
                ReflectionUtils.setField(field, bean, i * 3);
                System.out.println("for BPP");
            }
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
