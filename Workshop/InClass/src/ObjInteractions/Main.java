package ObjInteractions;

public class Main {

    static Message message = new Message();

    static Person person1 = new Person("Person 1");
    static Person person2 = new Person("Person 2");

    public static void main(String[] args) {

        message.createMessage("Hello, World!");
        person1.setMessage(message);
        person1.showMessage();
        person1.sendMessage(person1.receivedMessage, person2);
        person2.showMessage();

    }
    
}
