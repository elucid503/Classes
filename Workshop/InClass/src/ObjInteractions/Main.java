package ObjInteractions;

public class Main {

    Message message = new Message();
    Person person = new Person();

    public static void main(String[] args) {

        Main main = new Main(); // need to make this class since this function is static

        main.message.createMessage("Hello, World!");
        main.person.setReceivedMessage(main.message.message);
        main.person.showMessage();

    }

}
