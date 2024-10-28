package Code.Collections;



public class KeyInterfaces {
    /* 
        9 Key Interfaces of Collection Framework:
        ------------------------------------------

        1. Collection 
        2. List
        3. Set
        4. SortedSet
        5. NavigableSet
        6. Queue
        7. Map
        8. SortedMap
        9. NavigableMap
    
        Collection (I):
        -----------
        - If we want to represent a group of individual objects as a single entity, we use collections. 

        - Collection interface defines the most common methods applicable for any collection object.

        - In general, collection interface is considered as root interface of collection framework.

        - There is no concrete class that implements Collection interface directly

        Difference b/w Collection and Collections:
        -----------------------------------------
        - Collection is an interface to represent a group of individual objects as a single entity. 

          Collections is an utility class present in java.util package to define several utility methods for 
           Collection objects (like sorting, searching etc.)

        List (I):
        --------
        - It is the child interface of Collection. 
        - If we want to represent a group of individual objects as a single entity where duplicates are allowed,
          insertion order must be preserved, then we should go for List.

        - Classes that implement List are: ArrayList, LinkedList, Vector. Vector class has a child-class named as Stack which also implements List.

        - Vector and Stack are called legacy classes as they were introduced in Java before Collection. After Collection was added,
          Vector and Stack were modified to implement List Interface.
          
        Set (I):
        --------
        - It is a child interface of Collection.
        - If we want to represent a group of individual objects as a single entity where duplicates are not allowed,
         but insertion order is not required then we should go for Set.

        - Classes implementing Set are: HashSet. HashSet has a child-class named as LinkedHashSet which also implements Set.

        SortedSet (I):
        --------------
        - It is a child interface of Set.
        - If we want to represent a group of individual objects as a single entity where duplicates are not allowed,
         but all objects should be inserted acc. to some sorting order then we should go for SortedSet.

        NavigableSet (I):
        --------------
        - It is a child interface of SortedSet.
        - It contains several methods for navigation purposes.
        - Classes implementing NavigableSet : TreeSet . TreeSet was introduced before NavigableSet and later it was modified
         to implement NavigableSet.

        Queue (I):
        -----------
        - It is a child interface of Collection.
        - If we want to represent a group of individual objects prior to processing, then we should go for Queue.

        - Usually Queue follows FIFO order. But based-on our requirement, we can implement our own priority order also.
        
        - Implementation Classes: PriorityQueue, DeQueue, BlockingQueue etc. BlockingQueue has child-classes named as LinkedBlockingQueue and PriorityBlockingQueue
          which also implement Queue.

        =========================
        Note: All the above interfaces (Collection, List, Set, SortedSet, NavigableSet and Queue) meant for representing a group of individual 
         objects. If we want to represent, a group of objects as key-value pairs then we should go for Map.
        =========================

        Map (I):
        -------
        - Map is not a child-interface of Collection. If we want to represent a group of objects as key-value pairs then we should go for Map.

        - Both key and values are objects. Duplicate keys are not allowed. But duplicate values are allowed.
        
        - Implementation Classes: HashMap, WeakHashMap, IdentityHashMap, Hashtable. HashMap has a child-class LinkedHashMap that implements Map.
            Hashtable has an abstract parent-class called Dictionary and a child-class called Properties.

        SortedMap (I):
        -------------
        - It is a child-interface of Map. If we want to represent a group of key-value pairs acc. to some-sorting order of keys then we should go for
         SortedMap.
        - In SortedMap, the sorting should be based on keys, but not on values.

        NavigableMap(I):
        ---------------
        - It is a child-interface of SortedMap.
        - It defines several methods for navigation purposes. 
        - Implementation Class: TreeMap


      Notes:
      -------
      #  The following are Legacy Characters present in Collection Framework:
        - Enumeration (I)
        - Dictionary (Abstract Class)
        - Vector Class
        - Stack Class
        - Hashtable Class
        - Properties Class

      # For Sorting, we use
      
        - Comparable (I) => For default natural sorting
        - Comparator (I) => For customized sorting

      # For getting values one by one from Collection, we use cursors. Different cursors are:

        - Enumeration (I)
        - Iterator (I)
        - ListIterator (I)

      # In Collection Framework, there are two utility classes:
      
        - Collections
        - Arrays
    */

    
}

