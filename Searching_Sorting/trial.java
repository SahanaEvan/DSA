package Searching_Sorting;

public class trial {

        static class Pair{
            int i;
            int j;
            int sum;
        }

        public static void conquer(Pair a[], int si, int mid, int ei) {
            int i=si, j=mid+1, k=0;
            Pair aux[]=new Pair[a.length];
            while(i<=mid&&j<=ei)
            {
                if(a[i].sum<=a[j].sum)
                {
                    aux[k++]=a[i++];
                }
                else
                {
                    aux[k++]=a[j++];
                }
            }
            while(i<=mid)
            {
                aux[k++]=a[i++];
            }
            while(j<=ei)
            {
                aux[k++]=a[j++];
            }
            for(int idx1=si, idx2=0;idx1<=ei;idx1++,idx2++)
            {
                a[idx1]=aux[idx2];
            }
        }
        public static void divide(Pair a[], int si, int ei) {
            if(si<ei)
            {
                int mid=si+(ei-si)/2;
                divide(a, si, mid);
                divide(a, mid+1, ei);
                conquer(a,si,mid,ei);
            }
        }
        public static void sortArray(Pair a[]) {
            // merge sort used here
            divide(a,0,a.length-1);
        }
        public static boolean noCommon(Pair a, Pair b) {
            if(a.i==b.i || a.j==b.j || a.i==b.j || a.j==b.i)
                return false;
            return true;
        }
        public static void findFourElements(int arr[], int X) {
            int n=arr.length;
            Pair aux[] = new Pair[n*(n-1)/2];

            // fill aux array with sum of pairs
            for(int i=0, k=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++,k++)
                {
                    aux[k]=new Pair();
                    aux[k].i=i;
                    aux[k].j=j;
                    aux[k].sum=arr[i]+arr[j];
                }
            }

            // sort aux array
            sortArray(aux);

            for(int i=0;i<(n*(n-1)/2);i++)
            {
                // System.out.printf("%d: i:%d j:%d sum:%d\n",i, aux[i].i, aux[i].j,aux[i].sum);
            }

            int i=0, j=(n*(n-1)/2)-1;
            // while(i<(n*(n-1)/2) && j>=0)
            while(i<j)
            {
                if(aux[i].sum+aux[j].sum==X && noCommon(aux[i],aux[j]))
                {
                    System.out.printf("%d %d %d %d\n",arr[aux[i].i],arr[aux[i].j],arr[aux[j].i],arr[aux[j].j]);
                    // System.out.printf("%d %d %d %d\n",aux[i].i,aux[i].j,aux[j].i,aux[j].j);
                    // System.out.printf("%d %d\n", i, j);
                    ++i;
                    --j;
                }
                else if(aux[i].sum+aux[j].sum<X)
                {
                    ++i;
                }
                else
                {
                    --j;
                }
            }
        }
        public static void main(String[] args) {
            int[] arr = { 10, 20, 30, 40, 1, 2 ,25, 25};
            int X = 91;
            findFourElements(arr, X);
        }
    }
