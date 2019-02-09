package com.spring.excel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.excel.collection.ExampleOFArrayList;

@SpringBootApplication
public class ExcelDataUploadApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ExcelDataUploadApplication.class, args);
		System.out.println(ExampleOFArrayList.getList());
	}

}

