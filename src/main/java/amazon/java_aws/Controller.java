package amazon.java_aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/info")
public String getInfo(){

        return "This is a Spring Boot Application, uploded on aws by Jenkins!";
}


}
