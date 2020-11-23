package orz.xuchao;

import javafx.beans.binding.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import orz.xuchao.controller.ArticleController;
import orz.xuchao.service.ArticleService;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j

@SpringBootTest //加载springboot上下文环境
@ExtendWith(SpringExtension.class) //加上运行时的容器环境实现依赖注入
@AutoConfigureMockMvc  //自动注入
public class ArticleRestControllerTest {

    @Resource
    private MockMvc mockMvc;


    //模拟的存在写完了
    @MockBean
    private ArticleService articleService;

    //有了 @AutoConfigureMockMvc 这个注解就不需要初始化了
    //private static MockMvc mockMvc;
    //@BeforeAll
    //static void setUP(){
    //    mockMvc= MockMvcBuilders.standaloneSetup(new ArticleController()).build();
    //}

    @Test
    public void saveArticle() throws Exception {
        String article="{\"content\":\"fdsdfdsafsf\",\"title\":\"first\",\"auther\":\"vccc\",\"createTime\":1602750661491,\"reader\":[{\"age\":12,\"name\":\"aa\"},{\"age\":13,\"name\":\"bb\"}]}\n";


        //when(articleService.saveArticle(article)).thenReturn("ok");

        MvcResult mvcResult=mockMvc.perform(
                MockMvcRequestBuilders.request(HttpMethod.POST,"/articles")
                        .contentType("application/json")
                        .content(article))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.auther").value("vccc"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.reader[0].age").value(12))
                .andDo(print()).andReturn();
        mvcResult.getResponse().setCharacterEncoding("UTF-8");
        log.info(mvcResult.getResponse().getContentAsString());
    }

}
