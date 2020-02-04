package util;

import dbi.*;

public class Factory {

    private static UserDBIimpl user = null;
    private static PrivateChatDBIimpl privateChat = null;
    private static GroupChatDBIimpl groupChat = null;
    private static MessageDBIimpl message = null;
    private static LogEntryDBIimpl logEntry = null;
    private static BlacklistDBIimpl blacklist = null;
    private static AccessDBIimpl access = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public UserDBIimpl getUserDBI(){
        if (user == null){
            user = new UserDBIimpl();
        }
        return user;
    }

    public PrivateChatDBIimpl getPrivateChatDBI(){
        if (privateChat == null)
        {
            privateChat = new PrivateChatDBIimpl();
        }
        return privateChat;
    }

    public GroupChatDBIimpl getGroupChatDBI(){
        if (groupChat == null)
        {
            groupChat = new GroupChatDBIimpl();
        }
        return groupChat;
    }

    public MessageDBI getMessageDBI(){
        if (message == null)
        {
            message = new MessageDBIimpl();
        }
        return message;
    }

    public LogEntryDBI getLogEntryDBI(){
        if (logEntry == null)
        {
            logEntry = new LogEntryDBIimpl();
        }
        return logEntry;
    }

    public BlacklistDBI getBlacklistDBI(){
        if (blacklist == null)
        {
            blacklist = new BlacklistDBIimpl();
        }
        return blacklist;
    }

    public AccessDBI getAccessDBI(){
        if (access== null)
        {
            access = new AccessDBIimpl();
        }
        return access;
    }
}