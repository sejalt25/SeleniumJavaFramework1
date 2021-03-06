package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Book;

public class BookDaoImpl implements BookDao {
	static Connection conn;
	Book b=new Book();
	static{
		PreparedStatement ps=conn.getMyConnection();
		PreparedStatement pdbook = conn.prepareStatement("insert into book where bname=?,isbn=?,price=?,author=?");
		PreparedStatement pdisplay=conn.prepareStatement("select * from book");
		PreparedStatement psearchByName=conn.prepareStatement("select * from book where bname=?");
	}
	@Override
	public void bookAdd() {
		ResultSet rs;
		Int n=pdbook.ExecuteUpdate();
		if(n>1) {
			System.out.println("Insertion done");
		}
		else {
			System.out.println("insertion not done");
		}
	}

	@Override
	public void displayBook() {
		ResultSet rs;
		rs.executeQuery();
		while(rs.next()) {
			List<Book> blist=new ArrayList<>();
			foreach(b:blist);
			System.out.println(blist);		
		}
	}

	@Override
	public void searchByName() {
		ResultSet rs;
		
		if(rs.equals(b.getBname())) {
			System.out.println("Book name found");
		}
		else {
			System.out.println("Book name not found");
		}
	}
	
}
