package dbi;

import classes.PrivateChat;

import java.sql.SQLException;
import java.util.Collection;

public interface PrivateChatDBI {
    void addPrivateChat(PrivateChat chat) throws SQLException;;
    void updatePrivateChat(int id, PrivateChat chat) throws SQLException;;
    PrivateChat getPrivateChatByID(int id) throws SQLException;;
    Collection<PrivateChat> getAllPrivateChats() throws SQLException;;
    void deletePrivateChat(PrivateChat chat) throws SQLException;;
}
