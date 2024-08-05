package com.client.cmdRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.client.service.IDocterService;
@Component
public class JPARepositoryTesterRunner implements CommandLineRunner{
	@Autowired
	private IDocterService docterService;

	@Override
	public void run(String... args) throws Exception {
        System.out.println("______________non-select operation__________");
		
		int count = docterService.appraiseDoctorsIncomeBySpecialization("skin specialist", 10.0);
		if (count > 0) {
			System.out.println("no.of records that are effected ::" + count);
		} else {
			System.out.println("record not updated");
		}
		 
       System.out.println("...............................");

    
	}
}
