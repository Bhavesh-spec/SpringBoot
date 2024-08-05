package com.client.service;

import java.util.List;

public interface IOToMAssociationMgmtService {
	public void saveDataUsingParent();
	public void saveDataUsingChild();
	public void loadDataUsingParent();
	public String deleteByPerson(int personId);
	public String deleteAllPhoneNumbersOfAPerson(int personId);
	public List<Object[]> fetchDataByJoinsUsingParent();
}
