package com.client.repository;

import org.springframework.data.repository.CrudRepository;

import com.client.entity.Doctor;

public interface IDoctorRepo extends CrudRepository<Doctor, Integer>{


}
