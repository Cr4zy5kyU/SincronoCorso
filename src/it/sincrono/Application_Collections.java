package it.sincrono;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application_Collections {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

		hs.add("1");
		hs.add("22");
		hs.add("333");
		hs.add("4444");
		hs.add("55555");
		hs.add("666666");
		hs.add("7777777");
		hs.add("88888888");
		hs.add("999999999");
		hs.add("0000000000");
		hs.add("1111111111");
		hs.add("AAAAAAAAAAAAAAAAAAAAAAAA");
		System.out.println(hs.toString());

		System.out.println("La stringa piu' lunga e': " + longest(hs.iterator()));
		System.out.println("Le stringhe piu' lunghe sono:");
		System.out.println(longests(hs.iterator()));

	}

	private static String longest(Iterator<String> i) {
		String longest = "", tmp;

		while (i.hasNext())
			if ((tmp = i.next()).length() > longest.length())
				longest = tmp;
		return longest;
	}

	private static String longests(Iterator<String> i) {
		String longests = "", tmp;
		int longest = longests.length();

		while (i.hasNext()) {
			tmp = i.next();
			if (tmp.length() == longest)
				longests += tmp + "\n";
			else if (tmp.length() > longest) {
				longest = tmp.length();
				longests = tmp + "\n";
			}
		}
		return longests;
	}

}
