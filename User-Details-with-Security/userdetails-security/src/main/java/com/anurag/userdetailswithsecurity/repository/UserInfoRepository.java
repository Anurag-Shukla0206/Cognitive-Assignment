package com.anurag.userdetailswithsecurity.repository;


import com.anurag.userdetailswithsecurity.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
//    Optional<UserInfo> findByName(String username);

    UserInfo findByEmail(String username);
}
