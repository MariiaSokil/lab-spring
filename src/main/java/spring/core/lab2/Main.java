package spring.core.lab2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.core.lab2.config.PropertyConfig2;


public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig2.class);
      String[] components = ctx.getBeanDefinitionNames();
        for (String bean : components)
            System.out.println(bean);
     //   BeanF lazyBeanF= ctx.getBean(BeanF.class);
        ctx.registerShutdownHook();



    }




}
