package com.spring.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.BookTypesDao;
import com.spring.po.Tbooktypes;

@Service
public class BookTypesModel {
	
	@Resource
	private BookTypesDao bookTypesDao;
	
	/**
	 * @function	get all instance of booktype
	 * @date		2014-10-6
	 * @return
	 */
	public List<Tbooktypes> getAllBookTypes(){
		return bookTypesDao.getAllBookTypes();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
