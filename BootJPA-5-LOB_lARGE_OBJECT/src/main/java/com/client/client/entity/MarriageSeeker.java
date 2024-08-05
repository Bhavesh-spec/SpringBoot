package com.client.client.entity;
import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
//@Table(name = "MarriageSeker_JPA")
@Transactional
public class MarriageSeeker implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NonNull
	@Column(length = 20)
	private String name;
	@NonNull
	@Column(length = 20) 
	private String addrs;
	@NonNull
	@Lob
	private byte[] photo;
	@NonNull
	private LocalDateTime dob;
	@NonNull
	@Lob
	private char[] biodata;
	@NonNull
	private boolean indian;

}
