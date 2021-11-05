package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		
		//MediaPlayer player=ctx.getBean(MediaPlayer.class);//Component scan
		
		MediaPlayer player=(MediaPlayer) ctx.getBean("player");//Explicit configuration
		
		player.getCDSound();
		
		System.out.println("Java Config");

	}

}
