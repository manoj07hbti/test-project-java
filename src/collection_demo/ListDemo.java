package collection_demo;

import java.util.ArrayList;

public class ListDemo {

public void demo(){

    // ArrayList  OBJ_NAME=new ArrayList ();

    ArrayList list=new ArrayList();// without DataType
    list.add("Agra");
    list.add("Delhi");
    list.add("Kanpur");
    list.add("Pune");

    // advance for loop to display elements

  for (Object var: list){

      System.out.println("Printing List ...." +var);
  }

}

    //GENERICS : Tells the datatype of collection

    public void demoGeneric(){

// ArrayList <DataType> OBJ_NAME=new ArrayList  <DataType>();

        ArrayList <Integer> listOfMarks= new ArrayList<Integer>();
        listOfMarks.add(55);//0 index   // after delete 0
        listOfMarks.add(23);// 1 index  // deleted
        listOfMarks.add(33);//2 index  // 1 index
        listOfMarks.add(45);// 3 index  // 2 index
        listOfMarks.add(45);
        listOfMarks.add(45);


        listOfMarks.remove(1);
        for(Integer var: listOfMarks){
            System.out.println("Printing Marks from list "+var);
        }

        System.out.println("Using GET on listOfMarks " +listOfMarks.get(2));

// ArrayList <DataType> OBJ_NAME=new ArrayList  <DataType>();
        ArrayList <String> cityNames= new ArrayList<String>();
        cityNames.add("Agra");//0
        cityNames.add("Pune");//1
        cityNames.add("Delhi");//2

        cityNames.remove(2);

        System.out.println("Using GET on cityNames " +cityNames.get(0));
        for(String var : cityNames){

            System.out.println("Printing City from list cityNames "+var);
        }


        // ArrayList <DataType> OBJ_NAME=new ArrayList  <DataType>();
        ArrayList <Double>  priceList=new ArrayList<Double>();
        priceList.add(34.5);//0
        priceList.add(454.4);//1
        priceList.add(23322.4);//2
        priceList.add(232.34);//3

        priceList.remove(2);
        System.out.println("Using GET on priceList " +priceList.get(0));
        for(Double var : priceList){

            System.out.println("Printing Price from list priceList "+var);
        }

    }

    public static void main(String[] args) {
        ListDemo obj=new ListDemo();
       // obj.demo();
        obj.demoGeneric();
    }

}
