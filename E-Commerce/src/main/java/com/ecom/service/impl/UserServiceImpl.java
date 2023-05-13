package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecom.repository.UserRepository;

public class UserServiceImpl {
	@Autowired
	private UserRepository userRepository;
}
