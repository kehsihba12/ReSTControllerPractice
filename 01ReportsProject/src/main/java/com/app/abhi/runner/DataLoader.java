package com.app.abhi.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.abhi.entity.CitizensEntity;
import com.app.abhi.repo.CitizenplanRepository;

@Component
public class DataLoader implements CommandLineRunner {
	
	@Autowired
	private CitizenplanRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		CitizensEntity c1 = new CitizensEntity();
		c1.setCitizenName("ammu");
		c1.setGender("female");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setPlanName("Cash");
		c1.setPlanStatus("AApproved");
		c1.setBenifitAmount(1200.0); 
		
		CitizensEntity c2 = new CitizensEntity();
		c2.setCitizenName("Bassu");
		c2.setGender("male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");
		
		CitizensEntity c3 = new CitizensEntity();
		c3.setCitizenName("jhon");
		c3.setGender("male");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setPlanName("Cash");
		c3.setPlanStatus("terminated");
		c3.setBenifitAmount(5000.0); 
		c3.setTerminateDate(LocalDate.now());
		c3.setTerminationReason("Employeed");
		
		//Food data
		CitizensEntity c4 = new CitizensEntity();
		c4.setCitizenName("anvika");
		c4.setGender("female");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setPlanName("Food");
		c4.setPlanStatus("AApproved");
		c4.setBenifitAmount(4200.0); 
		
		CitizensEntity c6 = new CitizensEntity();
		c6.setCitizenName("Swapnil");
		c6.setGender("male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Denied");
		c6.setDenialReason("property income");
		
		CitizensEntity c5 = new CitizensEntity();
		c5.setCitizenName("Smith");
		c5.setGender("male");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setPlanName("Food");
		c5.setPlanStatus("terminated");
		c5.setBenifitAmount(5000.0); 
		c5.setTerminateDate(LocalDate.now());
		c5.setTerminationReason("Employeed");
		
		
		//Mediacal data
		CitizensEntity c7 = new CitizensEntity();
		c7.setCitizenName("piya");
		c7.setGender("female");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setPlanName("Mediacal");
		c7.setPlanStatus("AApproved");
		c7.setBenifitAmount(4200.0); 
	
		CitizensEntity c8 = new CitizensEntity();
		c8.setCitizenName("ashok");
		c8.setGender("male");
		c8.setPlanName("Mediacal");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("property income");
		
		CitizensEntity c9= new CitizensEntity();
		c9.setCitizenName("classy");
		c9.setGender("male");
		c9.setPlanStartDate(LocalDate.now());
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setPlanName("Mediacal");
		c9.setPlanStatus("terminated");
		c9.setBenifitAmount(5000.0); 
		c9.setTerminateDate(LocalDate.now());
		c9.setTerminationReason("Employeed");
		
		//employeePlan
		CitizensEntity c10 = new CitizensEntity();
		c10.setCitizenName("sharvya");
		c10.setGender("female");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setPlanName("mployeePlan");
		c10.setPlanStatus("AApproved");
		c10.setBenifitAmount(4200.0); 
		
		CitizensEntity c11 = new CitizensEntity();
		c11.setCitizenName("Madhu");
		c11.setGender("male");
		c11.setPlanName("mployeePlan");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Side income");
		
		CitizensEntity c12= new CitizensEntity();
		c12.setCitizenName("Prajay");
		c12.setGender("male");
		c12.setPlanStartDate(LocalDate.now());
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setPlanName("mployeePlan");
		c12.setPlanStatus("terminated");
		c12.setBenifitAmount(5000.0); 
		c12.setTerminateDate(LocalDate.now());
		c12.setTerminationReason("Employeed");
		
		
		List<CitizensEntity> asList = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		repo.saveAll(asList);
		
	}

}
