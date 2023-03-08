package com.memorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memorial.entity.SiteUser;

public interface UserRepository extends JpaRepository<SiteUser, Long>{

}
