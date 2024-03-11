package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static HashMap<String,String> angloRussianDictionary;
    //создание функции для добавления новых, или уже существующих слов
    public static void push(String key,String value){
        if(angloRussianDictionary.containsKey(key)){   // проверка наличия ключа в словаре
            angloRussianDictionary.replace(key,angloRussianDictionary.get(key)+ "; "+value); //добавление значения, если ключ существует
        }else {
            angloRussianDictionary.put(key,value);
        }

    }

    public static void main(String[] args) {
        System.out.println("Вариант 5, Скорик Константин Алексеевич, РИБО-05-22");
        angloRussianDictionary = new HashMap<>();
        angloRussianDictionary.put("Abdication","отречение");
        angloRussianDictionary.put("Aperitif","аперитив");
        angloRussianDictionary.put("Mead","мёд");
        angloRussianDictionary.put("Zizz","жужжание");
        angloRussianDictionary.put("Iron","железо");

        Scanner scanner = new Scanner(System.in);
        int flag=1;
        while (flag==1){
            System.out.println("Do you want to delete word or add it?");
            String answer = scanner.next();
            if (answer.equals("delete")){
                System.out.println("Please enter the word that you want to delete");
                String word=scanner.next();
                angloRussianDictionary.remove(word);
                System.out.println("The word has been successfully deleted");
            }
            if (answer.equals("add")){
                System.out.println("Please enter the word, that you want to add and its translation");
                String word = scanner.next();
                String value = scanner.next();
                push(word,value);
                System.out.println("The word and its translation have been successfully added");
            }
            System.out.println("Do you want continue? 1-yes, 0-no");
            flag=scanner.nextInt();
        }


        TreeMap<String,String> sortedAngloRussianDictionart = new TreeMap<>(angloRussianDictionary);
        for(Map.Entry<String,String> entr : sortedAngloRussianDictionart.entrySet()){
            System.out.println(entr.getKey()+ " - " + entr.getValue());
        }

    }
}