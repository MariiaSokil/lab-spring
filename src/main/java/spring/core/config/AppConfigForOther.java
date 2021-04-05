package spring.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring.core.other_beans", "spring.core.injection"})
public class AppConfigForOther {


}
