package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.BookTypesDao;
import com.spring.model.BookCategorysModel;
import com.spring.model.BookTypesModel;
import com.spring.model.BooksModel;
import com.spring.po.Tbookcategorys;
import com.spring.po.Tbooks;
import com.spring.po.Tbooktypes;
import com.spring.util.CharacterEncoderUtil;

@Controller
@RequestMapping("/booksGallery")
public class BooksGalleryController{
	
	@Resource
	private BooksModel booksModel;
	@Resource
	private BookTypesModel bookTypesModel;
	@Resource
	private BookCategorysModel bookCategorysModel;
	
	public BooksGalleryController() {
	}
	
	@RequestMapping("/getAllBooks")
	public ModelAndView getAllBooks(@RequestParam(value="pageNumKey",required=false,defaultValue="1") int pageNum,
			@RequestParam(value="keyWordsKey",required=false,defaultValue="") String keyWords,
			@RequestParam(value="bookTypeKey",defaultValue="0",required=false) long bookTypeId,
			@RequestParam(value="bookCategoryKey",defaultValue="0",required=false) long bookCategoryId){
		ModelAndView mav = new ModelAndView("bookListGallery");
		List<Tbooks> books = booksModel.getAllBooks(CharacterEncoderUtil.translateEncode(keyWords),pageNum,bookTypeId,bookCategoryId);
		List<Tbooktypes> bookTypes = bookTypesModel.getAllBookTypes();
		List<Tbookcategorys> bookCategorys = bookCategorysModel.getAllBookCategorys();
		mav.addObject("books", books);
		mav.addObject("bookTypes", bookTypes);
		mav.addObject("bookCategorys", bookCategorys);
		return mav;
	}
	
	@RequestMapping("/getBookDetailsByBookId")
	public ModelAndView getBookDetailsByBookId(@RequestParam("bookIdKey") long bookId){
		ModelAndView mav = new ModelAndView("bookDetailsGallery");
		Tbooks tBook = booksModel.getBookDetailById(bookId);
		mav.addObject("book", tBook);
		return mav;
	}
}
