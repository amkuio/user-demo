package com.amkuio.microservices.user.demo.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.amkuio.microservices.user.demo.data.entity.User;
import com.amkuio.microservices.user.demo.data.repository.UserDemoRepository;

@Service
public class UserDemoServiceImpl implements UserDemoService {

	@Autowired
	private UserDemoRepository repository;

	public UserDemoServiceImpl() {
	}

	@Override
	public Page<User> getAllUsers(Pageable pageable) {
		return this.repository.findAll(pageable);
	}

	@Override
	public User getUserById(Integer id) {
		Optional<User> user = this.repository.findById(id);
		return user.orElseThrow();
	}

	public UserDemoRepository getRepository() {
		return repository;
	}

	public void setRepository(UserDemoRepository repository) {
		this.repository = repository;
	}

}
