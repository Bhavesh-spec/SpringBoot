package com.client.cmdRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.client.repository.IDoctorRepo;
@Component
public class JPARepositoryTesterRunner implements CommandLineRunner{
	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public void run(String... args) throws Exception {
		doctorRepo.findBysprcialization("brain doctor").forEach(System.out::println);
	}
}
