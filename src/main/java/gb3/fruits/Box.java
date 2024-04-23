package gb3.fruits;


import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {


    public static void main(String[] args) {

        Apple apple = new Apple(1.0);
        Orange orange = new Orange(1.5);
        List<Double> appleList = new ArrayList<>();
        List<Double> orangeList = new ArrayList<>();
        List<Double> box1 = appleList;
        List<Double> box2 = orangeList;

        appleList.add(apple.getTotalWeight());
        appleList.add(apple.getTotalWeight());
        appleList.add(apple.getTotalWeight());
//        appleList.add(apple.getTotalWeight());

        orangeList.add(orange.getTotalWeight());
        orangeList.add(orange.getTotalWeight());
//        orangeList.add(orange.getTotalWeight());
//        orangeList.add(orange.getTotalWeight());
//        orangeList.add(orange.getTotalWeight());
//        orangeList.add(orange.getTotalWeight());
//        orangeList.add(orange.getTotalWeight());

        sumFruits(appleList);
        sumFruits(orangeList);
        isSravniBox(box1, box2);
        isSravniBox1(box1, box2);

        System.out.println();


    }


    public static double sumFruits(List<Double> fruitList) {

        double sum = 0;
        for (int i = 0; i < fruitList.size(); i++)
            sum += fruitList.get(i);
        System.out.println(sum);
        return sum;

    }

    public static boolean isSravniBox(List<Double> box1, List<Double> box2) {
        if (box1.equals(box2)) {
            System.out.println("Вес коробок с фруктами одинаковый");
            return true;
        } else {
            System.out.println("Вес коробок с фруктами разный");
            return false;

        }
    }

        public static boolean isSravniBox1(List<Double> box1, List<Double> box2){
            if(box1==box2){
                System.out.println("Вес коробок с фруктами одинаковый");
                return true;
            }else {
                System.out.println("Вес коробок с фруктами разный");
                return false;

            }



    }






}

