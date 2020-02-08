package classes;

import java.sql.Date;

public class LogEntry {
    LogEntry(){

    }

    int channelID;
    int targetID;
    int executionerID;
    Date date;
    int actionID;

    public int getChannelID() {
        return channelID;
    }
    public void setChannelID(int channelID) {
        this.channelID = channelID;
    }

    public int getExecutionerID() {
        return executionerID;
    }
    public void setExecutionerID(int executionerID) {
        this.executionerID = executionerID;
    }

    public int getTargetID() {
        return targetID;
    }
    public void setTargetID(int targetID) {
        this.targetID = targetID;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public int getActionID() {
        return actionID;
    }
    public void setActionID(int actionID) {
        this.actionID = actionID;
    }
}

