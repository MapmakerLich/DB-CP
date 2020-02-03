package dbi;

import classes.User;

import java.sql.SQLException;
import java.util.Collection;

public interface UserDBI {
    void addUser(User user) throws SQLException;;
    void updateUser(int id, User user) throws SQLException;;
    User getUserByID(int id) throws SQLException;;
    Collection<User> getAllUsers() throws SQLException;;
    void deleteUser(User user) throws SQLException;;
}
