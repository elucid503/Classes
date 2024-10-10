package Class12Practice;

public class Car {

    //1: Create a String field 'model'

    String model;

    public static void main(String[] args) {

        // 2: Create Object 'car1' : Assigned to a new Car object

        Car car1 = new Car();

        // 3: Create object 'car2' and make it 'null'

        Car car2 = null;

        // 4: Compare the object 'car1' with null

        if (car1 == null) {

            System.out.println("Car1 is null.");

        } else {

            System.out.println("Car1 is not null");

        }

        // 5: Compare the object 'car2' with null

        if (car2 == null) {

            System.out.println("Car2 is null.");

        } else {

            System.out.println("Car2 is not null");

        }

        // 6: Compare the field 'model' value of object 'car1 with null

        if (car1.model == null) {

            System.out.println("car1's model name is null.");

        } else {

            // 7: print the 'model' of 'car1'
            System.out.println("car1's model is: " + car1.model);

        }

    }

}
