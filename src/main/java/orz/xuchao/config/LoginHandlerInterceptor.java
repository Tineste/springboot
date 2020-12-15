package orz.xuchao.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object object=request.getSession().getAttribute("loginUser");
        if(null==object){
            request.getAttribute("msg");
            request.setAttribute("msg","没有权限，请先登陆2222");
            request.getRequestDispatcher("/login.html").forward(request, response);
            return  false;
        }else{
            return  true;
        }
    }
}
