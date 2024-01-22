package com.cck.springbootjsontodb.repository;

import com.cck.springbootjsontodb.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
