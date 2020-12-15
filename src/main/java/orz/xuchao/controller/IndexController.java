package orz.xuchao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/"})
    public  String test(){
        return "redirect:/login.html";
    }

}
