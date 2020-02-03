package classes;

import java.sql.Date;

public class Message {
    int messageID;
    int authorID;
    int channelID;
    String text;
    Date timestamp;
    Message(){

    }
    public int getMessageID()
    {
        return messageID;
    }
    public void setMessageID(int id){
        this.messageID = id;
    }
    public int getAuthorID()
    {
        return authorID;
    }
    public void setAuthorID(int id)
    {
        this.messageID = id;
    }
    public int getChannelID()
    {
        return channelID;
    }
    public void setChannelID(int id)
    {
        this.channelID = id;
    }
    public String getText()
    {
        return text;
    }
    public void setText(String str)
    {
        this.text = str;
    }
    public Date getTimestamp()
    {
        return timestamp;
    }
    public void setTimestamp(Date date)
    {
        this.timestamp = date;
    }
}
