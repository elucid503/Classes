// By Paul Ujlaky, 9/15/24

public class Student {

    // Props

    public int Age;
    public String Name;

    private int[] Scores;

    private double GPA;

    // Constructor

    public Student(int Age, String Name) {

        this.Age = Age;
        this.Name = Name;

    }

    // Main method and demo

    public static void main(String[] args) {

        Student student = new Student(20, "John");

        student.setScores(new int[] {90, 80, 70, 60, 50});

        System.out.println(student.getGPA());

    }

    // Setters and Getters

    public void setScores(int[] Scores) {

        this.Scores = Scores;

    }

    public double getGPA() {

        CalculateGPA(); // first calculate the GPA based on any new scores

        return GPA;

    }

    // Methods

    private void CalculateGPA()  {

        double Sum = 0;

        for (int score : Scores) { // enhanced for loop

            Sum += score;

        }

        GPA = Sum / Scores.length;

    }

}
