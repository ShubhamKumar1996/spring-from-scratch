package com.example.springcoreproject3;

public class Library {
    private int libraryId;
    private String libraryName;
    private Book book;

    public Library() {
        super();
    }

    public Library(int libraryId, String libraryName, Book book) {
        super();
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.book = book;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", book=" + book + "]";
    }
}
