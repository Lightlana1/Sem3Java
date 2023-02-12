package Sem3;
//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
// и среднее арифметическое из этого списка.


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.round;
import static java.util.Collections.min;
import static java.util.Collections.max;



public class Task2 {
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
        int maxNumber = max(arr);
        System.out.println("Максильное значение массива: " + maxNumber);
        int minNumber = min(arr);
        System.out.println("Минимальное значение массива: "+ minNumber);
        int sumNumber = 0;
        for (int item : arr){
            sumNumber += item;
        }
        float meanNumber = (float)sumNumber/arr.size();
        System.out.println("Среднее арифметическое: " + meanNumber);
    }

}
