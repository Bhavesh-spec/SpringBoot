package com.client.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.client.entity.MarriageSeeker;
@Repository
public interface ImarriageSeekerRepo extends JpaRepository<MarriageSeeker, Integer> {

}
