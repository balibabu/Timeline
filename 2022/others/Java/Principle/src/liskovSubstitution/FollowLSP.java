package liskovSubstitution;

import java.util.ArrayList;
import java.util.List;

class Product1 {
	protected double discount = 20;
	public double getDiscount() {
		return discount;
	}
}

class InHouseProduct1 extends Product1 {
	@Override
	public double getDiscount() {
		this.applyExtraDiscount();
		return discount;
	}
	public void applyExtraDiscount() {
		discount = discount * 1.5;
	}
}

public class FollowLSP {
// here we are not asking the type of object
	public static void main(String[] args) {
		Product1 p1 = new Product1();
		Product1 p2 = new Product1();
		Product1 p3 = new InHouseProduct1();

		List<Product1> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);

		for (Product1 product : productList) {
			System.out.println(product.getDiscount());
		}

	}

}
