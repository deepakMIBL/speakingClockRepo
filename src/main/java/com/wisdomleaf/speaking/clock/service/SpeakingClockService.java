package com.wisdomleaf.speaking.clock.service;

import org.springframework.stereotype.Service;

@Service
public class SpeakingClockService {

	// Print Time in words.
    public String printWords(int h, int m)
    {
    	String timeInWords = null;
        String nums[] = { "zero", "one", "two", "three", "four",
                            "five", "six", "seven", "eight", "nine",
                            "ten", "eleven", "twelve", "thirteen",
                            "fourteen", "fifteen", "sixteen", "seventeen",
                            "eighteen", "nineteen", "twenty", "twenty one",
                            "twenty two", "twenty three", "twenty four",
                            "twenty five", "twenty six", "twenty seven",
                            "twenty eight", "twenty nine",
                        };
     
        if (m == 0)
        	timeInWords=nums[h] + " o' clock ";
     
        else if (m == 1)
        	timeInWords="one minute past " +
                                            nums[h];
     
        else if (m == 59)
        	timeInWords="one minute to " +
                            nums[(h % 12) + 1];
     
        else if (m == 15)
        	timeInWords="quarter past " + nums[h];
     
        else if (m == 30)
        	timeInWords="half past " + nums[h];
     
        else if (m == 45)
        	timeInWords="quarter to " +
                                nums[(h % 12) + 1];
     
        else if (m <= 30)
        	timeInWords = nums[m] + " minutes past " +
                                                    nums[h];
     
        else if (m > 30)
        	timeInWords = nums[60 - m] + " minutes to " +    
                                                nums[(h % 12) + 1];
        
        return timeInWords;
    }
}
