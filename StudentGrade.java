import java.util.Scanner;
public class StudentGrade{
private static Scanner sc;
public static void main(String args[]){
int english,chemistry,computers,physics,maths;
sc=new Scanner(System.in);
System.out.print("please enter the five subject marks:");
english=sc.nextInt();
chemistry=sc.nextInt();
computers=sc.nextInt();
physics=sc.nextInt();
maths=sc.nextInt();
studentGrade(english,chemistry,computers,physics,maths);
}
public static void studentGrade(int eng,int chem,int com,int phy,int mat)
{
float total,percentage;
total=eng+chem+com+phy+mat;
percentage=(total/500)*100;
System.out.println("Total marks="+total);
System.out.println("Marks percentage="+percentage);
if(percentage>=90)
{
System.out.println("\n Grade A");
}
else if(percentage>=80)
{
System.out.println("\n Garde B");
}
else if(percentage>=70)
{
System.out.println("\n Grade C");
}
else if(percentage>=60)
{
System.out.println("\n Grade D");
}
else if(percentage>=50)
{
System.out.println("\n Grade E");
}
else
{
System.out.println("\n Fail");
}
}
}