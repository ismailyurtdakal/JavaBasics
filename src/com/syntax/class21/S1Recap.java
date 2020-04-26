package com.syntax.class21;

public class S1Recap {
/* -------------------------this------------------------------
 * this - It is used to refer to the current object/instance
 *1)this can be used with variables--> why? to access instance variables when 
 * they have SAME NAME as local.
 * 
 **2)this can be used with mothods.Why? When we want to call/access 
 *  instance method of the same class
 * --------------------------EXAMPLE--------------------------
 *   void say(){
 * 
 *  this.sayHello();
 *  }
 * 
 * void sayHello(){
 * }
 *
 *-----------------------------------------------------------------
 * 
 * 3)this() can be used with counstructor only. Why? to all/access CURRENT CLASS CONSTRUCTOR
 * 
 *** to avoid complier confusion when instance and local variables have the same name
 * 	
 * -------------------------------super---------------------------
 * 
 * ***super - used to refer to the immediate PARENT object/instance===============> for Example go to Car Class====== 
 * 
 * 1)super can be used with variables. Why? to access parent class variables
 * When? when parent and child class have SAME VARIABLE NAMES
 * 
 
 * 
 * 2)super can be used with methods.Why? to access parent class instance methods
 * 
 * 3)super() can be used with constructors. Why and how? Inside child class constructor 
 * we need make a call to parent class constructor TO INITIALIZE PARENT CLASS VARIABLES.
 * And inside parent class IF we have ONLY parameterized constructor, child class is ENFORECED 
 * to make a call to invoke parent class constructor by using super();
 *
 *** super(); - always must be first line inside your constructor
 * 
 * Can we have this(); and super(); within the same constructor(); NOOOO
 * 
 * -------------------------
 * 
 * Method Overloading - feature in java that allows to have multiple method with
 * WITHIN SAME CLASS!!!!
 * 
 * How can we achive it?
 * 1.Have different number of parameters
 * 2.by changing type of parameters
 * 
 * What can we overload?
 * method();
 * Constructor();
 * 
 * 
 * 
 */

}
