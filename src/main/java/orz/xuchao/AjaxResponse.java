package orz.xuchao;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ApiModel(value = "通用响应数据结构")
public class AjaxResponse {

    @ApiModelProperty(value = "请求是否成功")
    private boolean isok;
    @ApiModelProperty(value = "请求响应状态码",example = "200,400,500")
    private int code;
    private String message;
    private Object data;

    public static  AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse=AjaxResponse.builder()
                .isok(true)
                .code(200)
                .message("请求成功")
                .data(obj)
                .build();
        return  ajaxResponse;
    }
    public static  AjaxResponse success(Object obj,String message){
        AjaxResponse ajaxResponse=AjaxResponse.builder()
                .isok(true)
                .code(200)
                .message(message)
                .data(obj)
                .build();
        return  ajaxResponse;
    }

}
