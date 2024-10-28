package Code.Collections;


public class List_Detailed {
    /* 
    List
    =======
        - It is the child interface of Collection. 
        - If we want to represent a group of individual objects as a single entity where duplicates are allowed,
          insertion order must be preserved, then we should go for List.

        - We can preserve insertion order via index. We can differentiate b/w duplicate objects using index. Hence,
           index will play very important role in List.

        - List interface defines the following specific 8 methods:

          - void add(int index, Object o)
          - boolean addAll(int index, Collection c)
          - Object get (int index)
          - Object remove (int index)
          - Object set (int index, Object o): to replace the element present at specified index with provided Object and returns old object
          - int indexOf(Object o): returns index of first occurrence of the given object
          - int lastIndexOf(Object o)
          - ListIterator listIterator()

         ArrayList
        ===========

        - The underlying DS is Resizable Array or Growable Array.
        - Duplicates are allowed and insertion order is preserved.
        - Heterogeneous Objects are allowed ( In Collection Framework, Heterogeneous Objects are allowed everywhere except TreeSet and Treemap).
        - null insertion is allowed.

        Constructors:
        ------------
        - new ArrayList() : creates an empty ArrayList with default initial capacity 10. Once it reaches its max capacity, then a new 
          ArrayList object will be created with new capacity = (current-capacity*3/2) + 1 .

        - new ArrayList(int initialCapacity) : creates an empty ArrayList with specified initial capacity.

        - new ArrayList(Collection c): creates an equivalent ArrayList object for the given collection.

        Important:
        -----------
        - Usually, we can use collections to hold and transfer objects from one location to another location. To provide support 
         for this requirement, every collection class by default implements Serializable and Cloneable interfaces. Cloneable helps create a clone of an object.

        - ArrayList and Vector classes implements RandomAccess interface so that any random element can be accessed with the same speed.
          RandomAcess interface is present in java.util package and it doesn't contain any methods. It is a marker interface, where required ability will be provided
         automatically by the JVM.
         
        - ArrayList is the best choice if our frequent operation is retrievala as it implements RandomAccess interface.
         However, it is the worst choice if our frequent operation is insertion or deletion in the middle.

        ArrayList vs Vector:
        ===================
        1. Every method present in the AL is non-synchronized. 
          Every method present in the vector is synchronized.

        2. Multiple threads can operate simultaneously on a AL object, hence not thread-safe.
          Only one thread can operate on a vector object at any time, hence thread-safe.
         
        3. AL performs better as threds don't have to wait. Vector lacks in performance as threads have to wait.

        # We can get synchronized version of AL object by using the `public static List synchronizedList(List l)` method of Collections class:

           List synced_list = Collections.synchronizedList(new AL());

        Similarly, we can get synchronized version of Set and Map objects by using the following methods of Collections class:

         - public static Set synchronizedSet(Set s)
         - public static Map synchronizedMap(Map m)

        // start from part 4 40:24
    */

    
}
