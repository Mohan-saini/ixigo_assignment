package com.example.info;

import org.springframework.data.annotation.Id;

public class Train {
    @Id
    public String id;

    public String Train_Number;
    public String Train_Name;
    public Integer available_class_A_seats;
    public Integer available_class_B_seats;
    public Integer available_class_C_seats;
    public Integer booked_class_A_seats;
    public Integer booked_class_B_seats;
    public Integer booked_class_C_seats;
    public String source;
    public String destination;
    public Float fare;

    public Train(){}

    public Train(String num,String name,Integer A,Integer B,Integer C,Integer b_A,Integer b_B,Integer b_C,String
                 src,String dst,Float f){
        this.Train_Number=num;
        this.Train_Name=name;
        this.available_class_A_seats=A;
        this.available_class_B_seats=B;
        this.available_class_C_seats=C;
        this.booked_class_A_seats=b_A;
        this.booked_class_B_seats=b_B;
        this.booked_class_C_seats=b_C;
        this.source=src;
        this.destination=dst;
        this.fare=f;
    }
}
