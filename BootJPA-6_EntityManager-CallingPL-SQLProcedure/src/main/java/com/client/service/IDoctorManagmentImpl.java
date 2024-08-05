package com.client.service;

import java.util.List;

import com.client.entity.Doctor;

public interface IDoctorManagmentImpl {
public List<Doctor> showDoctorsByIncomeRange(double start,double end);
}
