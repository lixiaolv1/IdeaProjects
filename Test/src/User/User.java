package User;

import sun.rmi.server.UnicastServerRef;

public class User {

    public String getUserName() {
        return userName;
    }

    public User(){
        super();
    }

    public User(String userName,String password,String email){
        setUserName(userName);
        setPassword(password);
        setEmail(email);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String userName;
    private String password;
    private String email;
}
