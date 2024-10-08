package com.controller;

import com.entity.*;

public class Operations {
	int count = 0;
	Library l = new Library("qsp", "Crompet", 635207);

	public Book[] addBooks(Book b) {
		l.getBooks()[count] = b;
		count++;
		return l.getBooks();
	}

	public void getAllData() {
		for (int i = 0; i < l.getBooks().length; i++) {
			if (l.getBooks()[i] != null) {
				System.out.println(l.getBooks()[i]);
			}
		}

	}

	int count1 = 0;
	Book[] newBook;
	int j = 0;

	public Book[] remove(String name) {
		for (int i = 0; i < l.getBooks().length; i++) {
			if (l.getBooks()[i] != null) {
				if (l.getBooks()[i].getName().equalsIgnoreCase(name))
					count1++;

			}
		}
		newBook = new Book[l.getBooks().length - count1];
		for (int i = 0; i < l.getBooks().length; i++) {
			if (l.getBooks()[i] != null) {
				if (!l.getBooks()[i].getName().equalsIgnoreCase(name)) {
					newBook[j++] = l.getBooks()[i];
				}
			}
		}
		l.setBooks(newBook);
		return l.getBooks();
	}

	public Book getBookById(int id) {
		for (int i = 0; i < l.getBooks().length; i++) {
			if (l.getBooks()[i] != null) {
				if (l.getBooks()[i].getId() == id) {
					return l.getBooks()[i];
				}
			}
		}
		return null;
	}
	public Book update(int id) {
		return getBookById(id);
	}

}
