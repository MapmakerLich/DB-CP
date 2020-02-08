package dbi;

import classes.GroupChat;

import java.sql.SQLException;
import java.util.Collection;

public interface GroupChatDBI {
    void addGroupChat(GroupChat chat) throws SQLException;
    void updateGroupChat(int id, GroupChat chat) throws SQLException;
    GroupChat getGroupChatByID(int id) throws SQLException;
    Collection<GroupChat> getAllGroupChats() throws SQLException;
    void deleteGroupChat(GroupChat chat) throws SQLException;
}
