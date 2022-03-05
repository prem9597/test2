package org.login;

public class Sg {
	String s="Premkumarwee";
	String s1="premkumarwee";
	private char charc(int a) {
	      char charAt = s.charAt(a);
	      
		return charAt;
		}
	int inte(char b) {
		int indexOf = s.indexOf(b);
	return indexOf;
	}
	int intlast(char lastb) {
		int lastIndexOf = s.lastIndexOf(lastb);
		return lastIndexOf;
	}
	private String uppercase() {
		String upperCase = s.toUpperCase();
		return upperCase;

	}
	String Lower() {
		String lowerCase = s.toLowerCase();
		return lowerCase;
	}
	boolean emp() {
		boolean empty = s.isEmpty();
		return empty;
	}
	boolean start(String b) {
		boolean startsWith = s.startsWith(b);
		return startsWith;
	}
	boolean end(String c) {
		boolean endsWith = s.endsWith(c);
		return endsWith;
		
	}
	boolean cons(String d) {
		boolean contains = s.contains(d);
		return contains;
	}
		boolean equal() {
			boolean equals = s.equals(s1);
			return equals;
		}
		boolean ingo() {
	    boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	    return equalsIgnoreCase;
		}
		int com() {
			int compareTo = s.compareTo(s1);
			return compareTo;
		}
		int length() {
			int length = s.length();
			return length;
		}
		String rep(char a,char b) {
			String replace = s.replace(a, b);
			return replace;
		}
		String repl(String a,String b) {
			String replaceAll = s.replaceAll(a, b);
			return replaceAll;
		}
		String trim() {
			String trim = s.trim();
			return trim;
		}
		String Sub(int a,int b) {
			String substring = s.substring(a, b);
			return substring;
			
		}
		String sub(int a) {
			String substring = s.substring(a);
			return substring;
		}
	
		
		public static void main(String[] args) {
			Sg a=new Sg();
			char charc = a.charc(4);
			System.out.println(charc);
			int inte = a.inte('m');
			System.out.println(inte);
			
			int intlast = a.intlast('m');
			System.out.println(intlast);
			String uppercase = a.uppercase();
			System.out.println(uppercase);
			String lower = a.Lower();
			System.out.println(lower);
			boolean emp = a.emp();
			System.out.println(emp);
			boolean start = a.start("P");
			System.out.println(start);
			boolean end = a.end("r");
			System.out.println(end);
			boolean cons = a.cons("prem");
			System.out.println(cons);
			boolean equal = a.equal();
			System.out.println(equal);
			boolean ingo = a.ingo();
			System.out.println(ingo);
			int com = a.com();
			System.out.println(com);
			int length = a.length();
			System.out.println(length);
			String rep = a.rep('P','m');
			System.out.println(rep);
			String repl = a.repl("kumar","prem");
			System.out.println(repl);
			String sub = a.sub(4);
			System.out.println(sub);
			String c = a.Sub(4, 8);
			System.out.println(c);


		}
		
	}


