package Java2.Ques4;

class Main
{
    public static void main(String args[])
    {
        Singleton instance = Singleton.getInstance();

        System.out.println(instance.n);
    }
}

