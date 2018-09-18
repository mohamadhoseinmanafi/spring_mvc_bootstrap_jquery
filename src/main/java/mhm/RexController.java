package mhm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RexController {
    @RequestMapping("/mhrex")
    public ModelAndView helloMHrex(){
        String message = "next genaration of rex is comming";
        return new ModelAndView("helloMHrex","message",message);
    }

}
