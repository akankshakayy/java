public class binarysearch
{
    public static void main(String args[])
    {
        int[] arr = { 1, 22, 33, 44 ,55 };
        int find = 44; int s=0;
        System.out.println( binary(arr[] , s , find , arr.length-1 ));
    }
    static int binary( int[] arr , int s , int find , int e)
    { int m; 
        if (s > e)
        { return -1; }
         m = s + (e - s)/2;
         if (arr[m]==find )
         { return m; }
         if (arr[m]< find)
         { return binary(arr[] ,m+1 , find ,e); }
         return binary(arr[] ,s , find , m-1);
    }    
}
