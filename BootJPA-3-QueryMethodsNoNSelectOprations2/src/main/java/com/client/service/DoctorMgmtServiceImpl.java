package com.client.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.client.repository.IDoctorRepo;
@Service("doctorser")
public class DoctorMgmtServiceImpl implements IDocterService{
	@Autowired
	private IDoctorRepo doctorRepo;
	@Override
	public int appraiseDoctorsIncomeBySpecialization(String specialization, double hikePercentage) {	
		return doctorRepo.hikeDoctorsIncomeBySpecialization(specialization, hikePercentage);
	}
}
