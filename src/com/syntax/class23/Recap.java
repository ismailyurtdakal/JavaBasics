package com.syntax.class23;

public class Recap {
/* Method Overloading: having same method name within the same class
 * Method Overriding: havind same method name witnin Super and Subclass
 * 
 * In overloading, method signature is different
 * 1.number of parameters 
 * 2.type of parameters
 * 
 * In overriding method signatre is SAME 
 * 1.Inheritance is a MUST
 * 2.Return type MUST be the same
 * 3.Access modifiers cannot be decreased, can stay same or can be increased
 * in child class
 * 
 * Java supports 2 types of polymosphism
 * 
 * 1.Compile Time?static binding/early binding--> achieved through method overloading
 * 
 * 2.Run Time/dynamic binding/late binding--> achieved through method overriding
 * 
 * ---------------
 * !!!!!!!!!!!!!static methods CANNOT BE OVERRIDEN!!!!!!!!!!!!
 * 
 * Parent Animal and Child Bird classes have method(); in both
 * Bird (className).method(); calls Bird class method
 * Animal(className).method(); calls Animal method 
 * -----
 * When 2 static methods with same name available in parent and 
 * child class--> we are not oevrriding we are achieveing method hiding
 * (they can be access by ClassName.method();
 * 
 * Can we override static method? NO
 * Can we override priivate? NO
 * Can we overload static method? Yes
 * Can we overload private? yes
 * 
 * Final keyword - means smething is completed and cannot be modified
 * final can be used with: variable, methd, class
 * final is a non access modifier(static, abstract)
 * 
 * Syntax for variables
 * 
 * dataType name;
 * 
 * acccess modifer/ non ccess modifier dataTtype name;
 * 
 * 
 * SYNTAX FOR METHODS:
 * ReturnType name(); MUST// access/non access modifiers are optional
 * 
 * final with variables --> variable cannot be changed 
 * (final variable called constant variables)
 * 
 * final variables ALWAYS MUST be initiaized 
 * 
 * final with METHODs--> final method cannot be overriden
 * 
 * final with classess--> prevent/stop inheritance
 * 
 * Can we override final?NO         Can we overload final? Yes
 * Can we override constructor? NO  Can we overload constructor? Yes
 * 
 * 
 * Abstract non access modifier 
 * Abstract void eat();   no {} after Abstract. no body, not have any implementation
 * 
 * Abstract class? undefined class!!!
 * Why do we need Abstract classs?
 * How to make class Abstract?
 * 
 * /
 */
	
	
}
