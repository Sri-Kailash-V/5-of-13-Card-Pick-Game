import java.util.*;
public class Game
{
 int n=5,i,j;
 int user[]=new int[n];
 int comp[]=new int[n];
 Scanner s=new Scanner(System.in);
 void userr()
 {System.out.println("Enter value>0&&<13 ");
  for(i=0;i<n;i++)
   {user[i]=s.nextInt();
    for (int j=0;j<i;j++)
    {while ((user[i] ==user[j] )||(user[i]>13||user[i]==0))
     {System.out.println("Enter value>0&&<13 or non repeting no ");
      user[i]=s.nextInt();
     }
    }
   }
  System.out.println("you have choosed no:");
  for(i=0;i<n;i++)
   System.out.print(user[i]+" ");
 }
 void compp() 
 {Random rand=new Random();
   for(i=0;i<n;i++)
   {comp[i]=rand.nextInt(13 - 1 + 1) + 1;
    for (int j=0;j<i;j++)
    {while ((comp[i] ==comp[j] ))
     {comp[i]=rand.nextInt(13 - 1 + 1) + 1;
     }
    }
   }
  System.out.println("\ncomputer choosed no:");
  for(i=0;i<n;i++)
   System.out.print(comp[i]+" ");
 }
 void cmp(int bet) 
 {int h=0;
  for(i=0;i<n;i++)
   if(user[i]==comp[i])
    h++;
   if(h==0)
    System.out.println("\nyou lost");
   else
   {int price=h*bet;
    System.out.println("\nyou won "+price);
   }
 }
 public static void main(String args[])
 {Game g1=new Game();
  Scanner s=new Scanner(System.in);
  System.out.println("enter betting amount");
  int bet=s.nextInt();
  System.out.println("betting amt = "+bet);
  g1.userr();
  g1. compp();
  g1. cmp(bet) ;
 }
}