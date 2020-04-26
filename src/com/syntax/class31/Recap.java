package com.syntax.class31;

import java.io.FileInputStream;
import java.util.Properties;

public class Recap {
/* Map is a collection of entry objetcs
 * 
 * Entry Object =Key+value
 * 
 * Map cannot have duplicate key objects
 * 
 * Map is an interface
 * 
 * We have 4 types of map
 * 1)HashMap:no insertion order
 * 2)LinkedHashMap:preserve the order
 * 3)TreeMap:ascending order (based on the keys)
 * 4)HashTable:
 *  
 *  
 * Both hasHMap & HashTable - does not preserve the order  
 * 
 * HMap - allws at least 1 null key and multiple null values
 * 
 * Hashtable - does not allow any null keys nor null values
 * 
 * HashMap is non syncronized, not thread safe
 * HashTable - is syncronized, it is thread safe
 * 
 *  ArrayList vs Vector
 *  ArrayList  is non syncronized, not thread safe
 *  Vector - is syncronized, it is thread safe
 *  
 ***if you want to remove, you can not use for loop  --> from a student
 *
 *Map<K,V>
 *List<Map<K,V>>
 *Map<Map<K,V>, Map<K,V>>
 *
 *JAVA:
 *Java Basics
 *Java OOPs
 *Java Collections
 *File Handling in Java
 *Exception in Java
 *
 *Property File in Java
 *It is a file that have extension .properties
 *Property file used to store configuration settings such
 *as:url, username, password, dbURL, dbUsername etc...
 *
 *****shortcut for import for Windows ctrl+shift+o //mac command+shift+o
 *
 * to store data in .properties file (we can use = or : as shown below)
 * name=John
 * lastName:Smith
 * 
 *
 * to handle ANY files in Java
 * 1. have file and specify it's path
 *
 *	String filePath = "C:\\Users\\Is mAil\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
 * 
 * 2. bring object of FileInputStream
 *	
 *		FileInputStream fileInput = new FileInputStream(filePath);
 *
 * Based on the type of file we will need different type of Objects:
 * to handle data from .properties file we need Properties Class
 * to handle data from xl file we need XSSFWorkbook class
 *	
 * handling Data from properties class
 *  
 * Properties class extends HasTable--> data will be stored in a from of K,V and order wont be preserved
 *  
 * Properties prop = new Properties();
 * prop.load(fileInput);
 * 
 * to write into existing file MAKE SURE TO LOAD DATA FIRST	and then make changes 
 * and WRITE to the file
 * 
 * if we not going to load data first --> previous values will be overwitten
 * 
 * TASK
 * CREATE A FILE TO STORE following configuraions:
 * browser
 * url
 * username
 * password
 * 
 * read file and extract values of browser & url
 * 
 * Top read excel we need to use Apache POI library (Java based)
 * 
 *
 *  
 *  
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
