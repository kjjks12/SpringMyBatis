package kosta.test.video;

import org.springframework.stereotype.Service;

import kosta.service.Player;


@Service
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
