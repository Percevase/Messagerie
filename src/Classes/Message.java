package Classes;

public class Message {
    private String myContent;

    public Message (String content){
        myContent = new String(content);
    }//Message

    public String getMyContent() {
        return myContent;
    }
}
