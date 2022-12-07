package java_session_17thnov_2022;

import com.google.common.base.Strings;

public class Poly_overload {

	public static void main(String[] args) {

		Poly_overload obj = new Poly_overload();
		obj.display();
		obj.display(10);
		obj.display(11, 12);
		obj.display("java");
		obj.display("hello", "world");
		obj.display(new StringBuffer("anything"));
		obj.display(new StringBuilder("anything"));
		obj.display("name", new StringBuffer("anything"), new StringBuilder("anything"));

	}

	private void display(int i, int j) {
		// TODO Auto-generated method stub

	}

	public void display() {
		System.out.println("This is a non-parameterized method ");

	}

	public void display(int i) {
		System.out.println("This is a single int type parameterized");

	}

	public void display(String S) {
		System.out.println("This is a single string type parameterized method");

	}

	public void display(String s1, String s2) {
		System.out.println("this is a multiple string type parameterized method");

	}

	public void display(StringBuffer s3) {
		System.out.println("this is a Single stringBuffer type parameterized method");

	}

	public void display(StringBuilder s4) {
		System.out.println("This is a single stringBuider type parameterized method");

	}

	public void display(String string, StringBuffer s6, StringBuilder s7) {
		System.out.println("this is a multiple string,stringBuffer and StringBuilder type parameterized method");

	}

}
