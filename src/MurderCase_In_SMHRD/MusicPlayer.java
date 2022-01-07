package MurderCase_In_SMHRD;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	MP3Player mp3 = new MP3Player();

	public void stopMusic() {

		mp3.stop();
	}

	public boolean isPlaying() {
		return mp3.isPlaying();
	}

/////////////////////////////////////////////////

	public void goodEnding() {
		mp3.play("./music/goodEnding.mp3");
	}

	public void playScream() {
		mp3.play("./music/playScream.mp3");
	}

	public void playRain() {
		mp3.play("./music/playRain.mp3");
	}

	public void playButten() {
		mp3.play("./usic/playButton.mp3");
	}

	public void playWalk() {
		mp3.play("./music/playWalk.mp3");

	}

	public void playOpen() {
		mp3.play("./music/playOpen.mp3");
	}

	public void playPushing() {
		mp3.play("./music/playPushing.mp3");
	}

	public void badEnding() {
		mp3.play("./music/badEnding.mp3");
	}

	public void playCatch() {
		mp3.play("./music/playCatch.mp3");
	}

	public void playCabinetOpen() {
		mp3.play("./music/playCabinetOpen.mp3");
	}

	public void playDrawerOpen() {
		mp3.play("./music/playDrawerOpen.mp3");
	}

	public void playGrope() {
		mp3.play("./music/playGrope.mp3");
	}

}