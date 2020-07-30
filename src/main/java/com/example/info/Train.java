package com.example.info;

import org.springframework.data.annotation.Id;

public class Train {
    @Id
    public String id;
    public String trainNumber;
    public String trainName;
    public seats available;
    public seats booked;
    public String source;
    public String destination;
    public float fare;

    Train(){}

    public Train(String trainNumber, String trainName, seats available, seats booked, String source, String destination, float fare) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.available = available;
        this.booked = booked;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    public void printInfoOfTrain(){
        System.out.println("Train Number is "+this.trainNumber);
        System.out.println("Train Name is "+this.trainName);
        System.out.println(String.format("Available seats are class A=%d, class B=%d, class C=%d",this.available.classA,this.available.classB,this.available.classC ));
        System.out.println(String.format("Booked seats are class A=%d, class B=%d, class C=%d",this.booked.classA,this.booked.classB,this.booked.classC ));
        System.out.println("Source= "+this.source);
        System.out.println("Destination= "+this.destination);
        System.out.println("Fair is "+this.fare);
    }
}
