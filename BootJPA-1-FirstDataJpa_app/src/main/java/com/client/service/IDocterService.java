package com.client.service;
import java.util.List;
import com.client.entity.Doctor;
public interface IDocterService {
public String registerDoctor(Doctor doctor);
public String registerAllDoctor(List<Doctor> doctors);
public long fetchDoctorsCount();
public boolean checkDoctorAvailbility(Integer id);
public Iterable<Doctor> showAllDoctors();
public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids);
public Doctor showDoctorById(Integer id);
public String registerOrUpdateDoctor(Doctor doctor);
public String updateDocterSpecification(int docid,String docSpelization);
public String deleteDoctorById(Integer id);
public String deleteDoctor(Doctor doctor);
public String removeAllDoctors();
public String removeDoctorsByIds(Iterable<Integer> ids);
public String removePatientById(int id);
}
