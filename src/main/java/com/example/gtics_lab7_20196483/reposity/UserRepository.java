package com.example.gtics_lab7_20196483.reposity;

import com.example.gtics_lab7_20196483.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
}


