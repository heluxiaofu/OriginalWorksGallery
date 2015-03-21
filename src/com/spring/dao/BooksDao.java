package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.spring.po.Tbooks;
import com.spring.util.HibernateSessionFactory;

@Repository
public class BooksDao {
	
	private int pageMaxSize = 12;	//the maxizum number of every page
	
	/**
	 * @function	get the instances of book
	 * @param		bookId		the id of this book
	 * @return 		the books instance 
	 * @author 		Alegria
	 * @date		2014-9-27
	 */
	public Tbooks getBookDetailById(long bookId){
		Tbooks tBooks = null;
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tran = null;
		try {
			tran = session.beginTransaction();

			tBooks = (Tbooks) session.get(Tbooks.class, (long)bookId);
			
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
		
		
		return tBooks;
	}
	
	/**
	 * @function	get all instances of books
	 * @param		keyWords	the keyword of this search
	 * @param		bookTypeId	the format of this book
	 * @param		bookCategoryId	the category of this book
	 * @param		pageNum		the page Number to get back
	 * @return 		the list of all books instance 
	 * @author 		Alegria
	 * @date		2014-8-30
	 */
	public List<Tbooks> getAllBooks(String keyWords,int pageNum,long bookTypeId,long bookCategoryId){
		List<Tbooks> bookList = new ArrayList<Tbooks>();
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tran = null;
		Query query = null;
		try {
			tran = session.beginTransaction();

			
			if(0 == bookTypeId && 0 == bookCategoryId) {
				String hql = "from com.spring.po.Tbooks as book where book.bookName like '%" + keyWords +  "%'";
				query = session.createQuery(hql);
			}else if(0 == bookCategoryId){
				String hql = "from com.spring.po.Tbooks as book where book.bookName like '%" + keyWords +  "%' and book.tbooktypes.booktypeId = ?";
				query = session.createQuery(hql);
				query.setLong(0, bookTypeId);
			}else if(0 == bookTypeId){
				String hql = "from com.spring.po.Tbooks as book where book.bookName like '%" + keyWords +  "%' and book.tbookcategorys.bookcategoryId = ?";
				query = session.createQuery(hql);
				query.setLong(0, bookCategoryId);
			}else{
				String hql = "from com.spring.po.Tbooks as book where book.bookName like '%" + keyWords +  "%' and book.tbooktypes.booktypeId = ? and book.tbookcategorys.bookcategoryId = ?";
				query = session.createQuery(hql);
				query.setLong(0, bookTypeId);
				query.setLong(1, bookCategoryId);
			}
			
			query.setMaxResults(pageMaxSize);
			if (pageNum >= 1) {
				query.setFirstResult(pageMaxSize * (pageNum - 1));
			} else {
				query.setFirstResult(0);
			}
			bookList = query.list();
			
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
		
		
		return (List<Tbooks>) bookList;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//BooksDao bookDao = new BooksDao();
		
	}

}
