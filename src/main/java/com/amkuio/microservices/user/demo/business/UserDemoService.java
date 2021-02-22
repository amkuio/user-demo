package com.amkuio.microservices.user.demo.business;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.amkuio.microservices.user.demo.data.entity.User;

public interface UserDemoService {

	public Page<User> getAllUsers(Pageable pageable);

	public User getUserById(Integer id);

}
