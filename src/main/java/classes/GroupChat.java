package classes;

public class GroupChat extends Chat {
    GroupChat(){

    }

    GroupChat(int a, String s)
    {
        super();
        adminID = a;
        name = s;
    }
    int adminID;
    String name;

    public int getAdminID() {
        return adminID;
    }
    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
