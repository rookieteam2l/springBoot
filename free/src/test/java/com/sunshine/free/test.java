package com.sunshine.free;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class test {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();

        map.put("a",1);
        map.put("a",2);
        map1.put("a",2);
        map1.put("d",2);

        map.putAll(map1);

        System.out.println(map.size());

        add();

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2020,7,1));
        System.out.println(LocalDateTime.now());

        System.out.println(new Date());

        String ss= "FDASFEafddsdDWQDFDSAEADWQczadwDSADWEFDSFEFEAF";


    }

    public static void add() {
        Instant now = Instant.now();
        System.out.println(now);

        HashMap<Object, Object> map = new HashMap<>();
    }


}
