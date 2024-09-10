package Tnsif;

import java.util.HashMap;

import java.util.Scanner;



public class WordFrequency {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");

        String input = scanner.nextLine();

        String[] words = input.toLowerCase().split("\\s+");

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {

           

            word = word.replaceAll("[^a-zA-Z]", "");



            if (wordCountMap.containsKey(word)) {

                wordCountMap.put(word, wordCountMap.get(word) + 1);

            } else {

                

                wordCountMap.put(word, 1);

            }

        }

        

        

        System.out.println("Word Frequencies:");

        for (HashMap.Entry<String, Integer> entry : wordCountMap.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

       

        scanner.close();

        }

}
