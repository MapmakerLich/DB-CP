package dbi;

import classes.LogEntry;

import java.sql.SQLException;
import java.util.Collection;

public interface LogEntryDBI {
    void addLogEntry(LogEntry entry) throws SQLException;
    void updateLogEntry(int id, LogEntry entry) throws SQLException;
    LogEntry getLogEntryByID(int id) throws SQLException;
    Collection<LogEntry> getAllLogEntries() throws SQLException;
    void deleteLogEntry(LogEntry chat) throws SQLException;
}
