package cn.lwy.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器
 */
@Controller
public class WebHandlerInterceptor implements HandlerInterceptor{

	@Value("${COOKIE.HRNAME}")
	private String hrname;
	
	@Value("${COOKIE.CNAME}")
	private String cname;
	
	@Value("${SESSION.USER}")
	private String sessionUser;

	//该方法在目标方法之前被调用
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		if(uri.matches("^/wx.*")) {//微信端
			System.out.println("微信端");
			return true;//测试使用true，上线更改
		}else {//web端
			if(request.getSession().getAttribute(sessionUser) != null) {//存在session,已登录
				return true;
			}else {//没登录
				response.sendRedirect("/web/login");
				return false;
			}
		}
	}
	
	
	
	//调用目标方法之后，但渲染视图之前被调用
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	
	//渲染视图之后被调用
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}




////过滤第一个/
//int firstIndex = uri.substring(1).indexOf('/')+1;
//int secondIndex = uri.indexOf('/', firstIndex)+1;
////获取过滤后的第一个/后的内容，为判断是web端还是微信端
//String brwNname = uri.substring(1, uri.substring(1).indexOf('/')+1);
////获取过滤后的第二个/后的内容，为判断是否是登录页面
//String login = uri.substring(secondIndex);
//StringBuilder pre = new StringBuilder();
//if("wx".equals(brwNname)) {//微信端
//	pre.append("/wx/");
//}else {//web端
//	pre.append("/web/");
//}
//if(login != null && "login".equals(login)) {//如果登录直接放行
//	return true;
//}

//uri.indexOf("");
//已登录
//if(request.getSession().getAttribute(sessionUserName) != null) {
//	return true;
//}
////跳转到登录页面
//
//return false;