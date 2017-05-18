package kosta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kosta.service.Player;

public class MainApp {

	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Player tvPlayer=context.getBean("tvImpl",Player.class);
		tvPlayer.start(10);
		tvPlayer.pause();
		tvPlayer.stop();
		
		Player audioPlayer=context.getBean("aduioImpl",Player.class);
		audioPlayer.start(20);
		audioPlayer.pause();
		audioPlayer.stop();
		
		
		Player videoPlayer=context.getBean("videoImpl",Player.class);
		videoPlayer.start(30);
		videoPlayer.pause();
		videoPlayer.stop();
		
		
		
		
		
		
	}
}
