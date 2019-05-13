package com.capgemini.trainingapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.trainingapp.main.CorporateTraining;
import com.capgemini.trainingapp.main.PublicTraining;
import com.capgemini.trainingapp.main.Training;

public class TrainingTest {

	@Test
	public void testPublicTrainingValue() {
		Training training = new PublicTraining(1,"Java",5000,50);
		assertEquals(250000,training.getOrderValue());
	}
	
	@Test
	public void testCorporateTrainingValue() {
		Training training = new CorporateTraining(1,"Big Data",35000,4);
		assertEquals(140000,training.getOrderValue());
	}
}
