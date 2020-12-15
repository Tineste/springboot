package orz.xuchao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestHtmlController {

    @RequestMapping("/test")
    public  String test(Model model){
        model.addAttribute("msg","FFFFFF");
        return "test";
    }

}



