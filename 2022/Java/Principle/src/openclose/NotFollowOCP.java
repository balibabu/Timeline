//package openclose;
//
//import java.util.Random;
//
//public class NotFollowOCP {
////	here for every insurance we are adding we are modifying the original code
////	so it is not following open close principle
//}
//
//class InsurancePremiumDiscountCalculator{
//	public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer) {
//		if(customer.isLoyalCustomer()) {
//			return 20;
//		}else {
//			return 0;
//		}
//	}
//	public int calculatePremiumDiscountPercent(HomeInsuranceCustomerProfile customer) {
//		if(customer.isLoyalCustomer()) {
//			return 20;
//		}else {
//			return 0;
//		}
//	}
//	
//}
//
//class HealthInsuranceCustomerProfile{
//	public boolean isLoyalCustomer() {
//		return new Random().nextBoolean();
//	}
//}
//class HomeInsuranceCustomerProfile{
//	public boolean isLoyalCustomer() {
//		return new Random().nextBoolean();
//	}
//}