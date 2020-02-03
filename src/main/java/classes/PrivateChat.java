package classes;

public class PrivateChat extends Chat {
    PrivateChat()
    {

    }

    PrivateChat(int a, int b)
    {
        super();
        firstUserID = a;
        secondUserID = b;
    }
    int firstUserID;
    int secondUserID;

    public int getFirstUserID() {
        return firstUserID;
    }
    public void setFirstUserID(int firstUserID) {
        this.firstUserID = firstUserID;
    }
    public int getSecondUserID() {
        return secondUserID;
    }
    public void setSecondUserID(int secondUserID) {
        this.secondUserID = secondUserID;
    }
}
