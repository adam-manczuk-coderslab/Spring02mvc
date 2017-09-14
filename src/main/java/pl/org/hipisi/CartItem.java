/**
 * 
 */
package pl.org.hipisi;

/**
 * @author beret
 *
 */
public class CartItem {
	
	CartItem(int quantity, Product product){
		this.quantity = quantity;
		this.product = product;
	}
	
	int quantity;
	Product product;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
