package orz.xuchao.model;


import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javafx.scene.Parent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@Builder
@JsonPropertyOrder(value = {"content","title"})
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "通用响应数据结构")
public class Article {
    @JsonIgnore
    private Long id;
    @JsonProperty("auther")
    private String author;
    @ApiModelProperty(value = "标题")
    private String title;
    private String content;
    //@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List reader;
}
