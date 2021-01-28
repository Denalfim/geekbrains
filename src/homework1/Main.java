package homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"F", "Z", "K"} ;
        array(arr1,1,4);
        array(arr2,0,2);

        //Задание 2
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);

        //Задание 3
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.name = "Apple box 1 ";
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.name = "Orange box 1 ";
        Box<Apple> appleBoxIn = new Box<>();
        appleBoxIn.name = "Apple box In ";
        Box<Orange> orangeBoxIn = new Box<>();
        orangeBoxIn.name = "Orange box In ";
        Apple[] arrapple  = new Apple[4];
        Orange[] arrorange = new Orange[3];
        for (int i = 0; i < arrapple.length; i++) {
            arrapple[i] = new Apple();
            appleBox1.addFruit(arrapple[i]);
            System.out.print(arrapple[i].getName());
            appleBox1.getWeight();
        }
        for (int i = 0; i < arrorange.length; i++) {
            arrorange[i]= new Orange();
            orangeBox1.addFruit(arrorange[i]);
            System.out.print(arrorange[i].getName());
            orangeBox1.getWeight();
        }
        System.out.println("Вес одного яблока  " + arrapple[0].getWeight());
        System.out.println("Вес одного аппельсина  " + arrorange[0].getWeight());

        System.out.println("Сравнение: " + appleBox1.compare(orangeBox1) + "\n");

        System.out.println(appleBox1.getName() + "  " + appleBox1.getWeight());
        System.out.println(appleBoxIn.getName() + "  " + appleBoxIn.getWeight());

        appleBox1.outAllFruitsToBox(appleBoxIn);
        System.out.println(appleBox1.getName() + "  " + appleBox1.getWeight());
        System.out.println(appleBoxIn.getName() + "  " + appleBoxIn.getWeight());

        orangeBox1.outAllFruitsToBox(orangeBoxIn);
        System.out.println(orangeBox1.getName() + "  " + orangeBox1.getWeight());
        System.out.println(orangeBoxIn.getName() + "  " + orangeBoxIn.getWeight());
    }


    public static void array (Object[] arr, int uz, int ab){
        System.out.println(Arrays.toString(arr));
        Object ob = arr[uz];
        arr[uz]=arr[ab];
        arr[ab]=ob;
        System.out.println("Замена: " + Arrays.toString(arr));
        System.out.println("*****************************");
    }

    public static <T> void asList(T[]arr){
        ArrayList<T> arrAlt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Конверсия: " + arrAlt);
        System.out.println("*****************************");
    }
}
