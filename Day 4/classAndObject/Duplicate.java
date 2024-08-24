package classAndObject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		  List<Integer> li = Arrays.asList(12,12,1,2,3,4,2,4);
		  HashSet<Integer> hs = new HashSet<>();
		  for(Integer i : li) {
		   if(hs.contains(i)) {
		    System.out.println(i);
		   }
		   hs.add(i);
		  }
		 }
}
