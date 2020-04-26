package com.syntax.class22;

public class Recap {
/*super vs this --> parent class vs current class
 * 
 * super() vs this()  --> calls immediate parent class const vs this() calls 
 * current class constr
 * 
 * super vs super()
 * super() refers to immediate parent const
 * super.varNanem, and super.m();--refers to immediate parent var method
 * 
 * 
 * Method overloading-feature whenever same method name is existing multiple
 * times in the same class
 * 
 * How to implement it?
 * 1.change # of parameters
 * 2.change type pf parameter
 * 
 * Why we need overloading? to make code cleaner
 *
 *class String:  //overloading example is below
 *    substring(int beginIndex);
 *    substring(int begingIndex, int endIndex);
 * ---------------------------------------------------------
 * Am I overloading?
 * 
 *   public void hello(){
 *      SOPln("Hello");
 *   }
 *   public void hello(String name){---this methd is overloaded
 *      SOPln("hello "+name);
 *   }
 *  
 *  CE:below. why? overloading is not possible by changing access modifier
 *   private void hello(Sting str){
 *     SOPln(str);
 *   }
 *   CE:Overloading duplicate method
 *   public String hello(String name){
 *      return name;
 *   }
 * 
 * IN METHOD OVERLOADING, METHOD SIGNATURE MUST BE DIFFERENT
 * 
 * Method signature: method name and parameters ONLY(NOT MODIFIER) 
 * 
 ***** Can we overload private method? Yes.!!! it can be accessed only within the same class
 * 
 ***** Can we overload static method? Yes
 * 
 ***** Can we overload main method??? YES
 * 
 * Method overloading is a feature when SAME method name exist 
 * within the SAME class
 * 
 *  Can be achieved by 1.changing number of parameters
 *                     2.changing type of the parameters
 *                     
 * Method  Overriding - is e feature when SAME method name exits 
 * within PARENT and CHILD class! No inheritance No overriding!!!!
 * 
 * When child class is not satisfised with the implementation of
 * the parent methods, child class allowed to provide its own logic 
 * --> within the child class we are overriding behavior of the parent
 * -------------------------------------------------------------------------------------
 * METHOD OVERRIDING RULES:
 * 1.Inheritance is a MUST
 * 2.In Method overridign METHOD SIGNATURE (name+parameters) and
 *RETURN TYPE MUST BE the SAME
 * 
 * 3.In overriding we cannot reduce the scope of access modifiers.
 * Overriding(child) method can have same scope of access modifiers
 * or can increase it.
 * ------------------------------------------------------------------------------------
 * What can/cannot be overridden?
 * 
 *** Can we override private methods? NO private members do not
 * participate in inheritance
 * 
 ***Can we override constructor?each class has its own constructor and 
 * constructors do not participate in the inheritance 
 * 
 * Can we override static methods? NO!!
 * 
 *  Method Overloading                  vs              Method Overriding
 *  1.same method exists within the same class--- 1.same method exists in Parent and child classes
 *  2.no need inheritance ----------------------- 2.Inheritance is a MUST
 *  3.method signature(name+param)--> different-- 3.SAME METHOD SIGNATURE
 *  4.No return type ---------------------------  4.return type must be the same
 *  5.access mod. not included -----------------  5.overriding do not change scope/visibility
 *  6.Private,static can be overloaded ---------- 6.in overriding CANNOT
 *  7. Constructor can -------------------------- 7.CANNOT
 * 
 *  Polymorphism
 * in programming,  polymorphism is performing different actions in different screnarios
 * 
 * Method can form different things:based on the input parameters or implementation
 * 
 * Java supports 2 types of polymorphism:
 * 1.Compile Time polymorphism/static binding/early binding-
 * achieved through method overloading
 * 
 * 2.Runtime polymorphism/dynamic binding/late binding - achieved through 
 * method overriding as shown below!!!!!!!!!!
 * 
 * Parent obj=new Child();--> non primitive casting:upcasting
 * 
 * What is casting in Java?
 * changing 1 type to another type.
 *
 * Primitive Casting:
 * Widening and narrowing
 * 
 * double d=10;
 * SOPln(d);--> 10.0
 * 
 * int i=(int)10.99;
 * SOPln(i)--> 10
 * 
 * 
 * 
 * 
 * Non primitive:Objects
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
