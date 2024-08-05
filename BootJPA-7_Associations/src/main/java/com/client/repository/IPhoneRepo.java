package com.client.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.client.entity.PhoneNumber;
public interface IPhoneRepo extends JpaRepository<PhoneNumber, Integer>{

}
