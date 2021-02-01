package com.simplilear.hcl.phase3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplilear.hcl.phase3.repository.UserEntity;
import com.simplilear.hcl.phase3.repository.UserEntityCrudRepository;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private  UserEntityCrudRepository userEntityCrudRepository;

	@Override
	public UserEntity update(UserEntity user) {
		return userEntityCrudRepository.save(user);
		
	}

	@Override
	public Optional<UserEntity> findById(String userid) {
		return userEntityCrudRepository.findById(userid);
		
	}

}
