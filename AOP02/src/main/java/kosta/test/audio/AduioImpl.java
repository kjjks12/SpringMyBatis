package kosta.test.audio;

import kosta.service.Player;

public class AduioImpl implements Player{

	@Override
	public void start(int volumn) {
		System.out.println("AduioImpl start(int volumn) 호출");
		
	}

	@Override
	public String pause() {
		System.out.println("AduioImpl pause() 호출");
		return "Audio pause리턴!";
	}

	@Override
	public void stop() {
		System.out.println("AduioImpl stop() 호출");
		
	}

	
}
