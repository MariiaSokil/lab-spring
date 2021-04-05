package spring.core.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.core.beans3.BeanE;

@Configuration
@ComponentScan(basePackages = {"spring.core.beans2", "spring.core.beans3"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, value= BeanE.class)})
public class AppConfig2 {


}
