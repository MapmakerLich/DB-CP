package classes;

public class User {
    public int userID;
    public String login;
    public String password;
    boolean status;

    public User(){

    }

    public void setUserID(int id)
    {
        this.userID = id;
    }
    public int getUserID()
    {
        return userID;
    }
    public void setLogin(String login)
    {
        this.login = login;
    }
    public String getLogin()
    {
        return login;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword() {return password; }
    public void setStatus(boolean status) {this.status = status;}
    public boolean getStatus() {return status;}
}
