package Sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.*;


public class Task1 {
//    1. Пусть дан произвольный список целых чисел,
//    удалить из него четные числа (в языке уже есть что-то готовое для этого)

    private static Random rand = new Random();

    public static ArrayList<Integer> arrCreator(){
        ArrayList<Integer> arr = new ArrayList<>();

        int maxVal = userInput("Введите максимальное значение элементов массива: ");
        int arrSize = userInput("Введите размер массива: ");
        for (int i = 0; i < arrSize; i++) {
            arr.add(rand.nextInt(maxVal+1));
        }
        System.out.println("Исходный массив: " + arr);
        System.out.println("------------------------------");
        return arr;
    }
    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = arrCreator();


        for (Iterator<Integer> iterator = arr.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        
        System.out.println("Массив без четных чисел: " + arr);
    }
}
