package Class15Practice;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

public class Interfaces implements A, B {

    @Override
    public void methodA() {

        System.out.println("Method A");

    }

    @Override
    public void methodB() {

        System.out.println("Method B");

    }

    public static void main(String[] args) {

        Interfaces obj = new Interfaces();

        obj.methodA();
        obj.methodB();

    }

}

