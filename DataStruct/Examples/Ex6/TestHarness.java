package Examples.Ex6;

public class TestHarness {

	public static void main(String[] args) {
		TEST_Generic();
		
		TEST_ComparableGeneric();
		

	}

	public static void TEST_Generic() {
		System.out.println("Thing 1 - i'm a String: ");

		Thing<String> thing1 = new Thing<>("silly thing");
		thing1.display();

		Thing<Integer> thing2 = new Thing<>(144);
		System.out.println("Thing 2 - i'm an Integer: ");
		thing2.display();

	}
	
	public static void TEST_ComparableGeneric() {
	
		ComparableThing  thing1 = new ComparableThing("hoss",33);
		ComparableThing  thing2 = new ComparableThing("boss",43);
		ComparableThing  thing3 = new ComparableThing("sauss",43);
		
		if(thing1.compareTo(thing3)==0)
			System.out.println("thing1 & thing3 equal");
		else
			System.out.println("thing1 & thing3 not equal");
		
		if(thing2.compareTo(thing3)==0)
			System.out.println("thing2 & thing3 equal");
		else
			System.out.println("thing2 & thing3 not equal");
		
		
		
	}
	
}
