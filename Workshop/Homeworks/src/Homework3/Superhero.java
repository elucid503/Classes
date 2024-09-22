// By Paul Ujlaky, 9/22/24

// Tried out a lambda for the formula, some more notes in the Superhero.train function

interface TrainFormula {

    public int calculate(int Hours);

}

/**
 * This class represents a Superhero
 */

public class Superhero {

    // Props

    private String name;
    private int strengthLevel;
    private String superPower;
    private boolean canFly;

    //  Constructor

    public Superhero(String name, int strengthLevel, String superPower, boolean canFly) {

        // Assignments

        this.name = name;

        this.strengthLevel = strengthLevel;
        this.superPower = superPower;
        this.canFly = canFly;

    }

    // Getters/Setters

    public String getName() {

        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getStrengthLevel() {

        return this.strengthLevel;

    }

    public void setStrengthLevel(int strengthLevel) {

        this.strengthLevel = strengthLevel;

    }

    public String getSuperPower() {

        return this.superPower;

    }

    public void setSuperPower(String superPower) {

        this.superPower = superPower;

    }

    public boolean getCanFly() {

        return this.canFly;

    }

    public void setCanFly(boolean canFly) {

        this.canFly = canFly;

    }

    // Methods

    /**
     * This function will "train" the Superhero
     * @param Hours - The amount of hours the Superhero will train
     */

    public void train(int Hours) {

        // Decided to try using lambdas/callbacks for some fun, used the docs found at https://www.w3schools.com/java/java_lambda.asp
        // This could be moved up out of this function so to be used globally, which is more useful than just keeping it here

        TrainFormula formula = (int hours) -> {

            // sqrt is interesting here bc it prioritizes original skill, similar to how a person would train in real life

            return (int) Math.sqrt(this.strengthLevel * hours);

        };

        int trainResult = formula.calculate(Hours); // Using a local variable here

        // Assign the new strength level

        this.strengthLevel += trainResult;

    }

    /**
     * This function will battle another Superhero
     * @param opponent - The opponent Superhero
     * @return - Returns a boolean value, true if the current Superhero wins, false if the opponent wins
     */

    public boolean battle(Superhero opponent) {

        // Check if the opponent is stronger

        return this.strengthLevel >= opponent.getStrengthLevel();

    }

    // Main Method

    public static void main(String[] args) {

        // Create two Superheroes

        Superhero profX = new Superhero("Professor X", 65, "Telepathy", false);
        Superhero batman = new Superhero("Batman", 45, "Rich", false);

        System.out.println("------- Superhero 1 -------");

        // Decided to get some practice in with printf instead of println

        System.out.printf("Name: %s\n", profX.getName());
        System.out.printf("Strength Level: %d\n", profX.getStrengthLevel());
        System.out.printf("Super Power: %s\n", profX.getSuperPower());
        System.out.printf("Can Fly: %s\n", profX.getCanFly() ? "Yes" : "No"); // inline if statement based on bool return from Superhero.getCanFly

        System.out.println("------- Superhero 2 -------");

        System.out.printf("Name: %s\n", batman.getName());
        System.out.printf("Strength Level: %d\n", batman.getStrengthLevel());
        System.out.printf("Super Power: %s\n", batman.getSuperPower());
        System.out.printf("Can Fly: %s\n", batman.getCanFly() ? "Yes" : "No");

        // Train the first Superhero

        profX.train(100);

        System.out.println("------- Superhero 1 (After Training 100 hrs) -------");

        System.out.printf("Strength Level: %d\n", profX.getStrengthLevel());

        // Train the second Superhero

        batman.train(125);

        System.out.println("------- Superhero 2 (After Training 125 hrs) -------");

        System.out.printf("Strength Level: %d\n", batman.getStrengthLevel());

        // Battle the two Superheroes

        boolean result = profX.battle(batman);

        System.out.println("------- Battle -------");

        System.out.printf("%s vs %s\n", profX.getName(), batman.getName());

        System.out.printf("Winner: %s\n", result ? profX.getName() : batman.getName());

    }

}