package com.memorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memorial.entity.SiteUser;

public interface UserRepository extends JpaRepository<SiteUser, Long>{
	Optional<SiteUser> findByUsername(String name);
}
