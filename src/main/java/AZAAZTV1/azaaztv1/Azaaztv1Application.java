package AZAAZTV1.azaaztv1;

import AZAAZTV1.azaaztv1.entitiy.Dbentity;
import AZAAZTV1.azaaztv1.repository.DbRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class Azaaztv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Azaaztv1Application.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(Dbentity.class,args);
		DbRepository dbRepository = context.getBean(DbRepository.class);

		dbRepository.save(new Dbentity("tjfgml",1234,"김설희","1-3-5"));
		/*Db  db = dbRepository.findById("tjfgml");
		System.out.println("ID : "+db.getID()+" PASSWORD : "+db.getPASSWORD()+" NAME : "+db.getNAME()+" CLASS : "+db.getCLASS());
*/

	}

}
