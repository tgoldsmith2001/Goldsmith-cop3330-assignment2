package org.example.ex039;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    List<Map<String,String>> data=new ArrayList<Map<String,String>>();
    List<Map<String,String>> data1=new ArrayList<Map<String,String>>();
    @Test
    void sort() {
        //Original List
        data.add(App.createMap("John","Johnson","Manager","2016-12-31"));
        data.add(App.createMap("Tou","Xiong","Software Engineer","2016-10-05"));
        data.add(App.createMap("Michaela","Michaelson","District Manager","2015-12-19"));
        data.add(App.createMap("Jake","Jacobson","Programmer",""));
        data.add(App.createMap("Jacquelyn","Jackson","DBA",""));
        data.add(App.createMap("Sally","Weber","Web Developer","2015-12-18"));
        //Expected results of the sort
        data1.add(App.createMap("Jacquelyn","Jackson","DBA",""));
        data1.add(App.createMap("Jake","Jacobson","Programmer",""));
        data1.add(App.createMap("John","Johnson","Manager","2016-12-31"));
        data1.add(App.createMap("Michaela","Michaelson","District Manager","2015-12-19"));
        data1.add(App.createMap("Sally","Weber","Web Developer","2015-12-18"));
        data1.add(App.createMap("Tou","Xiong","Software Engineer","2016-10-05"));

        assertEquals(data1,App.sort(data));
    }

}