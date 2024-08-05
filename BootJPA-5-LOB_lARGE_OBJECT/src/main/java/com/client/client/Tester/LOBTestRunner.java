package com.client.client.Tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//"C:\\Users\\Bhavesh\\Downloads\\photo.jpg"
//"C:\\Users\\Bhavesh\\Downloads\\Bhavesh (2).pdf"

//"D:\\Bhavesh photos\\20200428_132212.jpg"
//"D:\\DRIVER F\\BHAVESH RESUME.pdf"
//"D:/Extra 1/hai.txt"//"C:\\sem result\\hai.txt"
//"C:\\Users\\Bhavesh\\Downloads\\photo.jpg"
import com.client.client.entity.MarriageSeeker;
import com.client.client.service.IMatrimonyServiceMgmt;
//@Component
public class LOBTestRunner implements CommandLineRunner{
//	@Autowired
//	public IMatrimonyServiceMgmt iMatrimonyServiceMgmt;
	@Override
	public void run(String... args) throws Exception {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter person name");
//       String name= sc.next();
//       System.out.println("Enter person address");
//       String addrs = sc.next();
//       
//       System.out.println("Enter person photo file complete path::");
//       String photoPath = sc.next().replace("?","");
//
//       System.out.println("is the person indian?");
//       boolean indian  = sc.nextBoolean();
//       System.out.println("Enter person biodata file complete path::");
//       String biodataPath = sc.next().replace("?","");
//       
//      InputStream is = new FileInputStream(photoPath);
//      
//      byte[] photoData=new byte[is.available()];
//      
//      photoData=is.readAllBytes();
//      File file = new File(biodataPath);
//      Reader reader = new FileReader(file);
//      
//     char bioDataContent[]=new char[(int)file.length()];
//      reader.read(bioDataContent);
//      
//      MarriageSeeker seeker = new MarriageSeeker(name, addrs, photoData,LocalDateTime.of(1990,11,23,12,45), bioDataContent, indian);
	}
}
