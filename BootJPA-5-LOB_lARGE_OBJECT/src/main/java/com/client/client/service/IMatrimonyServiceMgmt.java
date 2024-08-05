package com.client.client.service;

import java.util.Optional;

import com.client.client.entity.MarriageSeeker;
public interface IMatrimonyServiceMgmt {
public String registerMarriageSeeker(MarriageSeeker seeker);
public Optional<MarriageSeeker> searchSeeker(Integer id);
}
