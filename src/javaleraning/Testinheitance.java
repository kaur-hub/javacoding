package javaleraning;

public class Testinheitance {

	public static void main(String[] args) {
		WellsFargo w=new WellsFargo();
		System.out.println("Wells Fargo rate of  interest:" +w.rateOfInterest());
		BankofAmerica b=new BankofAmerica();
		System.out.println("Bank of America rate of interest: "+b.rateOfInterest());
	

	}

}
