package pl.org.hipisi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.context.annotation.ScopedProxyMode;


@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
	private List<CartItem> cartItems;
	
	public List<CartItem> getCartItems() {
		return cartItems;
	}

	Cart(){
		cartItems = new ArrayList<>();
	}
	
	void addToCart(CartItem item) {
		cartItems.add(item);
	}
	
	public String toString() {
		return cartItems.toString();
	}
}
