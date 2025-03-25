package Classwork.Examples.Ex6;

class ComparableThing implements Comparable<ComparableThing>{

	String name;
	Integer age; 
	
	public String getName(){
		return name;
	}

	public Integer getAge(){ 
		return age;
	}

	public ComparableThing(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
		
	@Override
	//Compares this object with the specified object for order. 
	//Returns a negative integer, zero, or a positive integer as 
	//this object is less than, equal to, or greater than the specified object.
	
	//equals in our world is age is ==
	public int compareTo(ComparableThing u) {
        return this.age.compareTo(u.getAge()); 
	}
}