package mhm;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String rexiMessage = "rex come back for killing and eatting";
        return new ModelAndView("hellopage" , "rexxMessage" , rexiMessage);
    }
    @RequestMapping("/rexLogin")
    public ModelAndView loginpage(){
        String loginmessage = "welcome to login page mr rex";
        return new ModelAndView("loginpage","rexLoginMessage", loginmessage);
    }

    //this is for log in page
    @RequestMapping("/statuspage")
    public ModelAndView statusPage(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (password.equals("admin"))
        {
            String helloMessage = "welcome Mr rex to your home page";
            return new ModelAndView("statusPage","Message",helloMessage);
        }
        else
            {
                String errormessage = "it seems you are not Mr rex or you forget the pass";
                return new ModelAndView("statusPage","Message",errormessage);

            }

    }

}


