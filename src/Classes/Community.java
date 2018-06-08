package Classes;

import java.util.ArrayList;
import java.util.List;

public class Community {
    private List<User> UsersOnline;
    private int nbUserOnline;

    public Community (){
        UsersOnline = new ArrayList<>();
    }//Community

    public List<User> getUsersOnline() {
        return UsersOnline;
    }//getUsersOnline

    public int getNbUserOnline() {
        return nbUserOnline;
    }//getNbUserOnline

    public void addOnlineUser (User user){
        UsersOnline.add(user);
        ++nbUserOnline;
    }//addOnlineUser

}
