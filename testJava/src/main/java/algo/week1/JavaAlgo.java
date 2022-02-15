package algo.week1;

import java.text.DecimalFormat;

public class JavaAlgo {
    public void actualMemorySize(String size){
        double percentage = 0.07;

        if (size.contains("GB")) {
            String [] split = size.split("GB");
            double sizeToDouble = Double.parseDouble(split[0]);
            double result = sizeToDouble * percentage;
            double newSize = sizeToDouble - result;
            DecimalFormat df = new DecimalFormat("###.##");
            String rounded = df.format(newSize);
            System.out.println(rounded + "GB");
        } else {
            String[] splitMB = size.split("MB");
            double sizeToDouble = Double.parseDouble(splitMB[0]);
            double result = sizeToDouble * percentage;
            double newSize = sizeToDouble - result;
            DecimalFormat df = new DecimalFormat("###");
            String rounded = df.format(newSize);
            System.out.println(rounded + "MB");
        }
    }

    public static void main(String[] args) {
        JavaAlgo case1 = new JavaAlgo();
        case1.actualMemorySize("32GB"); // "29.76GB"

        System.out.println("----------");

        JavaAlgo case2 = new JavaAlgo();
        case2.actualMemorySize("2GB"); // "1.86GB"

        System.out.println("----------");

        JavaAlgo case3 = new JavaAlgo();
        case3.actualMemorySize("512MB"); // "476MB"




    }
}
