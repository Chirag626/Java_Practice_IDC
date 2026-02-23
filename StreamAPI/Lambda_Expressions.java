 package StreamAPI;
// 
/*
 * Lambda expression is a new and important feature of Java which was included in Java SE 8.
 *  It provides a clear and concise way to represent one method interface using an expression.
 * The Lambda expression is used to provide the implementation of an interface which has functional interface.
 * It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. 
 * Here, we just write the implementation code.
 
"Java lambda expression is treated as a function, so compiler does not create .class file."

Functional Interface :
Lambda expression provides implementation of functional interface. 
An interface which has only one abstract method is called functional interface. 
Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.

uses:
1. To provide the implementation of Functional interface.
2. Less coding.


Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.

No Parameter Syntax: 
() -> {  
//Body of no parameter lambda  
}  

One Parameter Syntax:
(p1) -> {  
//Body of single parameter lambda  
} 

Two/Multi Parameter Syntax:
(p1,p2)-> {
    //Body of muliple parameter lambda
}
 */
@FunctionalInterface
interface Lambda_exp
{
    public abstract void display();
}

@FunctionalInterface
interface Lxp
{
    public abstract void data(char Section);
}
@FunctionalInterface
interface Lxp1
{ 
    void show(int a,String name); // public abstract implicity added.
}

@FunctionalInterface
interface Expressions
{
    int add(int x,int y);
}

public class Lambda_Expressions
 {
    public static void main(String[] args) 
    {
        // NO parameter
        Lambda_exp e =  () -> System.out.println("This is display method of no parameter"); // if we have only one statement then we don't need to use curly braces.
        e.display();
        
        // Single Parameter  if we have only single param. then we can remove () parenthesis also 
        //eg:  Lxp l = (char section ) -> //code here we can remove parenthesis and no need to mention datatype also.
        // we can write our code like given below , we have reduce the code like this. 

        Lxp l = section -> System.out.println("\nThis is data method of Single Parameter \nSection: "+section); 
        l.data('A');
        
        //two/Multiple parameter example
        Lxp1 l1 = (int a, String n) -> 
        {
        System.out.println("\nThis is show method of Multiple parameter "); // if we have multiple statements then we need to use curly braces.
        System.out.println("Rollno. is: "+a);
        System.out.println("Name : "+n);
    };
    l1.show(10,"Chirag");


/*      Expressions E = (int x, int y) ->
            {
                return x+y;
     };
 } 
insted of this we will use the same staement like this.
*/
        System.out.println("\nThis is add Method with return statement ");
        Expressions E  = (x,y) -> x+y;
        int result = E.add(10,20);
        System.out.println("Result: "+result);
 }
}