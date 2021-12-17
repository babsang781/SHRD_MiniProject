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
		mp3.play("C://music/playRain.mp3"); // �ø���
	}

	public void playScream() {
		mp3.play("C://music/playScream.mp3");
	}

	public void playButten() {
		mp3.play("C://music/playButton.mp3"); // ��ǻ�� Ű�� �Ҹ�(����)
	}

	public void playWalk() {
		mp3.play("C://music/playWalk.mp3"); // �ڸ���

	}

	public void playOpen() {
		mp3.play("C://music/playOpen.mp3"); // ª��
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
	
///////////////////////////////	//////////////////////////////////////////////////////�߰���////////////////////////////////////////////////////////
	
	public void playCatch() {
		mp3.play("C://music/playCatch.mp3");
	}

	public void playCabinetOpen() {
		mp3.play("C://music/playCabinetOpen.mp3"); // ĳ��� ���� �Ҹ�
	}

	public void playDrawerOpen() {
		mp3.play("C://music/playDrawerOpen.mp3");
	}
	
	public void playGrope() {
		mp3.play("C://music/playGrope.mp3");
	}

}
