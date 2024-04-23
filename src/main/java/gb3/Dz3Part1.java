package gb3;

public class Dz3Part1 {
    // Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static void main(String[] args) {
        String[] clock = new String[]{"one", "two", "tree", "four", "five", "six"};
        String addCloc = clock[0];
        clock[0]=clock[4];
        clock[4]= addCloc;

        int x= 0;
        while (x<6){
            System.out.println(clock[x]);
            x=x+1;

        }

    }


}
