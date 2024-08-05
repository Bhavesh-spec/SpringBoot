package com.client.runner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.client.service.IOToMAssociationMgmtService;
@Component
public class OToMAssociationMappingRunnerMappingRunner implements CommandLineRunner {
	@Autowired
	private IOToMAssociationMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		// service.saveDataUsingParent();
		// service.saveDataUsingChild();
		// service.loadDataUsingParent();
//		String deleteByPerson = service.deleteByPerson(1);
//		System.out.println(deleteByPerson);
//		String deleteAllPhoneNumbersOfAPerson = service.deleteAllPhoneNumbersOfAPerson(2);
//		System.out.println(deleteAllPhoneNumbersOfAPerson);
		
	// HQL_JPQL
service.fetchDataByJoinsUsingParent().forEach(row->{
	for(Object val:row) {
		System.out.println(val);
	}
	System.out.println();
});
		
	}
}
