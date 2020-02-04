package dbi;

import classes.BlacklistEntry;

import java.sql.SQLException;
import java.util.Collection;

public interface BlacklistDBI {
    public void addBlacklistEntry(BlacklistEntry entry) throws SQLException;

    public void updateBlacklistEntry(int id, BlacklistEntry entry) throws SQLException;

    public BlacklistEntry getBlacklistEntryByID(int id) throws SQLException;

    public Collection<BlacklistEntry> getAllBlacklistEntries() throws SQLException;

    public void deleteBlacklistEntry(BlacklistEntry entry) throws SQLException;
}
