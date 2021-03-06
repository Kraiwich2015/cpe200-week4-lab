package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public boolean setUserName(String name) {
        String regex = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(name.matches(regex)) {
            userName = name;
            return true;
        }
        else return false;
    }

    public User(String user,String pass){
        setUserName(user);
        setPassword(pass);
    }

    public boolean setPassword(String name) {
        String regex = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if (name.matches(regex))
        {
            password = name;
            return true;
        }
        else return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
