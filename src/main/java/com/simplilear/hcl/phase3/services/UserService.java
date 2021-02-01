package com.simplilear.hcl.phase3.services;

import java.util.Optional;

import com.simplilear.hcl.phase3.repository.UserEntity;

public interface UserService {
	public UserEntity update(UserEntity user);
	public Optional<UserEntity> findById(String userid);
}
