package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathTest {
	
	Maths math = new Maths();
	

	@Test
	void testDivision()
	{		
		float result = math.divide(1,2);
		assertEquals(0.5, result);
	}


	@Test
	void testSubtract()
	{
		int result = math.subtract(14,12);
		assertEquals(2, result);
	}

	@Test
	void testAdd() {
		int result = math.add(1,2);
		assertEquals(3, result);
	}

}
