package com.demo.service;

import com.demo.dao.BookDao;
import com.demo.dao.BookDaoImpl;

public class BookServiceImpl implements BookService {

	BookDao bdao=new BookDaoImpl();
	@Override
	public void bookAdd() {
		bdao.bookAdd();
	}

	@Override
	public void displayBook() {
		bdao.displayBook();
	}

	@Override
	public void searchByName() {
		bdao.searchByName();
		
	}
		
}
