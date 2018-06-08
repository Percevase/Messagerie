package Classes;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String myUsername;
    private List<Message> myMessages;
    private boolean status;

    public User (String username){
        myUsername = new String(username);
        myMessages = new ArrayList<>();
        status = true;
    }//User

    public void switchStatus () {
        status = (status) ? false : true;
    }//switchStatus
}
