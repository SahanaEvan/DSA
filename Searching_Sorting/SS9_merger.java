package Searching_Sorting;

import java.util.Arrays;

public class SS9_merger {
    static void merge(int a[],int b[]) {
        int j = 0;
        int i = 0;
        int k = 0;
        int temp[] = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            temp[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            temp[k] = b[j];
            j++;
            k++;
        }
        int index=0;
        while(index<a.length)
        {
            a[index]=temp[index];
            index++;
        }
        int bi=0;
        while(bi<b.length)
        {
            b[bi]=temp[index];
            index++;
            bi++;
        }
    }

    public static void main(String[] args) {
        int a[]={10};
        int b[]={2, 3};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        merge(a,b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
