package spring.core.lab2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.AnnotationUtils;
import spring.core.lab2.beans2.BeanB;
import spring.core.lab2.beans2.BeanC;
import spring.core.lab2.beans2.BeanD;


@Configuration
@Import(PropertyConfig1.class)
@PropertySource("application.properties")
public class PropertyConfig2 {

    @Value("${beanB.name}")
    private String nameB;
    @Value("${beanB.value}")
    private int valueB;

    @Value("${beanC.name}")
    private String nameC;
    @Value("${beanC.value}")
    private int valueC;

    @Value("${beanD.name}")
    private String nameD;
    @Value("${beanD.value}")
    private int valueD;

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanD beanD() {
        return new BeanD(nameD, valueD);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanB beanB() {
        return new BeanB(nameB, valueB);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanC beanC() {
        return new BeanC(nameC, valueC);
    }

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return factory -> {
            String[] beans = factory.getBeanDefinitionNames();
            for(String b: beans){
                if ("beanB".equals(b)) {
                    Class<?> beanType = factory.getType(b);
                    Bean ws = AnnotationUtils.findAnnotation(beanType, Bean.class);
                    if (ws != null) {
                        System.out.println("");
                        //factory.registerSingleton(b, newWS);
                    }
                }
                System.out.println(b);
            }

        };
    }
//    @Bean
//    public BeanPostProcessor beanPostProcessor() {
//        return new MyBeanPostProcessor();
//    }
}
