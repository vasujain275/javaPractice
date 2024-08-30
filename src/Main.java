abstract class Message{
    abstract void playMessage();
}

class TextMessage extends Message{
    void playMessage(){
        System.out.println("This is a text message");
    }
}

class VoiceMessage extends Message{
    void playMessage(){
        System.out.println("This is a voice message");
    }
}

class FaxMessage extends Message{
    void playMessage(){
        System.out.println("This is a fax message");
    }
}

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage();
        message.playMessage();
        Message message2 = new VoiceMessage();
        message2.playMessage();
        Message message3 = new FaxMessage();
        message3.playMessage();
    }
}