package openclose;
import java.util.Random;

interface CustomerProfile{
	public boolean isLoyalCustomer();
}

class HealthInsuranceCustomerProfile implements CustomerProfile{
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
}
class HomeInsuranceCustomerProfile implements CustomerProfile{
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
}

class InsurancePremiumDiscountCalculator{
	public int calculatePremiumDiscountPercent(CustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}else {
			return 0;
		}
	}
}

public class FollowOCP {
	public static void main(String[] args) {
		InsurancePremiumDiscountCalculator obj=new InsurancePremiumDiscountCalculator();
		System.out.println(obj.calculatePremiumDiscountPercent(new HealthInsuranceCustomerProfile()));
		// here if we add vehicle insurance we don't have to modify anything in main code
		System.out.println(obj.calculatePremiumDiscountPercent(new VehicleInsuranceCustomerProfile()));
	}
}

// example adding extension
class VehicleInsuranceCustomerProfile implements CustomerProfile{
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
}

