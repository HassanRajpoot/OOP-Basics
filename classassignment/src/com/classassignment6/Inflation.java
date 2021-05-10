package com.classassignment6;

public class Inflation {
    float Cost,Totalcost,Inflation,Increase_per_year;
    int Quantity,Years;
    Inflation(float Cost,float Inflation,int Quantity,int Years)
    {
        this.Cost = Cost;
        this.Inflation = Inflation;
        this.Quantity = Quantity;
        this.Years = Years;
    }
    void Inflation_Calculator()
    {
        for(int i = 0;i<Years;i++){
        Increase_per_year = (Inflation/100)*Cost;
        Cost += Increase_per_year; }
        Totalcost = Years * Cost*Quantity;
        System.out.println("The total cost of your product after "+Years+" years will be "+ Totalcost);
    }

}
