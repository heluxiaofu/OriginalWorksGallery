package com.spring.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.dao.BooksDao;
import com.spring.po.Tbooks;

@Service
public class BooksModel {
	
	@Resource
	private BooksDao booksDao;
	
	/**
	 * @function	get the instances of book
	 * @param		bookId		the id of this book
	 * @return 		the books instance 
	 * @author 		Alegria
	 * @date		2014-9-27
	 */
	public Tbooks getBookDetailById(long bookId){
		return booksDao.getBookDetailById(bookId);
	}
	
	/**
	 * @function	get all instances of books
	 * @param		keyWords	the keyword of this search
	 * @param		pageNum		the page Number to get back
	 * @param		bookCategoryId	the category of this book
	 * @param		pageNum		the page Number to get back
	 * @return 		the list of all books instance 
	 * @author 		Alegria
	 * @date		2014-8-30
	 */
	public List<Tbooks> getAllBooks(String keyWords,int pageNum,long bookTypeId,long bookCategoryId){
		if(booksDao != null){
			return booksDao.getAllBooks(keyWords,pageNum,bookTypeId,bookCategoryId);
		}
		return null;
	}
	
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		BooksModel booksModel = (BooksModel) act.getBean("booksModel");
		Tbooks tBook = booksModel.getBookDetailById(1);
		System.out.println(tBook.getBookName());
	}
}
