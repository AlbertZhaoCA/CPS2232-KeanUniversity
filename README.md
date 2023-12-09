# DataStructure
All code written in CPS 2232 (DATA STRUCTURES) @Kean University

[Preparation For Data Structure][pre]    
[Generics][generics]  
[Hashing Technique][hash]  
[*Sorting*][sa]

## Abstract Data Type (ADT)
An abstract data type (ADT) is a set of objects such as `lists`, `sets`, `arrays`, `queues`, `graphs`, and their operations, can 
be viewed as ADTs, just as integers, real, and boolean are data types. together with a set of operations on the objects. The set of operations defines the interface of the ADT. The implementation of the operations defines the implementation of the ADT. The implementation of an ADT is called a data structure.

ADTs are mathematical abstractions consists of `data type` and `operations` on the data type. 

Modern programming languages e.g. Java, C, C++, python, etc., supports a form of ADTs when a class is used as a type, like… 

int x; // primitive integer type  
GenericStack stack; // class type declaration

![img.png](img.png)

In Java, the `Collection interface` defines the common operations for [lists](./src/list), vectors, [stacks](./src/stack), 
[queues](./src/queue), priority queues, and [sets](./src/set).

The Java Collections Framework supports two types of **containers**:   
■■ One for storing a collection of elements is simply called a _collection_.  
■■ The other, for storing `key/value pairs`, is called a _map_.

![img_1.png](img_1.png)

[sa]: ./src/sort
[pre]: ./src/preparation   
[hash]: ./src/hashing   
[generics]: ./src/generics