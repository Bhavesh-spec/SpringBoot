package com.client.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.client.entity.Doctor;
import com.client.repository.IDoctorRepo;
@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDocterService{
	@Autowired
	private IDoctorRepo doctorRepo;
//	@Override
//	public List<Doctor> showDoctorsByIncomeRange(double start, double end) {
//		return doctorRepo.searchDoctorsByIncomeRange(start, end);
//	}

	@Override
	public List<Doctor> showDoctors() {
		// TODO Auto-generated method stub
		return doctorRepo.showAllDoctor();
	}
}
