package orz.xuchao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
//@Slf4j 等同于private static  final Logger log= LoggerFactory.getLogger(LoggerFactory.class);
@Builder
@AllArgsConstructor
public class LombokPOJO {
    private  String name;
    private Integer age;
}
