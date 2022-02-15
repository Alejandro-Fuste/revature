package algo.week1;

public class JavaAlgo {
    public void actualMemorySize(String size){
        System.out.println(size);
    }

    public static void main(String[] args) {
        JavaAlgo case1 = new JavaAlgo();
        case1.actualMemorySize("32GB"); // "29.76GB"

        System.out.println("----------");

        JavaAlgo case2 = new JavaAlgo();
        case2.actualMemorySize("2GB"); // "1.86GB"

        JavaAlgo case3 = new JavaAlgo();
        case3.actualMemorySize("512MB"); // "476MB"

        System.out.println("----------");


    }
}
