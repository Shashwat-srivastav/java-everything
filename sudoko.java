import java.util.*;
class SudokoFinal
{
    static SudokoFinal ob=new SudokoFinal();static int count=0,yes=0;
    static int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,r=0,q=0,k=0,s=0,m=0,n=0,o=0,p=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers in sudoko please think before you fill as you cannot come back to that point again and only enter unit digits like in between 0-9");
            
        ob.Structureofsudoko();

        System.out.println("a :");
        a=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("b :");
        b=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("c :");
        c=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("d :");
        d=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("e :");
        e=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("f :");
        f=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("g :");
        g=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("h :");
        h=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("r :");
        r=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("q :");
        q=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("k :");
        k=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("s :");
        s=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("m :");
        m=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("n :");
        n=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("o :");
        o=sc.nextInt();
        ob.Structureofsudoko();

        System.out.println("p :");
        p=sc.nextInt();
        ob.Structureofsudoko();
        ob.check();
        if(yes<=30&&count==0){
            System.out.println("good job");
        }else{
            System.out.println("JA PANI LA!!!! HAAT!!!! ");
        }
    }

    public static void Structureofsudoko(){
        System.out.println("\f");
        System.out.println(" ------------------- * -------------------");
        for(int i=0;i<3;i++ ){
            System.out.print(" | ");
            for(int j=0;j<6;j++){

                if(i==0&&j==0){
                    System.out.print(" 1 ");
                }
                if(i==0&&j==1){
                    if(a==0){
                        System.out.print(" a ");
                    }
                    else{
                        System.out.print(" "+a+" ");
                    }
                }
                if(i==0&&j==2){
                    System.out.print(" 4 ");
                    System.out.print(" | *");
                }

                if(i==1&&j==0){
                    if(c==0){
                        System.out.print(" c ");
                    }
                    else{
                        System.out.print(" "+c+" ");
                    }
                }
                if(i==1&&j==1){
                    System.out.print(" 6 ");
                }
                if(i==1&&j==2){

                    if(d==0){
                        System.out.print(" d ");
                        System.out.print(" | *");
                    }
                    else{
                        System.out.print(" "+d+" ");
                        System.out.print(" | *");
                    }

                }

                if(i==2&&j==0){
                    System.out.print(" 8 ");
                }
                if(i==2&&j==1){
                    if(g==0){
                        System.out.print(" g ");
                    }
                    else{
                        System.out.print(" "+g+" ");
                    }
                }
                if(i==2&&j==2){
                    System.out.print(" 9 ");
                    System.out.print(" | *");
                }

                if(i==0&&j==3){
                    System.out.print(" 6 ");

                }
                if(i==0&&j==4){
                    if(b==0){
                        System.out.print(" b ");
                    }
                    else{
                        System.out.print(" "+b+" ");
                    }
                }
                if(i==0&&j==5){
                    System.out.print(" 8 ");

                }
                if(i==1&&j==3){
                    if(e==0){
                        System.out.print(" e ");
                    }
                    else{
                        System.out.print(" "+e+" ");
                    }
                }
                if(i==1&&j==4){
                    System.out.print(" 9 ");
                }
                if(i==1&&j==5){
                    if(f==0){
                        System.out.print(" f ");
                    }
                    else{
                        System.out.print(" "+f+" ");
                    }
                }
                if(i==2&&j==3){
                    System.out.print(" 4 ");
                }
                if(i==2&&j==4){
                    if(h==0){
                        System.out.print(" h ");
                    }
                    else{
                        System.out.print(" "+h+" ");
                    }
                }
                if(i==2&&j==5){
                    System.out.print(" 1 ");
                }System.out.print(" | ");
            }
            System.out.println("");
            System.out.println(" ------------------- * -------------------");;

        }
        System.out.println(" |* * * * * * * * * * * * * * * * * * * *|  ");
        System.out.println(" ------------------- * -------------------");
        for(int i=0;i<3;i++ ){
            System.out.print(" | ");
            for(int j=0;j<6;j++){
                if(i==0&&j==3){
                    System.out.print(" 1 ");
                }
                if(i==0&&j==4){
                    if(q==0){
                        System.out.print(" q ");
                    }
                    else{
                        System.out.print(" "+q+" ");
                    }
                }
                if(i==0&&j==5){
                    System.out.print(" 4 ");
                }
                if(i==1&&j==5){
                    if(n==0){
                        System.out.print(" n ");
                    }
                    else{
                        System.out.print(" "+n+" ");
                    }
                }
                if(i==1&&j==4){
                    System.out.print(" 6 ");
                }
                if(i==1&&j==3){
                    if(m==0){
                        System.out.print(" m ");
                    }
                    else{
                        System.out.print(" "+m+" ");
                    }
                }
                if(i==2&&j==3){
                    System.out.print(" 8 ");
                }
                if(i==2&&j==4){
                    if(p==0){
                        System.out.print(" p ");
                    }
                    else{
                        System.out.print(" "+p+" ");
                    }
                }
                if(i==2&&j==5){
                    System.out.print(" 9 ");
                }
                if(i==0&&j==2){
                    System.out.print(" 8 ");
                    System.out.print(" | *");
                }
                if(i==0&&j==1){
                    if(r==0){
                        System.out.print(" r ");
                    }
                    else{
                        System.out.print(" "+r+" ");
                    }
                }
                if(i==0&&j==0){
                    System.out.print(" 6 ");
                }
                if(i==1&&j==2){
                    if(s==0){
                        System.out.print(" s ");

                    }
                    else{
                        System.out.print(" "+s+" ");

                    }
                    System.out.print(" | *");
                }
                if(i==1&&j==1){
                    System.out.print(" 9 ");
                }
                if(i==1&&j==0){
                    if(k==0){
                        System.out.print(" k ");
                    }
                    else{
                        System.out.print(" "+k+" ");
                    }
                }
                if(i==2&&j==0){
                    System.out.print(" 4 ");
                }
                if(i==2&&j==1){
                    if(o==0){
                        System.out.print(" o ");
                    }
                    else{
                        System.out.print(" "+o+" ");
                    }
                }
                if(i==2&&j==2){
                    System.out.print(" 1 ");
                    System.out.print(" | *");
                }
                System.out.print(" | ");
            }
            System.out.println("");

            System.out.println(" ------------------- * -------------------");

        }
    }

    public static void check()
    {
        if(a!=b&&a!=g&&a!=r&&a!=o)
        {
            yes++;

        }else{

            count++;
        }
        if(a!=6&&a!=8&&a!=4&&a!=1&&a!=9){
            yes++;
        }else{

            count++;
        }
        if(b!=6&&b!=8&&b!=4&&b!=1&&b!=9){
            yes++;
        }else{

            count++;
        }
        if(c!=6&&c!=8&&c!=4&&c!=1&&c!=9){
            yes++;
        }else{

            count++;
        }
        if(d!=6&&d!=8&&d!=4&&d!=1&&d!=9){
            yes++;
        }else{

            count++;
        }
        if(e!=6&&e!=8&&e!=4&&e!=1&&e!=9){
            yes++;
        }else{

            count++;
        }
        if(f!=6&&f!=8&&f!=4&&f!=1&&f!=9){
            yes++;
        }else{

            count++;
        }
        if(g!=6&&g!=8&&g!=4&&g!=1&&g!=9){
            yes++;
        }else{

            count++;
        }
        if(h!=6&&h!=8&&h!=4&&h!=1&&h!=9){
            yes++;
        }else{

            count++;
        }
        if(r!=6&&r!=8&&r!=4&&r!=1&&r!=9){
            yes++;
        }else{

            count++;
        }
        if(q!=6&&q!=8&&q!=4&&q!=1&&q!=9){
            yes++;
        }else{

            count++;
        }
        if(k!=6&&k!=8&&k!=4&&k!=1&&k!=9){
            yes++;
        }else{

            count++;
        }
        if(s!=6&&s!=8&&s!=4&&s!=1&&s!=9){
            yes++;
        }else{

            count++;
        }
        if(m!=6&&m!=8&&m!=4&&m!=1&&m!=9){
            yes++;
        }else{

            count++;
        }
        if(n!=6&&n!=8&&n!=4&&n!=1&&n!=9){
            yes++;
        }else{

            count++;
        }
        if(o!=6&&o!=8&&o!=4&&o!=1&&o!=9){
            yes++;
        }else{

            count++;
        }
        if(p!=6&&p!=8&&p!=4&&p!=1&&p!=9){
            yes++;
        }else{

            count++;
        }

        if(c!=d&&c!=e&&c!=f&&c!=k)
        {
            yes++;
        }else{

            count++;
        }
        if(d!=s&&d!=e&&d!=f)
        {
            yes++;
        }else{

            count++;
        }
        if(e!=m&&e!=f)
        {
            yes++;
        }else{

            count++;
        }
        if(f!=n)
        {
            yes++;
        }else{

            count++;
        }
        if(g!=r&&g!=o&&g!=h)
        {
            yes++;
        }else{

            count++;
        }
        if(h!=q&&h!=p)
        {
            yes++;
        }else{

            count++;
        }
        if(r!=o&&r!=q)
        {
            yes++;
        }else{

            count++;
        }
        if(s!=k&&s!=m&&s!=n)
        {
            yes++;
        }else{

            count++;
        }
        if(k!=m&&k!=n)
        {
            yes++;
        }else{

            count++;
        }
        if(o!=p)
        {
            yes++;
        }else{

            count++;
        }
        if(q!=p)
        {
            yes++;
        }else{

            count++;
        }
        if(m!=n)
        {
            yes++;
        }else{

            count++;
        }
        if(b!=h&&b!=q&&b!=p)
        {
            yes++;
        }else{

            count++;
        }
    }
}