class PrimeNo
{
    static void primeNo(int n)
    {
        int i, a, flag=0;
        for(i=1;i<=n;i++)
        {
            if(i==1 || i==0)
            {
                continue;
            }
            flag= 1;
            for(a=2;a<=i/2;++a)
            {
                if(i%a==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        int n =20; 
        primeNo(n);
    }
}