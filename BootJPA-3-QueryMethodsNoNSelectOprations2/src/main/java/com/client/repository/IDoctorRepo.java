package com.client.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.client.entity.Doctor;
@Component
public interface IDoctorRepo extends JpaRepository<Doctor, Integer>{
@Query("update Doctor SET income=income+ (income*:percentage/100.0)where sprcialization = :sp")
@Modifying
@Transactional
public int  hikeDoctorsIncomeBySpecialization(String sp , double percentage);

}
