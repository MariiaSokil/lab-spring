package spring.core.lab1.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.core.lab1.beans3.BeanE;

@Configuration
@ComponentScan(basePackages = {"spring.core.lab1.beans2", "spring.core.lab1.beans3"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, value= BeanE.class)})
public class AppConfig2 {


}
