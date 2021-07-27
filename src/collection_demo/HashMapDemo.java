package collection_demo;

import java.util.HashMap;

public class HashMapDemo {

    public void demo(){

        //Syntax:   HashMap <Key_DataType,Value_DataType> objName= new HashMap <Key_DataType,Value_DataType> ();

        HashMap <Integer,String> hashMap= new HashMap <Integer,String>();

        // adding values to map

        hashMap.put(1,"Raj");
        hashMap.put(2,"Mukesh");
        hashMap.put(3,"Rahul");

        // getting an element from hashmap
        System.out.println("Getting element from map " +hashMap.get(1));
        System.out.println("Getting element from map " +hashMap.get(2));

       System.out.println("Getting element from map " +hashMap.get(3));

       // second hashmap
        HashMap <String,String> hashMap_string= new HashMap <String, String>();

        hashMap_string.put("A","Agra");
        hashMap_string.put("B","Delhi");
        hashMap_string.put("C","Pune");
        System.out.println("Getting element from CITY HASHMAP...... " +hashMap_string.get("A"));
        System.out.println("Getting element from CITY HASHMAP...... " +hashMap_string.get("B"));
        System.out.println("Getting element from CITY HASHMAP...... " +hashMap_string.get("C"));

    }

    public static void main(String[] args) {

        HashMapDemo obj=new HashMapDemo();
        obj.demo();
    }
}
