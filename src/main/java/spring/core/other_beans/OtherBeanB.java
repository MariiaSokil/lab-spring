package spring.core.other_beans;

import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {

   public String getNameOfBean(String name) {
       return "Name of bean: "+ name;
   }
}
