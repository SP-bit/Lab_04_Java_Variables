public class Main
{
    public static void main(String[] args)
    {
        int testScore = 95;
        int marbleCount = 5;
        int classStudents = 25;
        int favoriteNumber = 64;
        int luckyNumber = 99;
        int height = 77;
        int lapCount = 33;
        double gasCost = 4.6;
        double yogurtPrice = 4.4;
        double taxRate = 4.55;
        double itemCost = 34.87;
        double medicinePrice = 19.3;
        double serviceFee = 9.23;
        classStudents = testScore + marbleCount;
        System.out.println("The sum of " + testScore + " and " + marbleCount + " is equal to " + classStudents);
        favoriteNumber = testScore * marbleCount;
        System.out.println("The product of " + testScore + " and " + marbleCount + " is equal to "+ favoriteNumber);
        luckyNumber = testScore - marbleCount;
        System.out.println("The difference of " + testScore + " and " + marbleCount + " is equal to "+ luckyNumber);
        height = testScore / marbleCount;
        System.out.println("The quotient of " + testScore + " and " + marbleCount + " is equal to "+ height);
        lapCount = testScore % marbleCount;
        System.out.println("The remainder of " + testScore + " and " + marbleCount + " is equal to "+ lapCount);
        taxRate = gasCost + yogurtPrice;
        System.out.println("The sum of " + gasCost + " and " + yogurtPrice + " is equal to " + taxRate);
        itemCost = gasCost * yogurtPrice;
        System.out.println("The product of " + gasCost + " and " + yogurtPrice + " is equal to "+ itemCost);
        medicinePrice = gasCost - yogurtPrice;
        System.out.println("The difference of " + gasCost + " and " + yogurtPrice + " is equal to "+ medicinePrice);
        serviceFee = gasCost / yogurtPrice;
        System.out.println("The quotient of " + gasCost + " and " + yogurtPrice + " is equal to "+ serviceFee);


    }
}