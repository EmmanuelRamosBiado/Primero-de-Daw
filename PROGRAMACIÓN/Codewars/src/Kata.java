import java.util.Iterator;

public class Kata {

	public static int speedLimit(final int speed, final int[] signals) {
		int multa = 0;

		for (int i = 0; i < signals.length; i++) {
			if (speed -signals[i] >= 10 || speed -signals[i] <= 19) {
				multa += 100;
			} else if (speed -signals[i] >= 20 || speed -signals[i] <= 29) {
				multa += 250;
			} else if (speed -signals[i] >= 30) {
				multa += 500;
			}
		}

		return multa;
	}
}