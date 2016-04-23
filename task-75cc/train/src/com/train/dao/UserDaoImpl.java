package com.train.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.train.entity.User;
import com.train.util.HibernateSessionFactory;

public class UserDaoImpl implements UserDao {

	private Transaction transaction;

	@Override
	public void saveUser(User user) {
		Session session = HibernateSessionFactory.getSession();
		try{
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		}catch(Exception e){
			transaction.rollback();
			System.out.println("saveUser Failed!");
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}	
	}

	@Override
	public User searchUser(String username) {
		Session session = HibernateSessionFactory.getSession();
		String hql = "from User as a where a.username='" + username + "'";
		Query query = session.createQuery(hql);
		User user = (User) query.uniqueResult();
		return user;
	}

}
