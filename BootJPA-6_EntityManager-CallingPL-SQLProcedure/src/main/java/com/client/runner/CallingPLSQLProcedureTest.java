package com.client.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.client.service.IDoctorManagmentImpl;
@Component
public class CallingPLSQLProcedureTest implements CommandLineRunner {
	@Autowired
	private IDoctorManagmentImpl doctorManagmentImpl;
	@Override
	public void run(String... args) throws Exception {
       doctorManagmentImpl.showDoctorsByIncomeRange(1500.0, 25000.0).forEach(System.out::println);
	}
}
