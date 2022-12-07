package java_session_17thnov_2022;

public class Inc_Dec_operators {

	public static void main(String[] args) {
		int i = 1;
		int j = i-- - --i;
		int k = i-- - ++j - j-- - --j + j++;
		int l = i++ + ++i - --i + k-- - --k;

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
