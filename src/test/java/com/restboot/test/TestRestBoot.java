package com.restboot.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.restboot.service.BankService;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestRestBoot extends TestCase {
	private BankService bankService;

	@Override
	protected void setUp() throws Exception {
		System.out.println("Set it up!");
		bankService = new BankService();
	}

	@Test
	public void testGetBranchLocation() throws JsonParseException,
			JsonMappingException, IOException, Exception {
		assertNotNull(bankService.getBranchLocation());
	}

	@Test
	public void testGetBranchLocationByCity() throws JsonParseException,
			JsonMappingException, IOException, Exception {
		assertNotNull(bankService.getBranchLocationByCity("LIVERPOOL"));
		assertEquals("WALTON VALE",
				bankService.getBranchLocationByCity("LIVERPOOL")[0]
						.getBranchName());
	}

	@Override
	protected void tearDown() throws Exception {
		System.out.println("Running: tearDown");
		bankService = null;
		assertNull(bankService);
	}
}
