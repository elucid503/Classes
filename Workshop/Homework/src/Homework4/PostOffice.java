package Homework4;

public class PostOffice {

    public String postmanName;

    public PostOffice(String postmanName) {

        this.postmanName = postmanName;

    }

    public void deliverLetter(Person sender, Person receiver, String letter) {

        System.out.println("Letter delivered by " + this.postmanName);
        sender.sendLetter(receiver, letter);

    }

}
