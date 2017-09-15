package pl.org.hipisi;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CookieController {
	
	@RequestMapping("/set/{cookieVal}")
	@ResponseBody
	public String setCookie(@PathVariable String cookieVal, HttpServletResponse response) {
		Cookie cookie = new Cookie("cookie", cookieVal);
		cookie.setPath("/");
		response.addCookie(cookie);
		return "Cookie has been set";
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public String getCookie(@CookieValue String cookie) {
		return cookie;
	}
	
}
