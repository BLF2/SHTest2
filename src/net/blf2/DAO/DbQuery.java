package net.blf2.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.blf2.info.LoginInfo;

public class DbQuery {
	public LoginInfo queryLoginInfoById(Integer id){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from LoginInfo li where li.loginId="+id);
        if(query.list().size() == 0)
            return null;
        LoginInfo loginInfo = (LoginInfo) query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return loginInfo;
    }
    public LoginInfo queryLoginInfoByName(String loginName){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from LoginInfo li where li.loginName='"+loginName+"'");
        if(query.list().size() == 0)
            return null;
        LoginInfo loginInfo = (LoginInfo) query.list().get(0);
        transaction.commit();
        HibernateSessionFactory.closeSession();
        return loginInfo;
    }
}