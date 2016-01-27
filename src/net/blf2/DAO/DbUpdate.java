package net.blf2.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.blf2.info.LoginInfo;

public class DbUpdate {
	public void updateLoginInfo(LoginInfo loginInfo){
        Session session = HibernateSessionFactory.currentSession();
        Transaction transaction = session.beginTransaction();
        session.update(loginInfo);
        transaction.commit();
        HibernateSessionFactory.closeSession();
    }
}