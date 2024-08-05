package com.client.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.client.entity.Doctor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service("doctorService")
public class DoctorServiceMgmtImpl implements IDoctorManagmentImpl{
	@Autowired
	private EntityManager manager;
	
	public List<Doctor> showDoctorsByIncomeRange(double start, double end) {
	StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_INCOME_RANGE",Doctor.class);
	query.registerStoredProcedureParameter(1,Double.class,ParameterMode.IN);
	query.registerStoredProcedureParameter(2,Double.class,ParameterMode.IN);
	query.registerStoredProcedureParameter(3,Object.class,ParameterMode.REF_CURSOR);	
	query.setParameter(1,start);
	query.setParameter(2,end);
	List<Doctor> list=query.getResultList();
//	For instance, in your case of P_GET_DOCTORS_BY_INCOME_RANGE, 
//	it encapsulates a SQL query that retrieves doctors from a database
//	table (JPA_DOCTOR_INFO) based on a specified income range (STARTINGCOME to ENDINCOME). 
//	This procedure could be used in an application to fetch doctors meeting specific income 
//	criteria without rewriting the query each time.
		return list;
	}//method end    
}
