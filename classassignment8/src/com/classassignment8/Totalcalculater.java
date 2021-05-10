package com.classassignment8;

public class Totalcalculater {
    int Quize1,Quize2,Quize3;
    int Midterm;
    int Final;
    Totalcalculater(int Quize1,int Quize2,int Quize3,int Midterm,int Final)
    {
        this.Quize1 = Quize1;
        this.Quize2 = Quize2;
        this.Quize3 = Quize3;
        this.Midterm = Midterm;
        this.Final = Final;
    }
    char Gradecalculator(){
        char Grade = 0 ;
        float Quizesweightage;
        float Midtermweightage;
        float Finalweightage;
        float Total;
        Quizesweightage = (float) (((Quize1+Quize2+Quize2)/3.0)*0.25);
        Midtermweightage = (float) (Midterm*0.35);
        Finalweightage = (float) (Final*0.40);
        Total = Quizesweightage+Midterm+Final;
        if (Total >=90) {
            Grade = 'A';
        }
        else if (Total >=80 && Total < 90) {
            Grade = 'B';
        }
        else if (Total >=70 && Total < 80) {
            Grade = 'C';
        }
        else if (Total >=60 && Total < 70) {
            Grade = 'D';
        }
        else if (Total < 60) {
            Grade = 'F';
        }
        return Grade;
    }
}
