package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlsitconcept {
public static void main(String[] args) {
   LinkedList<String>	ll=new LinkedList<String>();
   ll.add("Test");
   ll.add("java");
   ll.add("selenium");
   ll.add("QTP");
   ll.add("HPALM");
   ll.add("QC");
    System.out.println("Content of Linked List" +ll);
    System.out.println("***********************");
   //addFirst Method
   ll.addFirst("Computer");
   System.out.println("***********************"); 
   //addLast Method
   ll.addLast("Training");
    System.out.println("Content of Linked List" +ll);
   System.out.println("***********************");
   // get value by index
    System.out.println(ll.get(4));
  //set()Method --
 // It replaces the element at the specified position in a list with the specified element.
  ll.set(3, "Tom");
  System.out.println(ll.get(3));
  System.out.println("Content of Linked List" +ll);
  // int size()  Method
  // It is used to return the number of elements in a list

  LinkedList<String>	ll1=new LinkedList<String>();
  ll1.add("Test");
  ll1.add("java");
  ll1.add("selenium");
  ll1.add("QTP");
  ll1.add("HPALM");
  ll1.add("QC");
  int size=ll1.size();
   System.out.println("Size of list:" +size);
   System.out.println("***********************");
    //Remove first and last element
    ll1.removeFirst();
   ll1.removeLast();
   System.out.println("Content of Linked List" +ll1);
   System.out.println("***********************");
 //how to remove specific position on basis of index
   ll1.remove(0);
   System.out.println("Content of Linked List" +ll1);
   System.out.println("***********************");
 //Ways to iterate all values from linked list
 //1)for loop
   for (int i=0; i<ll1.size();i++){
  	System.out.println(ll1.get(i));
   }
// 2)for each loop
  for(String str:ll1){
     System.out.println(str);
// }
// 3)using iterator
     Iterator<String> it=   ll1.iterator();
      while(it.hasNext()){
    	System.out.println(it.next());
    // using while loop
    	 int num=0;
    	 while(ll1.size()>num){
    		 System.out.println(ll1.get(num));
    		 num++;
    	 }
    	 
    	 
    	 
    	 
    	  
      }
  }
}
}
   





