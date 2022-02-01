import java.util.*;
class Tictactoemlh
{
    static String a="",b="",c="",d="",e="",f="",g="",h="",i="",play1,play2;
    static int count=1,v=0;
    static Tictactoemlh ob=new Tictactoemlh();
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {   
        System.out.println("enter the alphabet you want to replace ");
        System.out.println("-----------------------------------------");
        System.out.println("enter the name of first player who had the first chance");
        play1=sc.next();
        System.out.println("enter the name of second player");
        play2=sc.next();
        ob.structure();
        System.out.println();
        ob.operate();
    }

    public static void operate()
    {

        for(int x=0;x<9;x++)
        {  

            if(x==8&&v==0)
            {
                 a="";b="";c="";d="";e="";f="";g="";h="";i="";
             //   ob.operate();
                break;
            }

            if(count%2!=0)
            {
                System.out.println(play1+"'s chance symbol assigned is : O");
            }else{
                System.out.println(play2+"'s chance symbol assigned is : X");
            }

            System.out.println();
            String en=sc.next();
            System.out.println();
            count=count+1;
            ob.condition(en);
            ob.structure();
            System.out.println();
            ob.check();
            System.out.println();
            if(v>0)
            {
                break;
            }
        }

    }

    public static void structure()
    {
        System.out.println("\f");
        System.out.println("enter the alphabet you want to replace ");
        System.out.println("-----------------------------------------");
        for(int x=1;x<=3;x++)
        {
            System.out.print(" ");
            for(int y=1;y<=3;y++)
            {
                if(x==1&&y==1)
                {
                    if(a==""){
                        System.out.print(" a ");
                    }else{
                        System.out.print(" "+a+" ");
                    }
                }

                if(x==1&&y==2)
                {
                    if(b==""){
                        System.out.print(" b ");
                    }else{
                        System.out.print(" "+b+" ");
                    }
                }

                if(x==1&&y==3)
                {
                    if(c==""){
                        System.out.print(" c ");
                    }else{
                        System.out.print(" "+c+" ");
                    }
                    break;
                }

                if(x==2&&y==1)
                {
                    if(d==""){
                        System.out.print(" d ");
                    }else{
                        System.out.print(" "+d+" ");
                    }
                }

                if(x==2&&y==2)
                {
                    if(e==""){
                        System.out.print(" e ");
                    }else{
                        System.out.print(" "+e+" ");
                    }
                }

                if(x==2&&y==3)
                {
                    if(f==""){
                        System.out.print(" f ");
                    }else{
                        System.out.print(" "+f+" ");
                    }
                    break;
                }

                if(x==3&&y==1)
                {
                    if(g==""){
                        System.out.print(" g ");
                    }else{
                        System.out.print(" "+g+" ");
                    }
                }

                if(x==3&&y==2)
                {
                    if(h==""){
                        System.out.print(" h ");
                    }else{
                        System.out.print(" "+h+" ");
                    }
                }

                if(x==3&&y==3)
                {
                    if(i==""){
                        System.out.print(" i ");
                    }else{
                        System.out.print(" "+i+" ");
                    }

                    break;
                }
                System.out.print(" |");
            }
            if(x==3)
            {

                break;
            }
            System.out.println();
            System.out.println(" ------------- ");
        }

    }

    public static void check()
    {
        if(a=="O"&&b=="O"&&c=="O")
        {
            v=v+1;
            System.out.println("!!!!!!! "+play1+" WON !!!!!!!");
        }
        if(d=="O"&&e=="O"&&f=="O")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play1+" WON !!!!!!!");
        }
        if(g=="O"&&h=="O"&&i=="O")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play1+" WON !!!!!!!");
        }
        if(a=="X"&&b=="X"&&c=="X")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play2+" WON !!!!!!!");
        }
        if(d=="X"&&e=="X"&&f=="X")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play2+" WON !!!!!!!");
        }
        if(g=="X"&&h=="X"&&i=="X")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play2+" WON !!!!!!!");
        }
        if(a=="O"&&d=="O"&&g=="O")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play1+" WON !!!!!!!");
        }
        if(b=="O"&&e=="O"&&h=="O")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play1+" WON !!!!!!!");
        }
        if(c=="O"&&f=="O"&&i=="O")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play1+" WON !!!!!!!");
        }  
        if(c=="O"&&e=="O"&&g=="O")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play1+" WON !!!!!!!");
        }
        if(a=="O"&&e=="O"&&i=="O")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play1+" WON !!!!!!!");
        }  

        if(a=="X"&&d=="X"&&g=="X")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play2+" WON !!!!!!!");
        }
        if(b=="X"&&e=="X"&&h=="X")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play2+" WON !!!!!!!");
        }
        if(c=="X"&&f=="X"&&i=="X")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play2+" WON !!!!!!!");
        }  
        if(c=="X"&&e=="X"&&g=="X")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play2+" WON !!!!!!!");
        }
        if(a=="X"&&e=="X"&&i=="X")
        {
            v=v+1;
            System.out.println( "!!!!!!! "+play2+" WON !!!!!!!");
        }  
    }

    public static void condition(String en)
    {

        if(count%2!=0)
        {
            if(en.equalsIgnoreCase("a"))
            {
                a="X";
            }
            if(en.equalsIgnoreCase("b"))
            {
                b="X";
            }
            if(en.equalsIgnoreCase("c"))
            {
                c="X";
            }
            if(en.equalsIgnoreCase("d"))
            {
                d="X";
            }
            if(en.equalsIgnoreCase("e"))
            {
                e="X";
            }
            if(en.equalsIgnoreCase("f"))
            {
                f="X";
            }
            if(en.equalsIgnoreCase("g"))
            {
                g="X";
            }
            if(en.equalsIgnoreCase("h"))
            {
                h="X";
            }
            if(en.equalsIgnoreCase("i"))
            {
                i="X";
            }

        }
        if(count%2==0)
        {
            if(en.equalsIgnoreCase("a"))
            {
                a="O";
            }
            if(en.equalsIgnoreCase("b"))
            {
                b="O";
            }
            if(en.equalsIgnoreCase("c"))
            {
                c="O";
            }
            if(en.equalsIgnoreCase("d"))
            {
                d="O";
            }
            if(en.equalsIgnoreCase("e"))
            {
                e="O";
            }
            if(en.equalsIgnoreCase("f"))
            {
                f="O";
            }
            if(en.equalsIgnoreCase("g"))
            {
                g="O";
            }
            if(en.equalsIgnoreCase("h"))
            {
                h="O";
            }
            if(en.equalsIgnoreCase("i"))
            {
                i="O";
            }
        }

    }
}
