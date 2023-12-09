# Generics 
_Generics_ is the capability to **_parameterize types_**: use of characters to represent **object
or reference types** (not primitive type), which define a class or a method with generic types that can be
substituted (using concrete types) by the compiler.  

This can be on class headers, data fields, method headers
```java
    public class Stack<E>{//class header
    int pointer;
    int E;//data filed
    
    public static <E> int getPointer() {//method header for static method
    }
    
   public static <E> E doSomething(){
        
  }

  public static void add(E e){ // markdown did not show bug here :<  
        //this method will throw an error, if you did not declare its generic type after static
        //clue: static methods are class methods 
  }
  
      
    
}
```

generics in class header and method header are different [see](./GenericNumbers.java)   
> that is why the following throw an error  
> public &lt;E&gt; E returned(){  
> }
> 

A generic class or method permits you to specify allowable types of
objects that the class or method can work with.

* E - Element (used extensively by the Java Collections Framework)  
* K - Key  
* N - Number
* T - Type
* V - Value
* S,U,V etc. - 2nd, 3rd, 4th types  
  
Benefits of Generics?
  * The key benefit of generics is to enable errors to be detected at` compile
  time` rather than at `runtime`. ![img_1.png](img_1.png)
  * A generic class or method permits you to specify `allowable types` of objects
  that the class or method can work with ![img.png](img.png)
  * If you attempt to use the class or method with an incompatible object, a
  compile error occurs.
   
A generic type &lt;E&gt; can be used to define generic class or interface.  
A generic type < E > also allow the definition of a generic method.  
A concrete type (or actual parameter type) must be specified when using the class to create an object or using the class
or interface to declare a reference
variable.   
The concrete type must be a `reference type`, namely:
_String_, _Wrapper classes_ e.g. Integer, Double, etc., _User defined type_ e.g. class Student  
![img_2.png](img_2.png)

## Raw Types and Backward Compatibility 
A generic class or interface used without specifying a concrete type, called a
raw type, enables backward compatibility with earlier versions of Java 
> GenericStack stack = new GenericStack();


## Unbounded or Bounded Generic Type 
![img_3.png](img_3.png)
We bound the data types (class, interface or object) that are accepted by a generic class or
method that it should be a subtype of another class (e.g. super class), which restrict the types that can be used as type
arguments in a parameterized type

* extends upperBounded (limit)
* super lowerBounded

[See more about bounded generics](https://docs.oracle.com/javase/tutorial/java/generics/bounded.html)

## Wildcard Generic Type
Wildcard ?  
To limit the data types that can be stored in a list that can be passed to a method, we used
bounded generics to specify the range  
Question mark (?) is the wildcard symbol in generics and represent an unknown type.  

We CANNOT use wildcards < ? > while  
i) invoking a generic method, or  
ii) instantiating a generic class.
![img_4.png](img_4.png)


