package com.capgemini.spring.main;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;


@Component
public class Organization {

	@Value("1")
	private int orgId;

	@Value("Capgemini")
	private String orgName;
	
	@Value("10000")
	private double marketPrice;

	
	@Resource(name = "directors")
	private List<String> directors;

	@Resource(name = "branches")
	private Set<String> branches;

	@Resource(name = "brancchWiseDirectors")
	private Map<String, String> branchWiseHead;

	@Resource(name = "ip")
	private Properties ipAddresses;

	@Resource(name = "database")
	private Properties databaseDetails;

	@Autowired
	@Qualifier("address")
	private Address address;

	
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", marketPrice=" + marketPrice + ",\n directors=" + directors +",\n branches=" + branches + ",\n branchWiseHead=" +
 		branchWiseHead+",\n ipAddresses=" + ipAddresses + ",\n databaseDetails=" + databaseDetails +",\n address="+ address +  "]";
	}
	
	
}
