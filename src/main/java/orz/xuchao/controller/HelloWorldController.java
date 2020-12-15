package orz.xuchao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import orz.xuchao.model.LombokPOJO;

@RestController
@Slf4j
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    public String hello(String name){
        log.info("aaaaaa");
        LombokPOJO lombokPOJO=LombokPOJO.builder()
                .name("张三").age(4).build();

        StringBuilder stringBuilder = new StringBuilder(); return "hello wordtgddsgdsfrwdfs-"+name+"--"+lombokPOJO.getName();
    }
}
