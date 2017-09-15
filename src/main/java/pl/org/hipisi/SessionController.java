package pl.org.hipisi;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("loginStart")
public class SessionController {
	@RequestMapping("/login")
	@ResponseBody
	public String loginStart(Model model, HttpSession sess) {
		String login = (String)sess.getAttribute("loginStart");
		if(login == null) {
			login = "biezaca data i godzina...";
		}
		return "login: " + login;
	}
}
