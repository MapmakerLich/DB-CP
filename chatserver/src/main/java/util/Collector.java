package util;

import classes.*;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

public class Collector {
    public static Collection<User> users;
    public static Collection<PrivateChat> privateChats;
    public static Collection<GroupChat> groupChats;
    public static Collection<Message> messages;
    public static Collection<BlacklistEntry> blacklist;
    public static Collection<LogEntry> log;
    public static Collection<Access> accesses;

    public static void fetchUsers() throws SQLException{
        users = Factory.getInstance().getUserDBI().getAllUsers();
    }

    public static void printUsers(PrintWriter stream) throws SQLException {
        fetchUsers();
        Iterator<User> iterator = users.iterator();
        stream.println("== Users ==");
        while (iterator.hasNext())
        {
            User user = iterator.next();
            stream.println(user.getLogin());
        }
    }

    public static void fetchPrivateChats() throws SQLException {
        privateChats = Factory.getInstance().getPrivateChatDBI().getAllPrivateChats();
    }

    public static void printPrivateChats(PrintWriter stream) throws SQLException {
        fetchPrivateChats();
        Iterator<PrivateChat> iterator = privateChats.iterator();
        stream.println("== Private chats ==");
        while (iterator.hasNext())
        {
            PrivateChat chat = iterator.next();
            stream.println(chat.getChatID());
        }
    }

    public static void fetchGroupChats() throws SQLException {
        groupChats = Factory.getInstance().getGroupChatDBI().getAllGroupChats();
    }

    public static void printGroupChats(PrintWriter stream) throws SQLException {
        fetchGroupChats();
        Iterator<GroupChat> iterator = groupChats.iterator();
        stream.println("== Group chats ==");
        while (iterator.hasNext())
        {
            GroupChat chat = iterator.next();
            stream.println(chat.getChatID());
        }
    }

    public static void fetchMessages() throws SQLException{
        messages = Factory.getInstance().getMessageDBI().getAllMessages();
    }

    public static void printMessages(PrintWriter stream) throws SQLException{
        fetchMessages();
        Iterator<Message> iterator = messages.iterator();
        stream.println("== Messages ==");
        while (iterator.hasNext())
        {
            Message message = iterator.next();
            stream.println(message.getMessageID());
        }
    }

    private static void fetchAccesses() throws SQLException{
        accesses = Factory.getInstance().getAccessDBI().getAllAccesses();
    }

    private static void fetchLog() throws SQLException{
        log = Factory.getInstance().getLogEntryDBI().getAllLogEntries();
    }

    private static void fetchBlacklist() throws SQLException{
        blacklist = Factory.getInstance().getBlacklistDBI().getAllBlacklistEntries();
    }
}
