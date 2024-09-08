import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int sub=scanner.nextInt();
        int total_marks=0;
        for(int i=1;i<=sub;i++)
        {
            System.out.println("Enter the "+ i + " Subject marks:");
            total_marks+=scanner.nextInt();
        }
        double percentage= (double)total_marks/sub;
        if(percentage>=90)
        {
            System.out.println("Total Marks: "+ total_marks);
            System.out.println("Average Percentage: "+ percentage);
            System.out.println("Grade: O");
        }
        else if(percentage>=80)
        {
            System.out.println("Total Marks: "+ total_marks);
            System.out.println("Average Percentage: "+ percentage);
            System.out.println("Grade: A+");
        }
        else if(percentage>=70)
        {
            System.out.println("Total Marks: "+ total_marks);
            System.out.println("Average Percentage: "+ percentage);
            System.out.println("Grade: A");
        }
        else if(percentage>=60)
        {
            System.out.println("Total Marks: "+ total_marks);
            System.out.println("Average Percentage: "+ percentage);
            System.out.println("Grade: B+");
        }
        else if(percentage>=50)
        {
            System.out.println("Total Marks: "+ total_marks);
            System.out.println("Average Percentage: "+ percentage);
            System.out.println("Grade: C");
        }
        else if(percentage>=40)
        {
            System.out.println("Total Marks: "+ total_marks);
            System.out.println("Average Percentage: "+ percentage);
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Total Marks: "+ total_marks);
            System.out.println("Average Percentage: "+ percentage);
            System.out.println("Grade: F");
        }
    }
    
}
