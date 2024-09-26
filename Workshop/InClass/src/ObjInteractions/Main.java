package ObjInteractions;

public class Main {

    static Message message = new Message();
    static Person person = new Person();

    public static void main(String[] args) {

        message.createMessage("Hello, World!");
        person.setReceivedMessage(message.message);
        person.showMessage();

    }
    
}
