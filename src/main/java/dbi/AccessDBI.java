package dbi;

import classes.Access;

import java.sql.SQLException;
import java.util.Collection;

public interface AccessDBI {
    public void addAccess(Access entry) throws SQLException;

    public void updateAccess(int id, Access entry) throws SQLException;

    public Access getAccessByID(int id) throws SQLException;

    public Collection<Access> getAllAccesses() throws SQLException;

    public void deleteAccess(Access entry) throws SQLException;
}

