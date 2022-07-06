package com.wisdomleaf.speaking.clock.controller;

import java.time.LocalDateTime;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomleaf.speaking.clock.service.SpeakingClockService;

@RestController
public class SpeakingClockController {

	private final SpeakingClockService speakingClockService;
	
	public SpeakingClockController(SpeakingClockService speakingClockService)
	{
		this.speakingClockService = speakingClockService;
	}
	@GetMapping(value = "/speakingClock", produces = MediaType.TEXT_PLAIN_VALUE)
	public String speakingClock()
	{
		return speakingClockService.printWords(LocalDateTime.now().getHour(), LocalDateTime.now().getMinute());
	}
}
