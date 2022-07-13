package com.wisdomleaf.speaking.clock.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.time.LocalDateTime;

import org.junit.Test;

public class SpeakingClockServiceTest {

	private final SpeakingClockService speakingClockService = mock(SpeakingClockService.class);
	@Test
	public void test() {
		String printWords = speakingClockService.printWords("11:45");
		assertNotNull(printWords);
	}

}
