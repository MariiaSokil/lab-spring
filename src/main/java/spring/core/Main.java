package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.config.AppConfig1;
import spring.core.config.AppConfig2;
import spring.core.config.AppConfigForOther;
import spring.core.config.AppConfigInterfaceBean;
import spring.core.injection.InjectedOtherBeanA;
import spring.core.injection.InjectedOtherBeanB;
import spring.core.injection.InjectedOtherBeanC;
import spring.core.interface_beans.Animal;
import spring.core.interface_beans.AnimalContainerBean;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig1.class);
        for (String beanNames : ctx1.getBeanDefinitionNames()) {
            System.out.println(beanNames);
        }
        System.out.println("___________________________________");

        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        for (String beanNames : ctx2.getBeanDefinitionNames()) {
            System.out.println(beanNames);
        }
        System.out.println("___________________________________");

        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(AppConfigForOther.class);
        InjectedOtherBeanA injBeanA = ctx3.getBean(InjectedOtherBeanA.class);
        injBeanA.showName();

        System.out.println("___________________________________");
        ApplicationContext ctx4 = new AnnotationConfigApplicationContext(AppConfigForOther.class);
        InjectedOtherBeanB injBeanB = ctx4.getBean(InjectedOtherBeanB.class);
        injBeanB.showName();

        System.out.println("___________________________________");
        ApplicationContext ctx5 = new AnnotationConfigApplicationContext(AppConfigForOther.class);
        InjectedOtherBeanC injBeanC = ctx5.getBean(InjectedOtherBeanC.class);
        injBeanC.showName();

        System.out.println("___________________________________");
        System.out.println("The first must be a leopard, after a lion, a tiger, a panther");

        ApplicationContext ctxAnimalByOrder = new AnnotationConfigApplicationContext(AppConfigInterfaceBean.class);
        ctxAnimalByOrder.getBean(AnimalContainerBean.class).printAnimal();

        System.out.println("___________________________________");

        ApplicationContext ctxAnimalMain = new AnnotationConfigApplicationContext(AppConfigInterfaceBean.class);
        Animal bean = ctxAnimalMain.getBean(Animal.class);
        System.out.println(bean.getAnimalName());

    }
}
