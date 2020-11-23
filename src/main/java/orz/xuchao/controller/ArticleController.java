package orz.xuchao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import orz.xuchao.AjaxResponse;
import orz.xuchao.model.Article;
import orz.xuchao.model.Reader;
import orz.xuchao.service.ArticleService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleController {


    //@Resource
    //ArticleService articleService;


    @RequestMapping(value = "/articles/{id}",method = RequestMethod.GET)
    //@GetMapping("/articles/{id}")  和上面的一样
    public AjaxResponse getArticle(@PathVariable("id") Long id){

        List<Reader> readers=new ArrayList<Reader>(){{
            add(new Reader(12, "aa"));
            add(new Reader(13, "bb"));
        }};
        Article article=Article.builder()
                .id(2L)
                .author("vccc")
                .content("fdsdfdsafsf")
                .createTime(new Date())
                .reader(readers)
                .title("first").build();
        log.info("article:"+article);
        return  AjaxResponse.success(article);
    }


    @RequestMapping(value = "/articles",method = RequestMethod.POST)
    public AjaxResponse saveArticles(@RequestBody Article article){
        log.info("saveArticle:"+ article);
        return AjaxResponse.success(article);
        //return AjaxResponse.success(articleService.saveArticle(article));
    }
}
