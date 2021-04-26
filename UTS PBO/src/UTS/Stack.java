package UTS;
import java.util.*;
import java.lang.*;


class Myexp extends Exception{

}
class Stack
{
    private char arr[];
    private int top;
    private int capacity;

    // Digunakan untuk menginisialisasi Stack
    Stack(int size)
    {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    // Fungsi utilitas digunakan untuk menambahkan element x dalam Stack
    public void push(char x)
    {
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }


        arr[++top] = x;
    }

    // Fungsi utilitas untuk memunculkan elemen teratas (pop up) dalam Stack
    public int pop()
    {
        // Mengurangi ukuran Stack sebanyak 1 dan mengembalikan elemen (pop) yang muncul
        return arr[top--];
    }


    public Boolean isFull()
    {
        return top == capacity - 1;
    }

    public static void main (String[] args)
    {
        Stack stack = new Stack(20);
        Scanner var=new Scanner(System.in);
        Myexp obj=new Myexp();
        System.out.println("Masukan representasi unary:");
        String unry=var.nextLine();
        int i=0;
        int count=0;
        int flag=0;
        int j=0;

        try{
            while(unry.charAt(i)!= '=')
            {
                char ch=unry.charAt(i);
                if(ch=='-'||ch=='*'||ch=='/')throw obj;

                if(ch=='1')
                {
                    stack.push(ch);
                    count++;
                }


                i++;


                j=i;
            }



            for(i=j+1;i<unry.length();i++)
            {
                if(unry.charAt(j+1)=='1')
                {
                    flag++;
                }
                j++;
            }


            if(count==flag)
            {


                System.out.println("Persamaan unary valid");
            }
            else
            {
                {


                    System.out.println("Persamaan unary tidak valid");
                }

            }


        }
        catch(ArrayIndexOutOfBoundsException e)//Jika ada indeks array yang tidak sesuai
        {

        }


        catch(Myexp k)
        {
            System.out.println("persamaan unary tidak valid, karakter yang diijinkan hanya (1,+,=)");
        }


    }
}
