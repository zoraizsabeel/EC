package ThirdLightBulb;
public class ThirdLightBulb
{
    public static int Fibonacci(int val)
    {
        int start = 0;
        int next = 1;
        if(val == 1)
        {
            next = start;
        }
        else if (val == 2) {
            return next;
        }
        else{
        for(int i = 2; i < val; i++)
        {
            int temp = start+next;
            start = next; 
            next = temp;
        }
        }
        return next;

    }

    public static void main(String[] args)
    {
        int holder = Fibonacci(3);
        System.out.println(holder);

    }
}