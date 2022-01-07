package MurderCase_In_SMHRD;

import java.util.concurrent.TimeUnit;


	public class Delay {
		
		public void timeDelay(long millisec) {
			try {
//				TimeUnit.SECONDS.sleep(second);
				TimeUnit.MILLISECONDS.sleep(millisec);
			} catch (Exception e) {

			}
		}
}
