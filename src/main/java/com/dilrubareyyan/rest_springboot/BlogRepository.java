package com.dilrubareyyan.rest_springboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
}
