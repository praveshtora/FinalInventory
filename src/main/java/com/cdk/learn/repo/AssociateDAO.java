package com.cdk.learn.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cdk.learn.entity.Associate;

@Service
@Transactional
public  interface AssociateDAO  extends JpaRepository<Associate, Long>{
	
}
