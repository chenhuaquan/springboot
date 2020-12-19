package com.bigdata.cachingdata;

public interface BookRepository {
    
    Book getByIsbn(String isbn);

}
