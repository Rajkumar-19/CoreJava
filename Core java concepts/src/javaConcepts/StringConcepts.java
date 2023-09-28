package javaConcepts;

public class StringConcepts {

	public static void main(String[] args) {
String s1="hi";
String s2="hi";
System.out.println("s1 identity hashcode "+System.identityHashCode(s1));
System.out.println("s1 identity hashcode"+ System.identityHashCode(s2));
System.out.println(System.identityHashCode(s1) == System.identityHashCode(s2));
s2="test";
System.out.println(s1+","+s2);
//String using objects

String s3 =new String("hi");
String s4 =new String("hi");
System.out.println("s3 identity hashcode "+System.identityHashCode(s3));
System.out.println("s4 identity hashcode"+ System.identityHashCode(s4));
System.out.println(System.identityHashCode(s3) == System.identityHashCode(s4));

//String functions

	String dev = "developer";
	String test = "tester";
	System.out.println(dev.concat(test)); //concat()
	System.out.println(dev+test);
	dev.concat(test);
	System.out.println(dev);
	//String is immutable 
	
	System.out.println(dev.length()); //length()
	
	System.out.println(dev.substring(2,4)); //substring()
	String testSubstring = dev.substring(2,5);
	System.out.println(testSubstring);
	
	System.out.println(String.valueOf(1.1) instanceof String);  // String Type check  
	//& valueOf() converts any into string
	
	System.out.println("is dev & test are equal "+dev.equals(test)); //equals()
	
	String devUp = dev.toUpperCase();
	System.out.println(dev.toUpperCase()); //toUppercase()
	System.out.println(devUp.toLowerCase()); //toLowerCase()
	
	System.out.println( "contains sting method "+dev.contains("ev")); // contains()
	
	
	//String buffer & String builder - both are mutable
	
	StringBuffer d1 = new StringBuffer("one");
	d1.append("_two");
	System.out.println(d1); //stringBuffer is synchronized, it is thread safe 
	
	StringBuilder d2 = new StringBuilder("one");
	d2.append("_two"); //StringBuilder is not synchronized / Asynchronized 
	System.out.println(d2);
	
	System.out.println(System.identityHashCode(d1));
	System.out.println(System.identityHashCode(d2));
	}
}
