import java.util.*;
public class Grade_calculator {
    int totalMarks=400;
    int id;
    //total number of subjects are 4 so the totalmarks taken as 400
    //the subjects are physics, chemistry , maths and biology
    int phyMarks,chemMarks,mathMarks,bioMarks;
    float avgpercentage(int marks){
         return (((float)marks/totalMarks)*100);
    }
    void Grade_calculation(float avgpercent){
    if(avgpercent>=90){
         System.out.println("A grade");
    }
    else if(avgpercent>=80){
         System.out.println("B grade");
    }
    else if(avgpercent>=70){
        System.out.println("C grade");
    }
    else if(avgpercent>=60){
        System.out.println("D grade");
    }
    else{
        System.out.println("Fail");
    }
    }
    void display(){
        int marks=(phyMarks+chemMarks+mathMarks+bioMarks);
        float avgpercent=avgpercentage(marks);
        System.out.println("id:"+id);
        System.out.println("total marks:"+marks);
        System.out.println("average percentage:"+avgpercent);
        Grade_calculation(avgpercent);
    }
    public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
             Grade_calculator calculator=new Grade_calculator();
             System.out.println("Enter the id of student(101 or 102):");
             calculator.id=sc.nextInt();
            switch(calculator.id){
                case 101:
                    System.out.println("Enter the physics marks:");
                    calculator.phyMarks=sc.nextInt();
                    System.out.println("Enter the chemistry marks:");
                    calculator.chemMarks=sc.nextInt();
                    System.out.println("Enter the Maths marks:");
                    calculator.mathMarks=sc.nextInt();
                    System.out.println("Enter the biology marks:");
                    calculator.bioMarks=sc.nextInt();
                    calculator.display();
                    break;
                case 102:
                    System.out.println("Enter the physics marks:");
                    calculator.phyMarks=sc.nextInt();
                    System.out.println("Enter the chemistry marks:");
                    calculator.chemMarks=sc.nextInt();
                    System.out.println("Enter the Maths marks:");
                    calculator.mathMarks=sc.nextInt();
                    System.out.println("Enter the biology marks:");
                    calculator.bioMarks=sc.nextInt();
                    calculator.display();
                    break;
                default:
                   System.out.println("invalid id");               
            }  
    }
}
