package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.spring.po.Tbookcategorys;
import com.spring.util.HibernateSessionFactory;

@Repository
public class BookCategorysDao {
	
	/**
	 * @function	get all instance of bookcategory
	 * @date		2014-10-6
	 * @return
	 */
	public List<Tbookcategorys> getAllBookCategorys(){
		List<Tbookcategorys> allBookCategorys = new ArrayList<Tbookcategorys>();
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tran = null;
		Query query = null;
		try {
			tran = session.beginTransaction();

			String hql = "from com.spring.po.Tbookcategorys";
			query = session.createQuery(hql);
			
			allBookCategorys = query.list();
			
			tran.commit();
		} catch (HibernateException e) {
			if (tran != null) {
				tran.rollback();
			}
			e.printStackTrace();
		}finally{
			if (session != null) {
				session.close();
			}
		}
		
		return allBookCategorys;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
