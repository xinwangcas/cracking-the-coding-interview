public class IsUnique{

	public static void main(String[] args) {
		String str = args[0];
		if (isUnique(str)) {
			System.out.println(str + " is unique.");
		} else {
			System.out.println(str + " is NOT unique.");
		}
	}

	public static boolean isUnique(String str) {
		boolean[] arr = new boolean[10];
		for (char c: str.toCharArray()) {
			int cur = c - '0';
			if (cur < 0 || cur > 9) {
				continue;
			}
			if (arr[cur]) {
				return false;
			}
			arr[cur] = true;
		}
		return true;
	}
}
