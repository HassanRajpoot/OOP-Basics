package com.classassignment5;

public class ParkingPrice {
    int hours;
    int  daysum;
    ParkingPrice(int hours){
        this.hours = hours;
    }
    int billcalculator(){
        daysum = 100;
        hours = hours - 3;
        while(daysum < 200&& hours >0) {
                if (hours>0) {
                    hours = hours - 1;
                    daysum = daysum + 50;
                }
            }
           return daysum;
        }

    }

