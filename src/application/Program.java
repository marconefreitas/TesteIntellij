package application;

import entities.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {



    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Bob");
        list.add(0, "Marcos");

        list.forEach(x -> System.out.println(x));

    }
}
