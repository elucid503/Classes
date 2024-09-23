package ObjInteractions;

public class Person {

    String receivedMessage;

    public Person() {

    }

    public void setReceivedMessage(String message) {

        this.receivedMessage = message;

    }

    public void showMessage() {

        System.out.println(receivedMessage);

    }

}
