package com.client.service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.client.entity.Person;
import com.client.entity.PhoneNumber;
import com.client.repository.IPersonRepository;
import com.client.repository.IPhoneRepo;

@Service("OToMService")
public class OToMAssociationMgmtServiceImpl implements IOToMAssociationMgmtService {
	@Autowired
	private IPersonRepository iPersonRepository;
	@Autowired
	private IPhoneRepo iPhoneRepo;

	@Override
	public void saveDataUsingParent() {
		Person per = new Person();
		per.setPname("raja");
		per.setPaddrs("hyd");
		System.out.println(per);
		PhoneNumber ph1 = new PhoneNumber(789012, 963852741L, "airtel", "personal", per);
		PhoneNumber ph2 = new PhoneNumber(null, 852041963L, "jio", "office", per);
		Set<PhoneNumber> numbers = new HashSet<PhoneNumber>();
		numbers.add(ph1);
		numbers.add(ph2);
		per.setContactDetails(numbers);

		iPersonRepository.save(per);
		System.out.println("Person and his associated phoneNumbers are saved ");
	}

	@Override
	public void saveDataUsingChild() {
		Person per = new Person();
		per.setPname("ramesh");
		per.setPaddrs("vizag");
		System.out.println(per);
		PhoneNumber ph1 = new PhoneNumber(417, 96385241L, "airtel", "personal", per);
		PhoneNumber ph2 = new PhoneNumber(521, 9638574L, "vi", "office", per);
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);

		Set<PhoneNumber> phonSet = new HashSet<PhoneNumber>();
		phonSet.add(ph1);
		phonSet.add(ph2);
		per.setContactDetails(phonSet);
		iPhoneRepo.save(ph1);
		iPhoneRepo.save(ph2);
		iPhoneRepo.save(ph2);
		System.out.println("OToMAssociationMgmtServiceImpl.saveDataUsingChild()");
	}

	@Override
	public void loadDataUsingParent() {
		List<Person> all = iPersonRepository.findAll();
		all.forEach(per -> {
			System.out.println("parent::" + per);

			Set<PhoneNumber> contactDetails = per.getContactDetails();
			contactDetails.forEach(ph -> {
				System.out.println(ph.getMobileNo());
			});
		});
	}
	public String deleteByPerson(int personId) {
		Optional<Person> obj = iPersonRepository.findById(personId);
		if (obj.isPresent()) {
			iPersonRepository.delete(obj.get());
			return "person and his phoneNumbers are deleted";
		} else {
			return "person not found";
		}
	}

	public String deleteAllPhoneNumbersOfAPerson(int personId) {
	 Optional<Person> Obj = iPersonRepository.findById(personId);
	 if(Obj.isPresent()) {
		 Set<PhoneNumber> contactDetails = Obj.get().getContactDetails();
		 contactDetails.forEach(ph->{
			 ph.setPersonInfo(null);			 
		 });
		 iPhoneRepo.deleteAll(contactDetails);
		 return contactDetails.size()+"phoneNumber of "+personId+"Person are deleted";
	 }else
		return personId+"Person not found";
	}

	@Override
	public List<Object[]> fetchDataByJoinsUsingParent() {
		return iPersonRepository.fetchDataUsingJoinsByParent();
	}
}
