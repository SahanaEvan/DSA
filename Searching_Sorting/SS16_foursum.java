package Searching_Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SS16_foursum {
    /**
     Algorithm:
     * First find all possible pairs and their sum and store it in an array of class Auxiliary
     * Have a function to check if there is no common element
     * Sort the array of Auxiliary class based on the sum field
     * Now we just have to find two other elements to complete the quadruple tuple
    */
    static class output{
        public int[] oww=new int[4];

        public output(int num1, int num2, int num3, int num4) {
            oww[0]=num1;
            oww[1]=num2;
            oww[2]=num3;
            oww[3]=num4;
        }
    }
    public static class pairSum{
        public int first;
        public int sec;
        public int sum;

        public pairSum(int f,int s,int su) {
            this.first=f;
            this.sec=s;
            this.sum=su;
        }
    }
    static boolean noCommon(pairSum a,pairSum b)
    {
        if(a.first==b.first || a.sec==b.sec || a.first==b.sec || a.sec==b.first)
            return false;

        return true;
    }

    static output[] four_sum(int arr[],int X)
    {
//        int length=arr.length;
        int size=(arr.length*(arr.length-1))/2;
        pairSum[] aux=new pairSum[size];

        int k=0;
        int s=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                aux[k]=new pairSum(i,j,(arr[i]+arr[j]));
                k++;
            }
        }
        Arrays.sort(aux, new Comparator<pairSum>() {
            //Comparator is an interface that is used for rearranging the Arraylist in a sorted manner.
            //Now based on sum field of pairsum class we sort the user defined class so we use compare function
            @Override
            //see compare function is actually overidden
            public int compare(pairSum a, pairSum b)
            {
                return (a.sum - b.sum);
            }
        });

        int i=0;
        int j=size-1;
        int o=0;
        output[] out_arr=new output[6];
        while(i<size && j>=0)
        {
            if(aux[i].sum+aux[j].sum==X) {
                //System.out.println(arr[aux[i].first] + "," + arr[aux[i].sec] + "," + arr[aux[j].first] + "," + arr[aux[j].sec]);
                out_arr[o]=new output(arr[aux[i].first],arr[aux[i].sec], arr[aux[j].first], arr[aux[j].sec]);
                o++;
                i++;
                j--;
                //return;
            }
            else if(aux[i].sum+aux[j].sum<X)
                i++;
            else
                j--;
        }
        return out_arr;

    }
    public static void main(String[] args)
    {
        int[] arr = { 6, 5, 4, 3, 1, 1 };
        int X = 12;

        // Function call
        output[] out=four_sum(arr, X);

        for (int i = 0; i < out.length-1; i++) {
            Arrays.sort(out[i].oww);
        }
        for (int i = 0; i < out.length-1; i++) {

                if((out[i].oww[0]!=out[i+1].oww[0])&&(out[i].oww[1]!=out[i+1].oww[1])&&(out[i].oww[2]!=out[i+1].oww[2])&&(out[i].oww[3]!=out[i+1].oww[3]))
                    System.out.println(Arrays.toString(out[i].oww));
            }

    }
}

