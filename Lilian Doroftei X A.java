import java.util.Scanner;
class Myclass {
public static void main(String[] args) {
int a,b,c,sum;
float average;
Scanner Lil=new Scanner (System. in);
a=Lil.nextInt();
b=Lil.nextInt();
c=Lil.nextInt();
average=a+b+c/3;
sum=a+b+c;
System.out.println("media aritmetica "+average);
System.out.println("suma numerelor "+sum);
Lil.close();

   
  }
}
