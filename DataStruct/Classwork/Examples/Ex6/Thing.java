package Classwork.Examples.Ex6;

public class Thing<T> {

	T firstThing;

	public Thing(T thing) {
		firstThing = thing;

	}

	public void display() {
		System.out.println("This thing: " + firstThing);
	}

}
