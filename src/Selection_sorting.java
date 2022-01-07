public class Selection_sorting {
    public static void main(String[] args) {
        int []a={25,89,1,69,32,14};
        for (int i=0;i<a.length-1;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    int temp=0;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                        }
            }
            System.out.println(a[i]);
        }
    }
}
