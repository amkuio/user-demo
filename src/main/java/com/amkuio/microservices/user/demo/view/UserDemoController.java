package com.amkuio.microservices.user.demo.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amkuio.microservices.user.demo.business.UserDemoService;
import com.amkuio.microservices.user.demo.data.entity.User;

@RestController
@RequestMapping("/rest/api")
public class UserDemoController {

	@Autowired
	private UserDemoService service;

	@GetMapping("/user")
	public Page<User> getAll(
			@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
			@RequestParam(value = "size", defaultValue = "20", required = false) Integer size) {
		return this.service.getAllUsers(this.getPageable(page, size));
	}

	@GetMapping("/user/{id}")
	public User getCustomer(@PathVariable("id") Integer id) {
		return this.service.getUserById(id);
	}

	protected Pageable getPageable(Integer page, Integer size) {
		return PageRequest.of(page, size, Sort.by("firstName").ascending().and(Sort.by("lastName").ascending()));
	}

	public UserDemoService getService() {
		return service;
	}

	public void setService(UserDemoService service) {
		this.service = service;
	}

}
