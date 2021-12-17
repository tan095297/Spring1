package nvc.it.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ControllerTest1 {
    
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    @ResponseBody 
    public String index(){
        return "Chaermchai Sarapee 63309010003" ;
    }

    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return "Chalermchai Sarapee" ;
    }

    @RequestMapping("/aboutme")
    @ResponseBody
    public String aboutme(){
        return "my name is Tan" ;
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String contact(){
        return "0952974592 94" ;
    }


}
