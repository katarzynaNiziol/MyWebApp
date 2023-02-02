package com.mycompany.repository;

import com.mycompany.user.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository <User,Integer>{

   public Long countById(Integer id);

}
