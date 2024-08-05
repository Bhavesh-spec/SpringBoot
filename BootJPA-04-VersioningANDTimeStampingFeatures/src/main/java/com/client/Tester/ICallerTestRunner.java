package com.client.Tester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.client.entity.CallerTuneInfo;
import com.client.service.ICallerTumeMgmtService;
@Component
public class ICallerTestRunner implements CommandLineRunner{
@Autowired
private ICallerTumeMgmtService callerTumeMgmtService;
	@Override
	public void run(String... args) throws Exception {	
//		try {
//			CallerTuneInfo callerTuneInfo = new CallerTuneInfo("oo antaa mama", "pushpa");
//			String saveCallerTuneInfo = callerTumeMgmtService.saveCallerTuneInfo(callerTuneInfo);
//                 System.out.println(saveCallerTuneInfo);			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(callerTumeMgmtService.updateTuneInfoById(1,"joome jo pathan1","pathan"));
//			System.out.println(callerTumeMgmtService.showCallerTuneDetailsById(1));
//		} catch (Exception e) {
//			// TODO: handle exception
//		e.printStackTrace();
//		}
		
		try {
			System.out.println(callerTumeMgmtService.updateTuneInfoById(2,"Natu Natu1","RRR"));
			System.out.println(callerTumeMgmtService.showCallerTuneDetailsById(2));
		} catch (Exception e) {
           e.printStackTrace();
		}
	}

}
