package com.capgemini.spring.configuration;

import com.capgemini.spring.main.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.*;
import java.io.*;

@Configuration
public class AppConfiguration
{
public List<String> getDirectors(){
		List<String> directors = new ArrayList<>();
 		directors.add("James");
		directors.add("Rod");
		return directors;
	}

	public Set<String> getBranches(){
		Set<String> branches = new HashSet<>();
 		branches.add("India");
		branches.add("America");
		return branches;
	}

	public Map<String,String> getBranchWiseHead(){
		Map<String,String> branchWiseHead = new HashMap<>();
 		branchWiseHead.put("India","James");
		branchWiseHead.put("America","Rod");
		return branchWiseHead;
	}

	public Properties getIpAddresses(){
		Properties ipAddress = new Properties();
		ipAddress.put("admin", "192.168.2.3");
		ipAddress.put("hr", "192.168.1.4");
		return ipAddress;
	}
	public Properties getDatabaseDetails(){
		Properties databaseDetails = new Properties();
		FileReader reader = null;
		try {

			reader = new FileReader("src/dbconfig.properties");
			databaseDetails.load(reader);
	
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		return databaseDetails;
	}

	public Address getAddress(){
		Address address = new Address("Mumbai","Maharashtra",410203);
		return address;
	}	

	@Bean("organization")
	public Organization organization(){

		Organization organization = new Organization();
		organization.setOrgId(100);
		organization.setOrgName("Capgemini");
		organization.setMarketPrice(15000);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches(getBranches());
		organization.setBranchWiseHead(getBranchWiseHead());
		organization.setIpAddresses(getIpAddresses());
		organization.setDatabaseDetails(getDatabaseDetails());
		return organization;
	}
}