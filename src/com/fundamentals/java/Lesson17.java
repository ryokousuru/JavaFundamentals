package com.fundamentals.java;
import java.util.*; //shouldn't use a star import, should load each import
                    //separately to avoid unneeded memory consumption
                    //don't need to import classes that won't be used.
/*
* This class goes over Lesson 17 content
* Collections Framework
* */
public class Lesson17 {

    public void exampleArrayList1() {
        List<String> list = new ArrayList<>();   //The word "List" is an interface
        list.add("Happy");
        list.add("Tuesday");
        list.add("Not Monday Anymore!!  :-D");
        list.add("I\'m going to ride the Osaka monorail in September!!");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    } //the end of the method

    public void exampleArrayList2() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(44);
        myList.add(49);
        myList.add(77);
        myList.add(81);

        //For loop version
        for(int value = 0; value < myList.size(); value++) {
            System.out.println(myList.get(value));
        }
        //Foreach version
        for (Integer integer : myList) {
            System.out.println(integer);
        }
    } //the end of the method



    public void ExampleHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Cherry Bombs!");
        myHash.add("Water Fountains also");

        Iterator<String> iterate = myHash.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }  //the end of the method

    public void ExampleHashMap() {
        Map<Integer, String> myMap = new HashMap<>();    //<keyword, value>
        myMap.put(10, "Happy");
        myMap.put(20, "News for you!!");
        myMap.put(30, "Is anybody there?");
        myMap.put(40, "Happy");


        for (Map.Entry<Integer, String> map : myMap.entrySet()) {
            System.out.println(map.getKey() + " = " + map.getValue());
        }
    }
        public void ExampleHashSet2() {
            HashSet<String> myHash = new HashSet<>();
            myHash.add("Wuppertal Monorail");
            myHash.add("Tama Monorail");
            myHash.add("Chiba Monorail");
            myHash.add("Osaka Monorail");
            myHash.add("Futrex System 21");

            Iterator<String> iterate = myHash.iterator();
            while (iterate.hasNext()) {
                System.out.println(iterate.next());
            }
        }
    } //and the end of the class
