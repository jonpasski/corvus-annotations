package us.coastalhacking.corvus.itest.java;

public class Foo {

	@SuppressWarnings("unused")
	private void biz(String foo) {
		String bar = foo.replaceAll("\\", "\\\\");
		bar = foo.replaceAll("'", "\\'");
		System.out.println(foo);
	}
}
