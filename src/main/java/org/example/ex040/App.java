/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package org.example.ex040;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String substring= readString(input);
        List<Map<String,String>> data=getList();
        List<Map<String,String>> new_data=locateSubstring(substring.toLowerCase(Locale.ROOT),data);
        List<Map<String,String>> finalList=sort(new_data);
        System.out.println("\nResults:\n");
        printScreen(finalList);
    }
    static String readString(Scanner input){
        System.out.print("Enter a search string: ");
        return input.nextLine();
    }
    static List<Map<String,String>> locateSubstring(String substring,List<Map<String,String>>data){
        List<Map<String,String>> newList= new ArrayList<Map<String,String>>();
        for(Map<String,String>m:data){
            if (m.get("fName").toLowerCase(Locale.ROOT).contains(substring)|
                    m.get("lName").toLowerCase(Locale.ROOT).contains(substring))
                newList.add(m);
        }
        return newList;
    }
    static void printScreen(List<Map<String, String>> data){
        System.out.printf("%-20S| %-20S | %S","Name","Position","Seperation Date\n");
        System.out.println("--------------------|----------------------|-------------------");
        for(Map<String, String> m:data){
            String fullName=String.format("%S %S",m.get("fName"),m.get("lName"));
            System.out.printf("%-20S| %-20S | %S\n",fullName,m.get("position"),m.get("Date"));
        }
    }
    static List<Map<String,String>> sort(List<Map<String, String>> data){
        List<Map<String,String>> newList= data;
        for (int i = 0; i < newList.size()-1; i++) {
            for (int j = i+1; j < newList.size(); j++) {
                if(compare(newList.get(i),newList.get(j))>0){
                    Map<String,String>temp=newList.get(i);
                    newList.set(i,newList.get(j));
                    newList.set(j,temp);
                }
            }
        }
        return newList;
    }
    static int compare(Map<String, String> m1, Map<String, String> m2){
        return m1.get("lName").compareTo(m2.get("lName"));
    }
    static List<Map<String,String>> getList(){
        List<Map<String,String>> data=new ArrayList<Map<String,String>>();
        data.add(createMap("John","Johnson","Manager","2016-12-31"));
        data.add(createMap("Tou","Xiong","Software Engineer","2016-10-05"));
        data.add(createMap("Michaela","Michaelson","District Manager","2015-12-19"));
        data.add(createMap("Jake","Jacobson","Programmer",""));
        data.add(createMap("Jacquelyn","Jackson","DBA",""));
        data.add(createMap("Sally","Weber","Web Developer","2015-12-18"));
        return data;
    }
    static Map<String, String> createMap(String fName, String lName, String position, String Date){
        Map<String, String> employee=new HashMap<>();
        employee.put("fName",fName);
        employee.put("lName",lName);
        employee.put("position",position);
        employee.put("Date",Date);
        return employee;
    }
}
