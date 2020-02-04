package dbi;

import classes.LogEntry;
import classes.LogEntry;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LogEntryDBIimpl implements LogEntryDBI {
    public void addLogEntry(LogEntry entry) throws SQLException
    {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(entry);
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            if (session != null && session.isOpen())
            {
                session.close();
            }
        }
    }
    public void updateLogEntry(int id, LogEntry entry) throws SQLException
    {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(entry);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
    public LogEntry getLogEntryByID(int id) throws SQLException
    {
        Session session = null;
        LogEntry entry = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            entry = session.load(LogEntry.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entry;
    }
    public Collection<LogEntry> getAllLogEntries() throws SQLException
    {
        Session session = null;
        List<LogEntry> entries = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<LogEntry> entryCriteria = cb.createQuery(LogEntry.class);
            Root<LogEntry> entryRoot = entryCriteria.from(LogEntry.class);
            entryCriteria.select(entryRoot);
            entries = session.createQuery(entryCriteria).getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entries;
    }
    public void deleteLogEntry(LogEntry entry) throws SQLException
    {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(entry);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
