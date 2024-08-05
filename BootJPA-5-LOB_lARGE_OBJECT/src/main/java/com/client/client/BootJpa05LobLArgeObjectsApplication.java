package com.client.client;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import com.client.client.entity.MarriageSeeker;
import com.client.client.service.MatrimonyServiceImpl;
@SpringBootApplication
@EntityScan("com.client.client.entity")
public class BootJpa05LobLArgeObjectsApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootJpa05LobLArgeObjectsApplication.class, args);
		MatrimonyServiceImpl bean = run.getBean(MatrimonyServiceImpl.class, "shadi");
		// C:\\Users\\Bhavesh\\Pictures\\Saved Pictures\\ot1.png

		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter person name");
//			String name = sc.next();
//			System.out.println("Enter person address");
//			String addrs = sc.next();
//			// System.out.println("Enter person photo file complete path::");
//			// String photoPath = sc.next().replace("?","");
//			String photoPath = "C:\\Users\\Bhavesh\\Downloads\\photo.jpg";
//			System.out.println("is the person indian?");
//			boolean indian = sc.nextBoolean();
//
//			// System.out.println("Enter person biodata file complete path::");
//			// String biodataPath = sc.next().replace("?","");
//			String biodataPath = "C:\\sem result\\hai.txt";
//			InputStream is = new FileInputStream(photoPath);
//
//			byte[] photoData = new byte[is.available()];
//
//			photoData = is.readAllBytes();
//			File file = new File(biodataPath);
//			Reader reader = new FileReader(file);
//
//			char bioDataContent[] = new char[(int) file.length()];
//			reader.read(bioDataContent);
//			MarriageSeeker seeker = new MarriageSeeker(name, addrs, photoData, LocalDateTime.of(1990, 11, 23, 12, 45),
//					bioDataContent, indian);
//			if (seeker != null) {
//				String registerMarriageSeeker = bean.registerMarriageSeeker(seeker);
//				System.out.println(registerMarriageSeeker);
//				// System.out.println(seeker);
//			}

			
			System.out.println("-------------------");
			Optional<MarriageSeeker> opt = bean.searchSeeker(1);
			if(opt.isPresent()) {
			MarriageSeeker marriageSeeker = opt.get();
			System.out.println(marriageSeeker.getId()+" "+marriageSeeker.getName()+" "+marriageSeeker.getAddrs()+" "+marriageSeeker.isIndian());
			FileOutputStream fileOutputStream = new FileOutputStream("retrieve_photo.gfif");
			fileOutputStream.write(marriageSeeker.getPhoto());
			fileOutputStream.flush();
			FileWriter fileWriter = new FileWriter("retrieve_biodata.txt");
			fileWriter.write(marriageSeeker.getBiodata());
			fileWriter.flush();
			fileOutputStream.close();
			fileWriter.close();
			System.out.println("LOB's are retrived");
			}
		} catch (Exception e) {
              System.out.println("Records not found");
		}      
	}
}
