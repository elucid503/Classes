package ObjInteractions;

public class Person {

    Message receivedMessage;
    String name;

    public Person(String name) {

        this.name = name;

    }

    public void setMessage(Message message) {

        this.receivedMessage = message;

    }

    public void setReceivedMessage(Message message, Person from) {

        System.out.printf("Received msg from %s\n", from.name);
        this.receivedMessage = message;

    }

    public void showMessage() {

        System.out.println(this.receivedMessage.message);

    }

    public void sendMessage(Message message, Person toPerson) {

        System.out.printf("Sending msg to %s\n", toPerson.name);
        toPerson.setReceivedMessage(message, this);

    }

}
