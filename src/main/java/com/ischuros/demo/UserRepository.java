package com.ischuros.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	Iterable<User> findByEmailLike(String email);
}
