package com.anurag.userdetailswithsecurity.repository;

import com.anurag.userdetailswithsecurity.model.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordTokenRepository extends JpaRepository<PasswordResetToken,Long> {
    PasswordResetToken findByToken(String token);


}
