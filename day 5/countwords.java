import java.util.Scanner;
public class countwords
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:");
String sentence=sc.nextLine();
String[] words=sentence.trim().split("\\s+");
System.out.println("Word Count:"+words.length);
sc.close();
}
}
