package liskovSubstitution;
import java.util.ArrayList;
import java.util.List;

class Product {
	protected double discount = 20;

	public double getDiscount() {
		return discount;
	}
}

class InHouseProduct extends Product {
	public void applyExtraDiscount() {
		discount = discount * 1.5;
	}

}

public class NotFollow {
// here we are not following LSP because we are asking instance and type casting it
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new InHouseProduct();

		List<Product> productList = new ArrayList<>();

		productList.add(p1);

		productList.add(p2);

		productList.add(p3);

		for (Product product : productList) {
			if (product instanceof InHouseProduct) {
				((InHouseProduct) product).applyExtraDiscount();
			}
			System.out.println(product.getDiscount());
		}
	}
}
