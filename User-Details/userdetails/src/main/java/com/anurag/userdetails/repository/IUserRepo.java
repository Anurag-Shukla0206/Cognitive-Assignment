package com.anurag.userdetails.repository;

import com.anurag.userdetails.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users,Integer> {

    Users findByUserEmail(String email);


}
