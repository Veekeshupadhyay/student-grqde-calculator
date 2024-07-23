import java.util.Scanner;
public class StudenGradeCalculator{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Subjects :");
        int n=sc.nextInt();
        double[] marks=new double[n];
        double totalmarks=0d;
        int flag=1;//we use flag for marks to check whether it is out of limit
        System.out.print("Out OF How Many Marks you obtained :- ");
         double tm=sc.nextDouble();// we can change out of marks criteria
        for(int i=1;i<=n;i++){
            System.out.printf("enter the marks obtained out of %.1f for the subject-%d : ",tm,i);
            marks[i-1]=sc.nextDouble();
            if(marks[i-1]>tm){
                System.out.println("Invalid Marks");
                flag=0;
            break;}
            totalmarks+=marks[i-1];
        }
        if(flag==1){
        System.out.println("Your total marks obtained are : "+totalmarks);
        double average=((totalmarks*100d)/(n*tm));
        System.out.printf("average percentage is : %.1f percentage \n",average);

        //Grade Calculator
        System.out.print("the grade of your average percentage are : ");
        if(average>=91.0 && average<=100.0){
            System.out.println("A+");
        }
        if(average>=81.0 && average<91.0){
            System.out.println("A");
        }

          else if(average>=71.0 && average<81.0){
            System.out.println("B+");
        }
        else if(average >=61.0 && average<71.0){
            System.out.println("B");
        }
        else if(average>=51.0 && average<61.0){
            System.out.println("C+");
        }
        else if(average>=41.0 && average<51.0){
            System.out.println("C");
        }
        else if(average>=33.0 && average<41.0){
            System.out.println("D");
        }
        else if(average>=0.0 && average<33.0){
            System.out.println("E (Failed)");
        }
        }
    }
}
