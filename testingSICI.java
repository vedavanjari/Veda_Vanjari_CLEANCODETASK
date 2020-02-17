
public class testingSICI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleandcompund cs = new simpleandcompund();
		System.out.println("Simple Interest is : " + cs.findSimpleInterest(1000,2,5));
		System.out.println("Compound Interest yearly is : " + cs.findCompoundInterest(1500,2,5,true));
		System.out.println("Compound Interest half yearly is : " + cs.findCompoundInterest(1600,3,4,false));
		

	}

}
