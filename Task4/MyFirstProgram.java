import myfirstpackage.*;

class MyFirstCLass {
    public static void main(String[] args)
    {   //Числа для объекта подобраны случайно
        MyFirstPackage o = new MyFirstPackage(5,3); //Создание и инициализация объекта о
        System.out.println(o.xor());
        for(int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                o.setFirstNum(i);
                o.setSecondNum(j);
                System.out.print(o.xor());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}