package com.dilrubareyyan.rest_springboot;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
	private String title;
	private String content;
	private int id;
	
    public static void main( String[] args ) throws IOException
    {
    	SpringApplication.run(App.class, args);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
}
