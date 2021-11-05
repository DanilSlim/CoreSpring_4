package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MediaPlayer {
	
	private CompactDisc compactDisc;
	
	@Autowired
	public MediaPlayer(CompactDisc compactDisc) {
		
		this.compactDisc=compactDisc;
	}
	
	public void getCDSound() {
		
		compactDisc.play();
	}

}
