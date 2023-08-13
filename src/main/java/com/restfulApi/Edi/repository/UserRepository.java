package com.restfulApi.Edi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restfulApi.Edi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
