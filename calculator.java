class calculator 
{
    int n1;
    int n2;
    calculator()
    {
        n1=90;
        n2=660;
    }    
    calculator(int a,int b)
    {
        n1=a;
        n2=b;
    
    }
    void add()
    {
        System.out.println(n1+n2);
    }

}

class DemoConst
{
    public static void main(String arg[])
    {
        calculator c=new calculator();
        c.add();
        calculator c1=new calculator(100,80);
        c1.add();
    }

}