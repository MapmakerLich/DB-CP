package classes;

public class BlacklistEntry {
    int blockerID;
    int blockedID;
    int entryID;

    BlacklistEntry(){

    }

    public int getBlockedID() {
        return blockedID;
    }
    public void setBlockedID(int blockedID) {
        this.blockedID = blockedID;
    }
    public int getBlockerID() {
        return blockerID;
    }
    public void setBlockerID(int blockerID) {
        this.blockerID = blockerID;
    }
    public int getEntryID() {
        return entryID;
    }
    public void setEntryID(int entryID) {
        this.entryID = entryID;
    }
}
