package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
//@EnableAspectJAutoProxy //For AspectJ proxy on
public class CDPlayerConfig {
	
	
	@Bean
	public CompactDisc sgtPeppers() {
		
		String title="Wow wow wow";
		
		String artist="Benny Hill";
		
		return new SgtPeppers(title, artist);
	}
	
	/*@Bean(name="player")
	public MediaPlayer mediaPlayer() {
		
		return new MediaPlayer(sgtPeppers());
	}*/
	
	
	@Bean(name="player")
	public MediaPlayer mediaPlayer(CompactDisc compactDisk) {
		
		return new MediaPlayer(compactDisk);
	}

}
