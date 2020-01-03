package com.sunshine.free;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class test {

    public static void main(String[] args) {

       int[] nums1 = {4,9,5};
       int[] nums2 = {9,4,9,8,4};

        int[] intersection = intersection(nums1, nums2);
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);


    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet(nums1.length);
        HashSet<Integer> set2 = new HashSet();

        for(Integer num : nums1){
            set1.add(num);
        }
        for(Integer num2: nums2){
            if(set1.contains(num2)){
                set2.add(num2);
            }
        }

        int [] set3 = new int[set2.size()];
        int idx = 0;
        for(Integer num : set2){
            set3[idx]=num;
            idx++;
        }

        set1.retainAll(set2);
        System.out.println(set1);
        return set3;
    }
}
