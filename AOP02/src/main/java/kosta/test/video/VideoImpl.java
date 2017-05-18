package kosta.test.video;

import kosta.service.Player;

public class VideoImpl implements Player {

	@Override
	public void start(int volumn) {
		System.out.println("VideoImpl start(int volumn) 호출");
	}

	@Override
	public String pause() {
		System.out.println("VideoImplpause() 호출");
		return "Video리턴값!";
	}

	@Override
	public void stop() {
		System.out.println("VideoImpl stop() 호출");

	}

}
