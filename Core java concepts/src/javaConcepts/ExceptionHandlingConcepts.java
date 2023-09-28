package javaConcepts;

import java.io.*;
import java.util.*;

public class ExceptionHandlingConcepts {

	public void arthimeticExceptions() { // unchecked Exceptions - run time exceptions

		int a = 5, b = 0;
		int c;
		try {
			c = a / b;
			System.out.println("value " + c);
		} catch (ArithmeticException err) {
			System.err.println("ArithmeticExceptions handled " + err);
		}
		System.out.println("End of the arthimeticExceptions method \n");
	}

	public void nullPointerExceptions() { // unchecked Exceptions - run time exceptions
		int a[] = null;
		try {
			System.out.println("value " + a[3]);
		} catch (NullPointerException err) {
			System.err.println("NullPointerExceptions handled " + err);
		}
		System.out.println("End of the nullPointerExceptions method \n");
	}

	public void MultiplecatchExceptions() { // unchecked Exceptions - run time exceptions
		int a = 5, b = 0;
//		int a=5,b=5;
		int c;
		int d[] = null;
		try {
			c = a / b;
			System.out.println("value " + d[3]);
		} catch (NullPointerException err) {
			System.err.println("NullPointerExceptions handled " + err);
		} catch (ArithmeticException err) {
			System.err.println("ArithmeticExceptions handled " + err);
		} catch (Exception err) {
			System.err.println("ArithmeticExceptions handled " + err);
		} finally {
			System.out.println("this get print even when we get exception in the program");
		}
		System.out.println("End of the MultiplecatchExceptions method \n");
	}

	public void singlecatchExceptions() { // unchecked Exceptions - run time exceptions
		int a = 5, b = 0;
//		int a=5,b=5;
		int c;
		int d[] = null;
		try {
			c = a / b;
			System.out.println("value " + d[3]);
		} catch (NullPointerException | ArithmeticException err) {
			System.err.println("NullPointerExceptions handled " + err);
		} catch (Exception err) {
			System.err.println("ArithmeticExceptions handled " + err);
		} finally {
			System.out.println("this get print even when we get exception in the program");
		}

		System.out.println("End of the singlecatchExceptions method \n");
	}

	public void fileExceptions() { // checked Exceptions - compile time exceptions
		File fi = new File("abc.txt");
		try {
			FileInputStream fs = new FileInputStream(fi);
		} catch (FileNotFoundException e) {
			System.out.println("fileExceptions handled " + e);
			e.printStackTrace();
		}
		System.out.println("End of the fileExceptions method \n");
	}

	public void ioExceptions() {
//		try (Scanner sc = new Scanner(System.in)) { // try with resource
//			System.out.println("Enter the user input...");
//			int test = sc.nextInt();
//			System.out.println("user input " + test);
//		}

		double amount = 500, withdrawal = 700;
		try {
			if (amount < withdrawal) {
				throw new InsuffientBalance(withdrawal - amount);
			}
		} catch (Exception e) {
			System.err.println("Amount insuffient " + e);
		}
		System.out.println("End of the ioExceptions method \n");
	}

	public static void main(String[] args) {

		ExceptionHandlingConcepts ex = new ExceptionHandlingConcepts();
		ex.arthimeticExceptions();
		ex.nullPointerExceptions();
		ex.MultiplecatchExceptions();
		ex.singlecatchExceptions();
		ex.fileExceptions();
		ex.ioExceptions();
	}

}
