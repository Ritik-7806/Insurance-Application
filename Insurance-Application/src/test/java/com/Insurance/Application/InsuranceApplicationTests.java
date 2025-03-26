package com.Insurance.Application;

import com.Insurance.Application.Controller.UserController;
import com.Insurance.Application.Service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class InsuranceApplicationTests {

	@Test
	public void testGetAllInsurances() {
		UserController abc = new UserController();
		assertEquals(3, abc.getAllInsurance());
	}

	@Test
	public void testPurchaseInsurance() {
		UserController abc = new UserController();
		String receipt = String.valueOf(abc.purchaseInsurance("Life Insurance"));
		assertTrue(receipt.contains("Purchase receipt"));
	}

}
