package com.amkuio.microservices.user.demo.data.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.amkuio.microservices.user.demo.data.entity.User;

public interface UserDemoRepository extends JpaRepository<User, Integer> {

}
