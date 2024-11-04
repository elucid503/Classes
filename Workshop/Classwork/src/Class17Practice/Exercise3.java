package Class17Practice;

interface Displayable {

    static void display() {
        System.out.println("Displaying content");
    }

}

abstract class Media {

    void play() {

        System.out.println("Playing media");

    }

}

class Video extends Media implements Displayable {

    public void display() {
        System.out.println("Displaying video content");
    }

}

public class Exercise3 {

    public static void main(String[] argv) {

        Video myVideo = new Video();

        myVideo.play();

        Displayable.display();

    }

}
