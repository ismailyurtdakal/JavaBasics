package com.syntax.class20;

public class S1Recap {
/* Single Inheritance    : Parent→ Child
Multilevel Inheritance   : Grandparent→ Parent→ Child
Hierarchical Inheritance : Parent → Child1,Child2,Child3
 * 
 * 
 * 
 * 4 main concepts of OOPs:
 * 1.Inheritance - process when child class/sub class/derived class inherits 
 * all properties and behavior from a parent/super/base class
 * 
 * Why?
 * eliminate code redundancy
 * improve code reusability
 * 
 * How?
 * by using extends keyword
 * 
 * What type of inheritance?
 * Single    -->1 parent-1 child
 * Multilevel --> Grandparent→ Parent→ Child
 * Hierarchial--> grandparent-parent-child
 * 
 * What is multiple inheritance? When child class have more than 1 parent
 * 
 * IT IS NOT SUPPRTED THOUGH JAVA CLASSES
 * Who is the parent of all Java classess? OBJECT class 
 * 
 * Inheritance key points"
 * 1.Private members are not inherited
 * 2.default member of super class not avaiable if child belongs 
 * to different package
 * 3.Protected members are accessible in different package through inheritance
 * 
 * Is constructor inherited?
 * No!
 * this keyword - used to access current object/instance members or to make
 * a cll using this(0 of current class constructor
 * 
 * super keyword - used to refer to IMMEDIATE parent class instance members or 
 * super() class parent constructor
 * 
 * Super is used with:
 * variables
 * methods
 * constructor
 * 
 * 
 * Super with constructor
 * when we do not add super() -->inside child class,compiler makes call
 * to parent class constructor using super();
 * 
 * Why do we want to use super()?
 * when we want to execure parameterized constructor of parent class 
 * to initialize parent clas variables
 * 
 */

}
