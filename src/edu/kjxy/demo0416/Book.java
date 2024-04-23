package edu.kjxy.demo0416;

import java.math.BigDecimal;
import java.util.Objects;

//Book对应数据库中的book_info表。一个对象对应一个Book对象。
public class Book {
	private String isbn;
	private String bookName;
	private String press;
	private String author;
	private BigDecimal price;
	
	public Book() {
		super();
	}

	public Book(String isbn, String bookName, String press, String author, BigDecimal price) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.press = press;
		this.author = author;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", press=" + press + ", author=" + author + ", price="
				+ price + "]";
	}

}
