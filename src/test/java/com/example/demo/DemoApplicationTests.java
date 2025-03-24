package com.example.demo;

import com.example.demo.service.BankService;
import com.example.demo.service.ServiceResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	BankService bankService;

	@Test
	void contextLoads() {
	}

	@Test
	void RG_11515() {

		// Cas 789
		ServiceResponseDTO responseDTO789 = bankService.debit(6000);
		assertEquals("789", responseDTO789.code);

		// Cas 207
		ServiceResponseDTO responseDTO207 = bankService.debit(1200);
		assertEquals("207", responseDTO207.code);

	}

}
