package prg2j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listex {
	public static void main(String[] args){
	List<String> list = new ArrayList<String>();
	list.add("AAA");
	list.add("AAA");
	list.add("BBB");
	list.add("BBB");
	list.add("CC");
	list.add("CC");
	list.add("XXX");
	list.add("XXX");
	list.add("PP");
	list.add("QQ");
	list.add("XXX");
	list.add("XXX");
	Collections.sort(list);
	Collections.reverse(list);
	Set<String> unique = new HashSet<String>(list);
	
	for (String key : unique) {
		
	    System.out.println(key + ": " + Collections.frequency(list, key));
	    
	}
}
}
