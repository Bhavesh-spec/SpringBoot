package com.client.cmdRunner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.client.entity.Doctor;
import com.client.service.DoctorMgmtServiceImpl;

@Component
public class CrudRepositoryTesterRunner implements CommandLineRunner {
	@Autowired
	private DoctorMgmtServiceImpl doctorMgmtServiceImpl;

	@Override
	public void run(String... args) throws Exception {
		
		
		/*
		 * Doctor d3 = new Doctor("Bsm", "brain doctor", 25000.0);
		 * doctorMgmtServiceImpl.registerDoctor(d3); Doctor d = new Doctor("chetan",
		 * "skin specialist", 1000.0); Doctor d1 = new Doctor("ritik", "gynklogist",
		 * 500.0); List<Doctor> list = List.of(d, d1); try { String registerAllDoctor =
		 * doctorMgmtServiceImpl.registerAllDoctor(list);
		 * System.out.println(registerAllDoctor); } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 */
//		try {
//			long fetchDoctorsCount = doctorMgmtServiceImpl.fetchDoctorsCount();
//			System.out.println("count of records::" + fetchDoctorsCount);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		/*
		 * try { //boolean checkDoctorAvailbility =
		 * doctorMgmtServiceImpl.checkDoctorAvailbility(352);
		 * System.out.println("201 id doctor exists?::"+(doctorMgmtServiceImpl.
		 * checkDoctorAvailbility(352)?"available":"not available")); } catch (Exception
		 * e) { // TODO: handle exception e.printStackTrace(); }
		 */
//		try {
//			Iterable<Doctor> it = doctorMgmtServiceImpl.showAllDoctors();
//			it.forEach(doc->{
//				System.out.println(doc);
//			});
//			System.out.println("-------------");
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		/*
		 * try {
		 * doctorMgmtServiceImpl.showAllDoctorsByIds(List.of(403,402,352)).forEach(
		 * System.out::println); } catch (Exception e) { e.printStackTrace(); }
		 */

//		/*
//		 * Optional<Doctor> showDoctorById = doctorMgmtServiceImpl.showDoctorById(352);
//		 * if(showDoctorById.isPresent()) System.out.println(showDoctorById.get()); else
//		 * System.out.println("student not found");
//		 */
		/*
		 * try { Doctor showDoctorById = doctorMgmtServiceImpl.showDoctorById(351);
		 * System.out.println(showDoctorById); } catch (Exception e) {
		 * System.err.println(e.getMessage()); }
		 */

		/*
		 * try { Doctor doc = new Doctor(); doc.setDocid(452);doc.setDocName("arjun");
		 * doc.setIncome(14000.0);doc.setSprcialization("eye specilist"); String
		 * registerOrUpdateDoctor = doctorMgmtServiceImpl.registerOrUpdateDoctor(doc);
		 * System.out.println(registerOrUpdateDoctor); } catch (Exception e) { // TODO:
		 * handle exception e.printStackTrace(); }
		 */
		/*
		 * try { String updateDocterSpecification =
		 * doctorMgmtServiceImpl.updateDocterSpecification(111, "nurologyst");
		 * System.out.println(updateDocterSpecification); } catch (Exception e2) { //
		 * TODO: handle exception e2.printStackTrace(); }
		 */
		/*
		 * try {
		 * 
		 * System.out.println(doctorMgmtServiceImpl.deleteDoctorById(352)); }catch
		 * (Exception e) { // TODO: handle exception e.printStackTrace(); }
		 */
		/*
		 * try { Doctor doctor = new Doctor();
		 * doctor.setDocid(402);doctor.setDocName("karan");
		 * System.out.println(doctorMgmtServiceImpl.deleteDoctor(doctor)); } catch
		 * (Exception e2) { e2.printStackTrace(); }
		 */
		/*
		 * try { System.out.println(doctorMgmtServiceImpl.removeAllDoctors()); } catch
		 * (Exception e) { // TODO: handle exception e.printStackTrace(); }
		 */
		/*
		 * try {
		 * System.out.println(doctorMgmtServiceImpl.removeDoctorsByIds(List.of(952,
		 * 953))); } catch (Exception e) { // TODO: handle exception
		 * e.printStackTrace(); }
		 */
		  try {
			System.out.println(doctorMgmtServiceImpl.removePatientById(954));
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
}
