package com.Dec.cruddec20.repository;

import com.Dec.cruddec20.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UsersJpaRepository extends JpaRepository<Users,Long> {


    Users findByName(String name);
}
