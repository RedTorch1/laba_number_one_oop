class MyFirstCLass {
    public static void main(String[] args)
    {   //Числа для объекта подобраны случайно
        MySecondClass o = new MySecondClass(5,3); //Создание и инициализация объекта о
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

class MySecondClass {
    private int firstNum; //Приватные поля типа int
    private int secondNum;
    public int getFirstNum()  //Геттеры
    {
        return firstNum;
    }
    public int getSecondNum()
    {
        return secondNum;
    }
    public void setFirstNum(int new_f)  //Сеттеры
    {
        this.firstNum=new_f;
    }
    public void setSecondNum(int new_s)
    {
        this.secondNum=new_s;
    }
    public MySecondClass(int f, int s) //Конструктор
    {
        this.firstNum=f;
        this.secondNum=s;
    }
    public int xor() //Вариант 10: битовое исключающее "ИЛИ" (XOR)
    {
        return firstNum^secondNum;
    }
}