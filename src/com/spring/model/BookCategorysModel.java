package com.spring.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.BookCategorysDao;
import com.spring.po.Tbookcategorys;

@Service
public class BookCategorysModel {

	@Resource
	private BookCategorysDao bookCategoryDao;
	
	/**
	 * @function	get all instance of bookcategory
	 * @date		2014-10-6
	 * @return
	 */
	public List<Tbookcategorys> getAllBookCategorys(){
		return bookCategoryDao.getAllBookCategorys();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
