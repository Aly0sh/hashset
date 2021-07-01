package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    cat cat1 = new cat("Sam", "black");
	    cat cat2 = new cat("Sam", "black");
        System.out.println("First cat hash code equals - " + cat1.hashCode());  // выводим hashCode
        System.out.println("Second cat hash code equals - " + cat2.hashCode());

        ArrayList <cat> cats = new ArrayList<>();   // сравнение кошек
        cats.addAll(Arrays.asList(cat1, cat2));

        boolean a=false;
        boolean b=false;
        if (cats.get(0).getName().equals(cats.get(1).getName())){
            a=true;
        }
        if (cats.get(0).getColor().equals(cats.get(1).getColor())){
            b=true;
        }
        if (a&&b){
            System.out.println(true);

            HashSet <cat> catHashSet=new HashSet<>();   // создаем hashSet
            catHashSet.addAll(Arrays.asList(new cat("Tom", "white"), new cat("Ryuma", "orange"), new cat("Jerry", "orange"), new cat("Kit", "gray")));
            System.out.printf("Длина HashSet - %d%n", catHashSet.size());

            catHashSet.add(cat1);   // добавляем уже созданных кошек
            catHashSet.add(cat2);

            System.out.printf("Длина HashSet - %d%n", catHashSet.size());
        }
        else{
            System.out.println(false);
        }
    }
}
