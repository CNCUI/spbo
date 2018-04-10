package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	/**
	 * 访问http://localhost:8080    get    获取全部数据
	 * 访问http://localhost:8080/1    get    获取id为1的数据
	 * add post
	 * update put
	 * delete delete
	 * 
	 * {
	 * 	"id":1,
	 * 	"name":2,
	 * 	"age": 3
	 * }
	 */
}