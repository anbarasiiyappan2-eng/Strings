public class studentsum{
public static void main(String[] args){
int[] marks={78,45,90,23,67};
int max=marks[0];
int sum=0;
int failed=0;
for(int m:marks){
sum+=m;
if(m>max){
max=m;
}
if(m<35){
failed++;
}
}
double average=(double)sum/marks.length;
System.out.println("Highest Mark= "+max);
System.out.println("Average= "+average);
System.out.println("Failed Students= "+failed);
}
}
