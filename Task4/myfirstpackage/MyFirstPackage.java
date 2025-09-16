package myfirstpackage;

public class MyFirstPackage {
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
    public MyFirstPackage(int f, int s) //Конструктор
    {
        this.firstNum=f;
        this.secondNum=s;
    }
    public int xor() //Вариант 10: битовое исключающее "ИЛИ" (XOR)
    {
        return firstNum^secondNum;
    }
}