package com.client.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JPA_DOCTOR_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Doctor {
@Column(name = "DOC_ID")	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer docid;

@Column(name = "DOC_NAME",length = 25)
@NonNull
private String docName;

@Column(name = "SPECIALIZATION",length = 20)
@NonNull
private String sprcialization;

@Column(name = "INCOME")
@NonNull
private Double income;
}
