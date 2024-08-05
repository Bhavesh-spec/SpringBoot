package com.client.service;

import com.client.entity.CallerTuneInfo;

public interface ICallerTumeMgmtService {
public String saveCallerTuneInfo(CallerTuneInfo info);
public String updateTuneInfoById(Integer id,String tuneName,String movieName);
public CallerTuneInfo showCallerTuneDetailsById(Integer id);
}
