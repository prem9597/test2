package org.login;

public class mem {
	public static void main(String[] args) {
		
		String a="prem";
		String b="prem";
		
		int identityHashCode = System.identityHashCode(a);
		System.out.println(identityHashCode);
		int identityHashCode2 = System.identityHashCode(b);
		System.out.println(identityHashCode2);
		String concat = a.concat(b);
		
		System.out.println(System.identityHashCode(concat));
		
		
		
		
		
		String c=new String("ravi");
		String d=new String("ravi");
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		
		
		StringBuffer g=new StringBuffer("prem");
		StringBuffer h=new StringBuffer("prem");
	   StringBuffer append = g.append(h);
	   System.out.println(System.identityHashCode(g));
	   System.out.println(System.identityHashCode(h));
	   System.out.println(System.identityHashCode(append));
		
	}

}
