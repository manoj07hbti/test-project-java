package collection_demo;

import java.util.HashSet;

public class HashSetDemo {

    public void demo(){

        // HashSet <DataType>  obj_name= new HashSet <DataType> ();

        HashSet <String> cityNames= new HashSet<String>();
        cityNames.add("Agra");
        cityNames.add("Pune");
        cityNames.add("Delhi");
        cityNames.add("Agra");
        cityNames.add("Pune");
        cityNames.add("Delhi");

        for (String var : cityNames){

            System.out.println("Printing SET " +var);
        }
        HashSet <Integer> marks= new HashSet<Integer>();
        marks.add(23);
        marks.add(23);
        marks.add(57);
        for (Integer var: marks){
            System.out.println("Printing MARKS SET " +var);

        }


    }

    public static void main(String[] args) {
        HashSetDemo obj=new HashSetDemo();
        obj.demo();

    }
}
