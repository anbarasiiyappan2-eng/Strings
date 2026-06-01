public class shop{
public static void main(String[] args){
double[] prices={499,1200,7999,2500};
double total=0;
double highest=prices[0];
int count=0;
for(double p:prices){
total+=p;
if(p>highest){
highest=p;
}
if(p>1000){
count++;
}
}
System.out.println("Total Price: "+total);
System.out.println("Highest Price: "+highest);
System.out.println("Items above 1000: "+count);
}
}
