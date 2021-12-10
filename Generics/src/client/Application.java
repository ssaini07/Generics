package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Container<Integer, String> container = new Container<>(12, "Shubham");
        //container.getItem1();
        
        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("Shubham");
        mySet1.add("Akshay");
        mySet1.add("Julekha");
        mySet1.add("Durgesh");
        
        Set<String> mySet2 = new HashSet<String>();
        mySet2.add("Shubham");
        mySet2.add("Akshay");
        mySet2.add("Julekha");
        mySet2.add("Durgesh");
        
        Set<String> resultSet = union(mySet1, mySet2);
        
        Iterator<String> itr = resultSet.iterator();
        while(itr.hasNext()) {
        	String var = itr.next();
        	System.out.println(var);
        	System.out.println("Hello there!......");
        	System.out.println("Hello there!......");
        	System.out.println("Hello there!......");
        }
 
	}
	
	//Creating generic methods now
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}
}
