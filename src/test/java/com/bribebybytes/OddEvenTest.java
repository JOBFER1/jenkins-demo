package com.bribebybytes;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddEvenTest {

	@Test
	public void evenTest() {
		OddEven meo = new OddEven();
        assertEquals("Even number", true, meo.isEvenNumber(14));
        assertEquals("Even number", false, meo.isEvenNumber(13));
	}
	
	@Test
	public void oddTest() {
		OddEven meo = new OddEven();
        assertEquals("Odd number", true, meo.isOddNumber(13));
        assertEquals("Odd number", false, meo.isOddNumber(14));
	}

}
