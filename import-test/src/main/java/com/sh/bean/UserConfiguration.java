package com.sh.bean;

import org.springframework.context.annotation.Bean;

/**
 * 没有spring注解
 */
public class UserConfiguration {
	@Bean
	public User getUser() {

		User user = new User();
		user = new User();
		user.setAge(12);
		user.setUsername("码农书华");
		return user;
	}
}
