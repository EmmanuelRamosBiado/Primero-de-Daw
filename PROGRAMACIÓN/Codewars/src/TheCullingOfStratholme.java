public class TheCullingOfStratholme {
	public static String purify(String s) {

		String noInfectados = "";

		for (int i = 0; i < s.length(); i++) {
			if(i==0) {
				if (s.charAt(i + 1) != 'i' || s.charAt(i) == ' ') {
					noInfectados += s.charAt(i);
				}
			}
			if (i > 0) {
				if (s.charAt(i - 1) != 'i' || s.charAt(i + 1) != 'i' || s.charAt(i) == ' ') {
					noInfectados += s.charAt(i);
				}
			}
			
		}
		return noInfectados;
	}
}