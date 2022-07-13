package com.wisdomleaf.speaking.clock.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeConverter {

	public static LocalTime convertStringToLocalTime(String time)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        
        LocalTime localTime = LocalTime.parse(time, dtf);
        
        return localTime;
	}
}
