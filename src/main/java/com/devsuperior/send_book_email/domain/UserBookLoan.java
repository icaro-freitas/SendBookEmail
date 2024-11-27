package com.devsuperior.send_book_email.domain;

import java.util.Date;

public class UserBookLoan {

	private User user;
	private Book book;
	private Date loanDate;

	public UserBookLoan() {
	}

	public UserBookLoan(User user, Book book, Date loanDate) {
		this.user = user;
		this.book = book;
		this.loanDate = loanDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

}
