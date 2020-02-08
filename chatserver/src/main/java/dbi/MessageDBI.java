package dbi;

import classes.Message;

import java.sql.SQLException;
import java.util.Collection;

public interface MessageDBI {
    void addMessage(Message message) throws SQLException;;
    void updateMessage(int id, Message message) throws SQLException;;
    Message getMessageByID(int id) throws SQLException;;
    Collection<Message> getAllMessages() throws SQLException;;
    void deleteMessage(Message message) throws SQLException;;
}
