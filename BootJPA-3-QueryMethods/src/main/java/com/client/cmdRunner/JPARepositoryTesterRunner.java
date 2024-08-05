package com.client.cmdRunner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.client.entity.Doctor;
import com.client.repository.IDoctorRepo;
import com.client.service.IDocterService;
@Component
public class JPARepositoryTesterRunner implements CommandLineRunner{
	@Autowired
	private IDocterService docterService;

	@Override
	public void run(String... args) throws Exception {
List<Doctor> showDoctorsByIncomeRange = docterService.showDoctors();
showDoctorsByIncomeRange.forEach(System.out::println);
	}
}
