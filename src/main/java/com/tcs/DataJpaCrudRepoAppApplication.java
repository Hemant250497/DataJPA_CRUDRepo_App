package com.tcs;

import com.tcs.entity.Book;
import com.tcs.repo.BookRepository;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DataJpaCrudRepoAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		ConfigurableApplicationContext ctxt =SpringApplication.run(DataJpaCrudRepoAppApplication.class, args);
		BookRepository repo = ctxt.getBean(BookRepository.class);
		/*Book b1 = new Book();
		b1.setBookId(102);
		b1.setBookName("Springboot");
		b1.setBookPrice(3000.00);

		Book b2 = new Book();
		b2.setBookId(103);
		b2.setBookName("Java");
		b2.setBookPrice(2000.00);*/

		//repo.saveAll(Arrays.asList(b1,b2));
		//boolean s = repo.existsById(105);
		//System.out.println("Record count::"+repo.count());
		//System.out.println("Record inserted");
		/*Optional<Book> findById = repo.findById(103);
		if(findById.isPresent()){
			System.out.println(findById.get());
		}*/
       /*Iterable<Book> findAllById=repo.findAllById(Arrays.asList(101,102,103));
	   for(Book b : findAllById){
		   System.out.println(b);
	   }*/
		/*Iterable<Book> findAll = repo.findAll();
		for(Book b : findAll){
			System.out.println(b);
		}*/
		/*if(repo.existsById(102)){
			repo.deleteById(102);
		}
		else{
			System.out.println("record not found");
		}*/

		/*List<Book> books =repo.findByBookPriceGreaterThan(1500.00);
		for(Book b : books){
			System.out.println(b);
		}*/
		/*List<Book> books =repo.AllBooks();
		for(Book b : books){
			System.out.println(b);
		}*/
		List<Book> books =repo.getBooks();
		for(Book b : books){
			System.out.println(b);
		}
	}

}
