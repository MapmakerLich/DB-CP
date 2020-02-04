package dbi;

import classes.Access;
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

public class AccessDBIimpl implements AccessDBI {
    public void addAccess(Access entry) throws SQLException
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
    public void updateAccess(int id, Access entry) throws SQLException
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
    public Access getAccessByID(int id) throws SQLException
    {
        Session session = null;
        Access entry = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            entry = session.load(Access.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return entry;
    }
    public Collection<Access> getAllAccesses() throws SQLException
    {
        Session session = null;
        List<Access> entries = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Access> entryCriteria = cb.createQuery(Access.class);
            Root<Access> entryRoot = entryCriteria.from(Access.class);
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
    public void deleteAccess(Access entry) throws SQLException
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
