public class array_sorting {
    public static void main(String[] args) {
        int []a={6,5,8,1,85,9,12,5};
        int max=a[a.length-1];
        for (int i=a.length-1;i>=0;i--)
        {
            if (a[i]>max)
            {
                System.out.println(a[i]);
                max=a[i];
            }
        }
    }
}
