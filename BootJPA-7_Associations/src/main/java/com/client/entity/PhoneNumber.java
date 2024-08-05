package com.client.entity;
import java.io.Serializable;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "JPA_OTM_PHONE_NUMBER")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "REG_NO_SEQ", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	
	@Column(length = 20)
	@NonNull
	private Long mobileNo;
	
	@Column
	@NonNull
	private String provider;
	
	@Column
	@NonNull
	private String numberType;
	
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name ="PERSON_ID",referencedColumnName = "PID")
	private Person personInfo;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", mobileNo=" + mobileNo + ", provider=" + provider + ", numberType="
				+ numberType + ", personInfo=" + personInfo + "]";
	}
	
}
