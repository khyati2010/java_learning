package pratise.test;

import java.util.Comparator;

/**
 * Comparator implementation which sorts Person objects on person_id field
 */
public class SortByPerson_ID implements Comparator{

    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2; 
        return p1.getPersonId() - p2.getPersonId();
    }
}

//Read more: http://javarevisited.blogspot.com/2011/06/comparator-and-comparable-in-java.html#ixzz4YF9LiGCw