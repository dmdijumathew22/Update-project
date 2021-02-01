package com.simplilear.hcl.phase3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserEntityCrudRepository extends CrudRepository<UserEntity, String> {

}
