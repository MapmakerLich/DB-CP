package classes;

public class Access {
    int userID;
    int channelID;
    int id;

    Access()
    {

    }

    public void setChannelID(int channelID) {
        this.channelID = channelID;
    }

    public int getChannelID() {
        return channelID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
