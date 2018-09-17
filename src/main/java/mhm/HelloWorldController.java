package mhm;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public ModelAndView helloworld(){
        String message = "hello mr rex welcome to spring mvc world";
        String rexMessage = "rex come back for killing and eatting";
        return new ModelAndView("hellopage" , "message" , message );
    }

    @RequestMapping("/hellorex")
    public ModelAndView helloworldd(){
        String rexMessage = "rex come back for killing and eatting";
        return new ModelAndView("hellopage" , "rexMessage" , rexMessage);
    }



}


