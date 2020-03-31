package com.company;

public class Main {

    public static void main(String[] args) {
        // Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5]
        // Виведіть масиви на екран в двох окремих рядках.
        // Порахуйте середнє арифметичне з кожного масиву і виведіть,
        // для якого з масивів це значення виявилося більше (або виведіть, що їх середнє арифметичне рівні)
        int [] array1;
        int sum1=0;
        double avg1=0;
        array1 = new int[5];
        for(int i = 0; i< array1.length; i++){
            array1[i]=((int)(Math.random()*6) - 0 );
            System.out.println(array1[i]);
        }
        for( int num : array1) {
            sum1 = sum1+num;
            avg1 = (double)sum1 / array1.length;
        }
        System.out.println("Average:" + avg1);


        
        int [] array2;
        int sum2=0;
        double avg2=0;
        array2=new int[5];
        for(int j=0; j< array2.length; j++){
            array2[j]=((int)(Math.random()*6)- 0);
            System.out.println(array2[j]);
        }
        for( int num : array2) {
            sum2 = sum2+num;
            avg2 = (double)sum2 / array2.length;
        }
        System.out.println("Average:" + avg2);





        if(avg1>avg2){
            System.out.println("The average of the first array is larger");
        }
        else if(avg2>avg1){
            System.out.println("The average of the second array is larger");
        }
        else{
            System.out.println("The average of the second array = the average of the first array");
        }
    }

}
