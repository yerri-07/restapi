package com.service.micro.repository;

import com.service.micro.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserInfoRepository extends JpaRepository<UserEntity,Integer> {
}
