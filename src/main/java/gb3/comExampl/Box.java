package gb3.comExampl;

import java.util.Arrays;

public class Box implements Comparable<Box>{
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }

    private int size;

    public Box(int size) {
        this.size = size;
    }

//    @Override
//    public int compareTo(Object o) {
//        //return size -((Box)o).size;
//        return ((Box)o).size - size;
//    }

    @Override
    public int compareTo(Box o) {
        return size-o.size;
    }

    public static void main(String[] args) {
        Box [] box = {new Box(1), new Box(3), new Box(7)};
        Arrays.sort(box);
        System.out.println(Arrays.toString(box));
    }


}
