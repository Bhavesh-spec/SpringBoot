package com.client.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.entity.CallerTuneInfo;
import com.client.repository.ICallerTuneInfoRepository;
@Service("callerTuneService")
public class CallerTuneMgmtServiceImpl implements ICallerTumeMgmtService {
	@Autowired
	private ICallerTuneInfoRepository callerTuneInfoRepository;

//@Override
	public String saveCallerTuneInfo(CallerTuneInfo info) {
		Integer tuneId = callerTuneInfoRepository.save(info).getTuneId();
		return "CallerTune is saved with the id Value::" + tuneId;
	}

//@Override
	public String updateTuneInfoById(Integer id, String tuneName, String movieName) {
		Optional<CallerTuneInfo> byId = callerTuneInfoRepository.findById(id);
		if (byId.isPresent()) {
			CallerTuneInfo Info = byId.get();
			Info.setTuneName(tuneName);
			Info.setMovieName(movieName);
			CallerTuneInfo save = callerTuneInfoRepository.save(Info);
			return "Object is updated for " + save.getUpdatedCount() + "time.....lastly modified on:"
					+ save.getLastlyUpdatedOn() + "....creted on::" + save.getServiceOptedOn();
		}
		return "Callertune Service is not found";
	}

//@Override
	public CallerTuneInfo showCallerTuneDetailsById(Integer id) {
		return callerTuneInfoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
	}

}
