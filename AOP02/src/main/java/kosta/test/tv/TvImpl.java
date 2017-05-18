package kosta.test.tv;

import kosta.service.Player;

public class TvImpl implements Player {

	@Override
	public void start(int volumn) {
		System.out.println("TvImpl start(int volumn) 호출");

	}

	@Override
	public String pause() {
		System.out.println("TvImpl pause() 호출");
		return "TvImpl 리턴값!!";
	}

	@Override
	public void stop() {
		System.out.println("TvImpl stop() 호출");
	}

}
