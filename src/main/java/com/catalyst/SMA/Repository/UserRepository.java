package com.catalyst.SMA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalyst.SMA.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User getUserByUserId(Integer userId);

}
