package com.adou.demo.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.adou.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findById(long id);

	void deleteById(Long id);

	
	
	User findByUserName(String userName);

	User findByUserNameOrEmail(String username, String email);

}
