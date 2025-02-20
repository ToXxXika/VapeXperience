package com.example.vapexperience.Repositories;
import com.example.vapexperience.Models.Liquide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiquideRepository extends JpaRepository<Liquide,String> {
    
}