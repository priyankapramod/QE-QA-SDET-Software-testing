package com.qa.nurse.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qa.nurse.Nurse;

public class NurseTest {
	private Nurse nurse1, nurse2;

	@Before
	public void setUp() {

		nurse1 = new Nurse(25, 80000);// numofpatients, salary
		nurse2 = new Nurse(45, 79000);
		System.out.println("Nurse class...Test is started.");

	}

	//
	@After
	public void tearDown() {

		nurse1 = null;
		nurse2 = null;
		System.out.println("Nurse class...Test is started.");
	}

	//

	@Test
	public void testNurseParameterizedConstructor() {
		assertFalse("nurse1 values are not equal to nurse2", nurse1.equals(nurse2));

	}

	//
	@Test
	public void testIsBusy() {
		assertTrue("nurse is busy", nurse2.isBusy());// 45
	}

	
	
	// testing setter and getter of Num of patients
	@Test
	public void testNumOfPatientsGetterSetter() {
		Nurse nurse3 = new Nurse();
		nurse3.setNumOfPatients(30);
		int temp = nurse3.getNumOfPatients();
		assertEquals(30, temp);// 45
	}

	
	
	// testing setter and getter of salary
	@Test
	public void testSalaryGetterSetter() {
		Nurse nurse3 = new Nurse();
		nurse3.setSalary(30000);
		int temp = (int) nurse3.getSalary();
		assertEquals(30000, temp);// 45
	}

	
	
	// testing setter and getter of salary
	@Test
	public void testPayRaise() {
		Nurse nurse3 = new Nurse();
		nurse3.setSalary(30000);
		nurse3.payRaise(4000);
		int temp = (int) nurse3.getSalary();
		assertEquals(34000, temp);// 45
	}

	
	
	@Test
	public void testRetire() {
		Nurse nurse3 = new Nurse(23, 40000);
		nurse3.retire();
		assertEquals(0, (int) nurse3.getSalary());
		assertEquals(0, nurse3.getNumOfPatients());

	}

}
