package com.client.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.client.entity.Person;
public interface IPersonRepository extends JpaRepository<Person, Integer>{
	@Query("SELECT p.pid,p.pname,p.paddrs,ph.regNo,ph.mobileNo,ph.provider,ph.numberType from Person p inner join p.contactDetails ph")
public List<Object[]> fetchDataUsingJoinsByParent();//object[] because the data came from two tables
}
