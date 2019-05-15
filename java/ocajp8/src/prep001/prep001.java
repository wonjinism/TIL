package prep001;

public class prep001 {
	public static void main(String[] args) {
		String[] strs = new String[2];
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" element " + idx); // NullPointException
			idx++;
		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}