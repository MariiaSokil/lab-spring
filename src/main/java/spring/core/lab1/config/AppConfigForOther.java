package spring.core.lab1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring.core.lab1.other_beans", "spring.core.lab1.injection"})
public class AppConfigForOther {


}
