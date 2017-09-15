package pl.org.hipisi;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("cart")
@Controller
public class CartController {
	
	@Autowired
	Cart cart;
	
	
	@RequestMapping("/addtocart")
//	@ResponseBody
	public String addtocart(Model model, HttpSession ses) {
	        Random rand = new Random();
	        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
	        model.addAttribute("cart", cart);
	        return "addtocart";
	}

}
