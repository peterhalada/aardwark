package com.paragon.io;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.paragon.controller.ParagonController;
import com.paragon.model.Paragon;

class ParagonPrinterTest {

	private Date createdAt = Date.valueOf(LocalDate.of(2020, 4, 5));
	
	@Test
	void testPrintParagon1() {
		ParagonController ctrl = new ParagonController();
		
		Paragon p1 = ctrl.loadParagonFromFile("data/paragon1.txt");
		p1.setCreatedAt(this.createdAt);
		p1.setId(1228440963);
		
		assertNotNull(p1);
		assertNotNull(p1.getItems());
		
		String output = ParagonPrinter.printToString(p1);
		
		String outputReal = "-----------------------------------------------\r\n" + 
				"|Paragon ID:                        1228440963|\r\n" + 
				"|Date:                       5.4.2020 12:00:00|\r\n" + 
				"|                                             |\r\n" + 
				"|Items:                                       |\r\n" + 
				"|                                             |\r\n" + 
				"|SIM card                                20,00|\r\n" + 
				"|  Tax                                    2,40|\r\n" + 
				"|                                             |\r\n" + 
				"|SIM card                                 0,00|\r\n" + 
				"|  Tax                                    0,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Phone case                              10,00|\r\n" + 
				"|  Tax                                    1,20|\r\n" + 
				"|                                             |\r\n" + 
				"|Wired earphones                         30,00|\r\n" + 
				"|  Tax                                    3,60|\r\n" + 
				"|                                             |\r\n" + 
				"-----------------------------------------------\r\n" + 
				"|Total Net Amount:                       60,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Tax:                               7,20|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Amount:                           67,20|\r\n" + 
				"-----------------------------------------------\r\n";
		
		assertEquals(outputReal, output);
	}

	@Test
	void testPrintParagon2() {
		ParagonController ctrl = new ParagonController();
		
		Paragon p1 = ctrl.loadParagonFromFile("data/paragon2.txt");
		p1.setCreatedAt(this.createdAt);
		p1.setId(1228440963);
		
		assertNotNull(p1);
		assertNotNull(p1.getItems());
		
		String output = ParagonPrinter.printToString(p1);
		
		String outputReal = "-----------------------------------------------\r\n" + 
				"|Paragon ID:                        1228440963|\r\n" + 
				"|Date:                       5.4.2020 12:00:00|\r\n" + 
				"|                                             |\r\n" + 
				"|Items:                                       |\r\n" + 
				"|                                             |\r\n" + 
				"|Phone insurance                         96,00|\r\n" + 
				"|  Tax                                    0,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Wireless earphones                      50,00|\r\n" + 
				"|  Tax                                    6,00|\r\n" + 
				"|                                             |\r\n" + 
				"-----------------------------------------------\r\n" + 
				"|Total Net Amount:                      146,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Tax:                               6,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Amount:                          152,00|\r\n" + 
				"-----------------------------------------------\r\n";
		
		assertEquals(outputReal, output);
	}

	@Test
	void testPrintParagon3() {
		ParagonController ctrl = new ParagonController();
		
		Paragon p1 = ctrl.loadParagonFromFile("data/paragon3.txt");
		p1.setCreatedAt(this.createdAt);
		p1.setId(1228440963);
		
		assertNotNull(p1);
		assertNotNull(p1.getItems());
		
		String output = ParagonPrinter.printToString(p1);
		
		String outputReal = "-----------------------------------------------\r\n" + 
				"|Paragon ID:                        1228440963|\r\n" + 
				"|Date:                       5.4.2020 12:00:00|\r\n" + 
				"|                                             |\r\n" + 
				"|Items:                                       |\r\n" + 
				"|                                             |\r\n" + 
				"|SIM card                                20,00|\r\n" + 
				"|  Tax                                    2,40|\r\n" + 
				"|                                             |\r\n" + 
				"|SIM card                                 0,00|\r\n" + 
				"|  Tax                                    0,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Phone case                              10,00|\r\n" + 
				"|  Tax                                    1,20|\r\n" + 
				"|                                             |\r\n" + 
				"|Wired earphones                         30,00|\r\n" + 
				"|  Tax                                    3,60|\r\n" + 
				"|                                             |\r\n" + 
				"|Phone insurance                         96,00|\r\n" + 
				"|  Tax                                    0,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Wireless earphones                      50,00|\r\n" + 
				"|  Tax                                    6,00|\r\n" + 
				"|                                             |\r\n" + 
				"-----------------------------------------------\r\n" + 
				"|Total Net Amount:                      206,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Tax:                              13,20|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Amount:                          219,20|\r\n" + 
				"-----------------------------------------------\r\n";
		
		assertEquals(outputReal, output);
	}

	@Test
	void testPrintParagonErr1() {
		ParagonController ctrl = new ParagonController();
		
		Paragon p1 = ctrl.loadParagonFromFile("data/paragon-err1.txt");
		p1.setCreatedAt(this.createdAt);
		p1.setId(1228440963);
		
		assertNotNull(p1);
		assertNotNull(p1.getItems());
		
		String output = ParagonPrinter.printToString(p1);
		
		String outputReal = "-----------------------------------------------\r\n" + 
				"|Paragon ID:                        1228440963|\r\n" + 
				"|Date:                       5.4.2020 12:00:00|\r\n" + 
				"|                                             |\r\n" + 
				"|Items:                                       |\r\n" + 
				"|                                             |\r\n" + 
				"|Phone case                              10,00|\r\n" + 
				"|  Tax                                    1,20|\r\n" + 
				"|                                             |\r\n" + 
				"|Wired earphones                         30,00|\r\n" + 
				"|  Tax                                    3,60|\r\n" + 
				"|                                             |\r\n" + 
				"|Wireless earphones                      50,00|\r\n" + 
				"|  Tax                                    6,00|\r\n" + 
				"|                                             |\r\n" + 
				"-----------------------------------------------\r\n" + 
				"|Total Net Amount:                       90,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Tax:                              10,80|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Amount:                          100,80|\r\n" + 
				"-----------------------------------------------\r\n";
		
		assertEquals(outputReal, output);
	}

	@Test
	void testPrintParagonErr2() {
		ParagonController ctrl = new ParagonController();
		
		Paragon p1 = ctrl.loadParagonFromFile("data/paragon-err2.txt");
		p1.setCreatedAt(this.createdAt);
		p1.setId(1228440963);
		
		assertNotNull(p1);
		assertNotNull(p1.getItems());
		
		String output = ParagonPrinter.printToString(p1);
		
		String outputReal = "-----------------------------------------------\r\n" + 
				"|Paragon ID:                        1228440963|\r\n" + 
				"|Date:                       5.4.2020 12:00:00|\r\n" + 
				"|                                             |\r\n" + 
				"|Items:                                       |\r\n" + 
				"|                                             |\r\n" + 
				"-----------------------------------------------\r\n" + 
				"|Total Net Amount:                        0,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Tax:                               0,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Amount:                            0,00|\r\n" + 
				"-----------------------------------------------\r\n";
		
		assertEquals(outputReal, output);
	}

	@Test
	void testPrintParagonErr3() {
		ParagonController ctrl = new ParagonController();
		
		Paragon p1 = ctrl.loadParagonFromFile("data/paragon-err3.txt");
		p1.setCreatedAt(this.createdAt);
		p1.setId(1228440963);
		
		assertNotNull(p1);
		assertNotNull(p1.getItems());
		
		String output = ParagonPrinter.printToString(p1);
		
		String outputReal = "-----------------------------------------------\r\n" + 
				"|Paragon ID:                        1228440963|\r\n" + 
				"|Date:                       5.4.2020 12:00:00|\r\n" + 
				"|                                             |\r\n" + 
				"|Items:                                       |\r\n" + 
				"|                                             |\r\n" + 
				"|Phone case                              10,00|\r\n" + 
				"|  Tax                                    1,20|\r\n" + 
				"|                                             |\r\n" + 
				"|Wired earphones                         30,00|\r\n" + 
				"|  Tax                                    3,60|\r\n" + 
				"|                                             |\r\n" + 
				"-----------------------------------------------\r\n" + 
				"|Total Net Amount:                       40,00|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Tax:                               4,80|\r\n" + 
				"|                                             |\r\n" + 
				"|Total Amount:                           44,80|\r\n" + 
				"-----------------------------------------------\r\n";
		
		assertEquals(outputReal, output);
	}

	@Test
	void testPrintParagonMissing() {
		ParagonController ctrl = new ParagonController();
		Paragon p1 = ctrl.loadParagonFromFile("data/xyz.txt");
		
		assertNull(p1);
	}
}
