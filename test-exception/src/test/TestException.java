package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestException {

	public static void main(String[] args) {

			try {
				readFile();
			} catch (Exception e1) {
				if(e1 instanceof NumberFormatException) {
					
				}
				if(e1 instanceof FileNotFoundException) {
					
				}
			}
				

		add(0, "5");

		String number = "a100";
		try {
			System.out.println("begin");
			meth(number);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException Exception occurs : " + e.fillInStackTrace());
			System.exit(0);
		} finally {
			System.out.println("finaly");
		}

		System.out.println("rest of the code");

	}

	private static void meth(String number) {
		try {

			int a[] = new int[5];
			a[4] = 30 / 3;

			Integer.parseInt(number);

			String[] tab = new String[5];
			System.out.println("succes");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");

		} catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
			e.printStackTrace();

		} finally {
			System.out.println("La vie est belle");
		}

	}

	/**
	 * 
	 * @param a
	 * @param str
	 * @return
	 * @throws NumberFormatException
	 */
	public static int add(int a, String str) throws NumberFormatException {
		int b = Integer.parseInt(str);
		a = a + b;
		return a;
	}

	public int addTry(int a, String str) {
		try {
			int b = Integer.parseInt(str);
			a = a + b;
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		return a;
	}

	public static void readFile() throws Exception{

		FileReader fr = new FileReader(new File("file"));

	}

}
