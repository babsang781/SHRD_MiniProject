package murderCase_of_SMHRD;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	MP3Player mp3 = new MP3Player();

	public void stopMusic() {

		mp3.stop();
	}
	
	public boolean isPlaying() {
		return mp3.isPlaying();
	}

	public void playRain() {
		mp3.play("C://music/playRain.mp3"); // 늘릴거
	}

	public void playScream() {
		mp3.play("C://music/playScream.mp3");
	}

	public void playButten() {
		mp3.play("C://music/playButton.mp3"); // 컴퓨터 키는 소리(예비)
	}

	public void playWalk() {
		mp3.play("C://music/playWalk.mp3"); // 자를거

	}

	public void playOpen() {
		mp3.play("C://music/playOpen.mp3"); // 짧음
	}

	public void playPushing() {
		mp3.play("C://music/playPushing.mp3");
	}

	public void goodEnding() {
		mp3.play("C://music/goodEnding.mp3");
	}

	public void badEnding() {
		mp3.play("C://music/badEnding.mp3");
	}
	
///////////////////////////////	//////////////////////////////////////////////////////추가본////////////////////////////////////////////////////////
	
	public void playCatch() {
		mp3.play("C://music/playCatch.mp3");
	}

	public void playCabinetOpen() {
		mp3.play("C://music/playCabinetOpen.mp3"); // 캐비넷 여는 소리
	}

	public void playDrawerOpen() {
		mp3.play("C://music/playDrawerOpen.mp3");
	}
	
	public void playGrope() {
		mp3.play("C://music/playGrope.mp3");
	}

}
