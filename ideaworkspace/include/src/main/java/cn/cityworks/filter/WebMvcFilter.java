package cn.cityworks.filter;
import cn.cityworks.message.ApiMsgEnum;
import cn.cityworks.message.BaseReturnVO;
import com.alibaba.druid.util.StringUtils;
import org.springframework.stereotype.Component;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/*token过滤*/
@WebFilter(displayName = "WebMvcFilter")
@Component
public class WebMvcFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest=(HttpServletRequest) request;
        HttpServletResponse httpServletResponse=(HttpServletResponse)response;
        //编码问题  改成utf-8
        httpServletRequest.setCharacterEncoding("utf-8");
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("text/html;Charset=utf-8");
        /*判断是否有令牌*/
        String token=httpServletRequest.getHeader("access_token");
        String url=httpServletRequest.getRequestURI();
        System.out.println(token+url);
        if(token==null|| StringUtils.isEmpty(token)){//拦截
            PrintWriter printWriter=httpServletResponse.getWriter();
            printWriter.println((new BaseReturnVO(ApiMsgEnum.TONKEN_NULL)));
            printWriter.close();
            return;
        }//过滤*/
            chain.doFilter(httpServletRequest,httpServletResponse);

    }

    @Override
    public void destroy() {

    }
}
