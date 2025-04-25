package BusFare;
 

public class BusFareTester {

	public static void main(String[] args) {
		
		BusFareHandler busFare = new BusFareHandlerImpl();
		
		testBusFareHandler(busFare);

	}
	
	private static void testBusFareHandler (BusFareHandler fare) {
	
		System.out.println("You wanna ride the bus?  Exact change only! \n");		
		
		fare.grabChange();
		int initialCoin = fare.getMaxFromHeap();	
		
		System.out.println("\nExact Fare paid: " + fare.payBusFare(initialCoin) + " cents ");		
	
	}

}
