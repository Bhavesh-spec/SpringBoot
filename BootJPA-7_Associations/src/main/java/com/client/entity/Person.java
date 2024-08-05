package com.client.entity;
import java.io.Serializable;
import java.util.Set;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "JPA_OTM_PERSON")
@Setter
@Getter
@RequiredArgsConstructor
public class Person implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pid;
	
	@Column(length = 20)
	@NonNull
	private String pname;
	
	@Column(length = 20)
	@NonNull
	private String paddrs;
	
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL,fetch =FetchType.EAGER,mappedBy = "personInfo")
	//@JoinColumn(name ="PERSON_ID",referencedColumnName = "PID")
	private Set<PhoneNumber> contactDetails;

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", contactDetails=" + contactDetails
				+ "]";
	}
}
