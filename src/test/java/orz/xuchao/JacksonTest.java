package orz.xuchao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import orz.xuchao.model.Article;
import orz.xuchao.model.Reader;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JacksonTest {

    @Test
    void testJackson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
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

        String json= mapper.writeValueAsString(article);

        System.out.println(json);

        Article article1=mapper.readValue(json,Article.class);
        System.out.println(article1.toString());

    }


}

