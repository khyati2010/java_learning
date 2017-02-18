package pratise.test;
public class Person implements Comparable {
    private int person_id;
    private String name;
    
    /**
     * Compare current person with specified person
     * return zero if person_id for both person is same 
     * return negative if current person_id is less than specified one
     * return positive if specified person_id is greater than specified one
     */
    public int compareTo(Object o) {
        Person p = (Person) o; 
        return this.person_id - o.person_id ;
    }
}

//Read more: http://javarevisited.blogspot.com/2011/06/comparator-and-comparable-in-java.html#ixzz4YF9Apm00