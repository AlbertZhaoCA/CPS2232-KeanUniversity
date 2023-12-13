# DataStructure
All code written in CPS 2232 (DATA STRUCTURES) @Kean University

[Preparation For Data Structure][pre]    
[Generics][generics]  
[Hashing Technique][hash]  
[*Sorting*][sa]  
[lambda expression](./src/lambda)  
[BST](./src/tree)  
[RBT](https://oi-wiki.org/ds/rbtree/)
[also see RBT ](https://www.javatpoint.com/red-black-tree)
## Abstract Data Type (ADT)
An abstract data type (ADT) is a set of objects such as `lists`, `sets`, `arrays`, `queues`, `graphs`, and their operations, can 
be viewed as ADTs, just as integers, real, and boolean are data types. together with a set of operations on the objects. The set of operations defines the interface of the ADT. The implementation of the operations defines the implementation of the ADT. The implementation of an ADT is called a data structure.

ADTs are mathematical abstractions consists of `data type` and `operations` on the data type. 

Modern programming languages e.g. Java, C, C++, python, etc., supports a form of ADTs when a class is used as a type, like… 

int x; // primitive integer type  
GenericStack stack; // class type declaration

![img.png](img.png)

In Java, the `Collection interface` defines the common operations for  
[lists](./src/list), store an ordered collection of elements.    
vectors,       
[stacks](./src/stack), store objects that are processed in a last-in, first-out fashion (LIFO).  
[queues](./src/queue), store objects that are processed in a first-in, first-out fashion (FIFO). 
priority queues, store objects that are processed in the order of their priorities     
and [sets](./src/set), store a group of nonduplicate elements.   

The Java Collections Framework supports two types of **containers**:   
■■ One for storing a collection of elements is simply called a _collection_.  
■■ The other, for storing `key/value pairs`, is called a _map_.

![img_1.png](img_1.png)
The AbstractCollection class provides partial implementation for the Collection interface.
It implements all the methods in Collection except the add(), size(), and iterator() methods.  
And these are implemented in the concrete subclasses 

![img_2.png](img_2.png)  
![img_3.png](img_3.png)
![img_8.png](img_8.png)


## UML
 ![img_4.png](img_4.png) 
 ![img_5.png](img_5.png)
 ![img_6.png](img_6.png)
![img_7.png](img_7.png)


##  Dynamic Programming
Dynamic programming is a technique for solving problems recursively. It is applicable to problems that exhibit the properties 
of overlapping subproblems which are only slightly smaller and optimal substructure which means that an optimal solution 
to the problem contains within it optimal solutions to subproblems.  
storing the results of the subproblem for reuse to avoid recomputing same results again

DP can often be used to produce polynomial-time algorithms to solve problems in O(n), that seem to require exponential time O(2^n).
![img_9.png](img_9.png)![img_10.png](img_10.png)![img_11.png](img_11.png)![img_12.png](img_12.png)![img_13.png](img_13.png)






[sa]: ./src/sort
[pre]: ./src/preparation   
[hash]: ./src/hashing   
[generics]: ./src/generics