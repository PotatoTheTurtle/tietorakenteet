/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

public class SortAlgorithms {
    final static int MAX=30000;

    public static void main(String[] args) {
        Sorts sorts = new Sorts();

        sorts.selectSort();
        sorts.mergeSort();
        sorts.quickSortLoop();
        System.out.println("SELECT SORT");
        System.out.println(sorts.selectsort);
        System.out.println("MERGE SORT");
        System.out.println(sorts.mergesort);
        System.out.println("QUCIK SORT");
        System.out.println(sorts.quicksort);
    }



}
