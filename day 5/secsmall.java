public class secsmall {
public static void main(String[] args) 
{
int[] arr = {10, 20, 5, 40, 30};
int smallest = Integer.MAX_VALUE;
int secondSmallest = Integer.MAX_VALUE;
for (int n : arr) 
{
if (n < smallest)
 {
secondSmallest = smallest;
smallest = n;
} 
else if (n < secondSmallest && n != smallest)
 {
secondSmallest = n;
}
}
if (secondSmallest == Integer.MAX_VALUE) 
{
System.out.println("No second smallest number found.");
} else {
System.out.println("Second Smallest = " + secondSmallest);
}
}
}
