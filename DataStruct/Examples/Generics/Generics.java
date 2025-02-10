import java.util.ArrayList;
import java.util.List;

/**
 * App to create & test method to find the maximal element in a range of a list. 
 * Tested with Lists of Strings, Integers & User defined object (U) 
*/

public class Generics {
 	
	List<String> stringList = new ArrayList<>();
	List<Integer> integerList = new ArrayList<>();
	List<U> userDefinedTypeList = new ArrayList<>();

	public static void main(String[] args) {

		Generics genericsInstance = new Generics();

		genericsInstance.loadErUp();
		genericsInstance.testGenericMaxStuff();

	}
	 
	private void testGenericMaxStuff() {

		/*
		*	EXPECTED OUTPUT
		*
		*	String List Result: zeowl
		*	Integer List Result: 10000
		*	User Defined Struct Result: sally, 103
		*
		*/

		String stringListMax = max(stringList, 0, stringList.size());
		Integer integerListMax = max(integerList, 0, integerList.size());
		U userDefinedStructMax = max(userDefinedTypeList, 0, userDefinedTypeList.size());

		System.out.println("String List Result: " + stringListMax);

		System.out.println("Integer List Result: " + integerListMax);

		System.out.printf("User Defined Struct Result: %s, %d\n", userDefinedStructMax.getName(), userDefinedStructMax.getAge());
		 
 	}
	 	
	public static <T extends Comparable<T>> T max(List<T> list2, int begin, int end) {
		
		T foundMax = null; // init max as null, will be type of whatever is in the list

		for (int i = begin; i < end; i++) { // Loop through all items in the list using provided sizes
			
			if (foundMax == null) {

				// since no max, we set whatever the first element is as the max
				
				foundMax = list2.get(i);
				
			} else {
				
				T currentElement = list2.get(i);
				
				if (currentElement.compareTo(foundMax) > 0) { // result of T.compareTo is 1 if currentElement is greater than max
					
					foundMax = currentElement; // if so, set max to currentElement
					
				}
				
			}
			
		}
		
		return foundMax;
		
 	}
 
	private void loadErUp(){

		// load a list of strings

		stringList.add("meowl");
		stringList.add("yowl");
		stringList.add("zeowl");
		stringList.add("bear");
		stringList.add("reel");
		stringList.add("gobblygook");
		
		integerList.add(3);
		integerList.add(2);
		integerList.add(44);
		integerList.add(222);
		integerList.add(10000);
		integerList.add(12);
	
		userDefinedTypeList.add(new U("rob", 49));
		userDefinedTypeList.add(new U("sally", 103));
		userDefinedTypeList.add(new U("tim", 6));
		userDefinedTypeList.add(new U("marty", 37));
		userDefinedTypeList.add(new U("pete", 21));

	}
}	
 
class U implements Comparable<U> {

	String name;
	Integer age;

	public String getName() {

		return name;

	}

	public Integer getAge() {

		return age;

	}

	public U(String name, Integer age) {

		this.name = name;
		this.age = age;

	}

	@Override
	public int compareTo(U u) {

		return this.age.compareTo(u.getAge());

	}

}