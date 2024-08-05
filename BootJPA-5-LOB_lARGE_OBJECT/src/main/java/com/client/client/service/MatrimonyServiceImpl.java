package com.client.client.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.client.client.entity.MarriageSeeker;
import com.client.client.repository.ImarriageSeekerRepo;
@Service("shadi")
public class MatrimonyServiceImpl implements IMatrimonyServiceMgmt{
	@Autowired
	private  ImarriageSeekerRepo imarriageSeekerRepo;
	@Override
	public String registerMarriageSeeker(MarriageSeeker seeker) {
		return "Marriage seeker Info is saved with id value"+imarriageSeekerRepo.save(seeker).getId();
	}
	@Override
	public Optional<MarriageSeeker> searchSeeker(Integer id) {
		// TODO Auto-generated method stub
		return imarriageSeekerRepo.findById(id);
	}
}
