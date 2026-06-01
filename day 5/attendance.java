public class attendance
{
public static void main(String[] args)
{
int[] attendance={1,0,1,1,0,1,0,1,1,1}; 
int present=0;
int absent=0;
for(int a:attendance)
{
if(a==1)
{
present++;
}
else
{
absent++;
}
}
double percentage=(double)present/attendance.length*100;
System.out.println("Total Present= "+present);
System.out.println("Total Absent= "+absent);
System.out.println("Attendance Percentage= "+percentage+"%");
}
}
