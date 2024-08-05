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
	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doc id(before save ::"+doctor.getDocid());
		Doctor doc = doctorRepo.save(doctor);
		return "Doctor obj is save with id value"+doc.getDocid();
	}
	@Override
	public  String registerAllDoctor(List<Doctor> doctors) {
		Iterable<Doctor> saveAll = doctorRepo.saveAll(doctors);
		return doctors.size()+"patients are saved";
	}
	@Override
	public long fetchDoctorsCount() {
		
		return doctorRepo.count();
	}
	@Override
	public boolean checkDoctorAvailbility(Integer id) {		
		return doctorRepo.existsById(id);
	}
	@Override
	public Iterable<Doctor> showAllDoctors() {
		return doctorRepo.findAll();
	}
	@Override
	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids) {
		return doctorRepo.findAllById(ids);
	}
	@Override
	public Doctor showDoctorById(Integer id) {
		Optional<Doctor> opt = doctorRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
        throw new IllegalArgumentException("Invalid doctor id");
	}
	@Override
	public String registerOrUpdateDoctor(Doctor doctor) {
		Optional<Doctor> opt = doctorRepo.findById(doctor.getDocid());
		if(opt.isPresent()) {
			doctorRepo.save(doctor);
			return doctor.getDocid()+" Doctor details are found and updated";
		}else {			
			return "Doctor is saved with id value"+doctorRepo.save(doctor).getDocid();
		}
	}

	@Override
	public String updateDocterSpecification(int docid, String docSpelization) {
		Optional<Doctor> byId = doctorRepo.findById(docid);
		if(byId.isPresent()) {
		Doctor doc = byId.get();
		doc.setSprcialization(docSpelization);
		doctorRepo.save(doc);
		return docid+" doctor specialization is updatd";
		}
		return docid+" doctor is not found for  updation";
	}
	public String deleteDoctorById(Integer id) {
		// TODO Auto-generated method stub
		  Optional<Doctor> opt = doctorRepo.findById(id);
	      if(opt.isPresent()) {
	    	  doctorRepo.deleteById(id);
	    	  return id+" doctor is deleted";
	      }else {
	    	  return id+"doctor not found for deletion";
	      }
	}
	public String deleteDoctor(Doctor doctor) {
		 Optional<Doctor> opt = doctorRepo.findById(doctor.getDocid());
         if(opt.isEmpty()) {
      	   return doctor.getDocid()+"doctor is not found";
         }else {
      	   doctorRepo.delete(doctor);
      	   return doctor.getDocid()+" doctor is founded and deleted ";
         }
	}
	@Override
	public String removeAllDoctors() {
		// TODO Auto-generated method stub
		long count = doctorRepo.count();
		if(count>0) {
		doctorRepo.deleteAll();
		return count+"no of records are deleted";
		}
		return "no records found delete";
	}
	@Override
	public String removeDoctorsByIds(Iterable<Integer> ids) {
		   List<Doctor> list = (List<Doctor>) doctorRepo.findAllById(ids);
		   doctorRepo.deleteAllById(ids);
		   
			return list.size()+"no.of record are deleted";
	}
	@Override
	public String removePatientById(int id) {
      Optional<Doctor> opt = doctorRepo.findById(id);
      if(opt.isPresent()) {
    	  doctorRepo.deleteById(id);
    	  return id+" patient found and deletd";
      }else {
    	  return id+"patient is found for deletion";
      }
		
	}

	

	
}
