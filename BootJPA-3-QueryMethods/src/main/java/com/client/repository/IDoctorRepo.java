package com.client.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import com.client.entity.Doctor;
@Component
public interface IDoctorRepo extends JpaRepository<Doctor, Integer>{
@Query("FROM Doctor")
public List<Doctor> showAllDoctor();
}
