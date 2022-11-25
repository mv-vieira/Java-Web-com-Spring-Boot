package com.projetoSpringBoot.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpringBoot.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
