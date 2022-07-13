package com.wisdomleaf.speaking.clock.util;

import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Test;

public class DateTimeConverterTest {

	@Test
	public void test_convertStringToLocalTime() {
		String time = "10:13";
		LocalTime convertStringToLocalTime = DateTimeConverter.convertStringToLocalTime(time);
		assertNotNull(convertStringToLocalTime);
	}

}
