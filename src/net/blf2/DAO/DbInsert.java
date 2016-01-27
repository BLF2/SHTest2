package net.blf2.DAO;



import org.hibernate.Session;
import org.hibernate.Transaction;

import net.blf2.info.LoginInfo;

public class DbInsert {
	 public LoginInfo insertLoginInfo(LoginInfo loginInfo){
	        Session session = HibernateSessionFactory.currentSession();
	        Transaction transaction = session.beginTransaction();
	        session.save(loginInfo);
	        transaction.commit();
	        HibernateSessionFactory.closeSession();
	        return loginInfo;
	    }
}