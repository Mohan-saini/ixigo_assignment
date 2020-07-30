package com.example.info;

import java.util.List;

public class getAllAvailableTrains {
    //private trains_repo repository;

    List<Train> getAllAvailableTrains(trains_repo repository){
        List<Train> list=repository.findAll();
        return(list);
    }
    Train getTrainInfo(trains_repo repository,String trainName){
        Train t=repository.findBytrainName(trainName);
        return(t);
    }
    List<Train> getAllTrainsFromSourceToDest(trains_repo repository,String src,String dst){
        List<Train> list=repository.findBySourceAndDestination(src,dst);
        return(list);
    }
    int bookSeatInGivenTrain(trains_repo repository,String trainName,String classType){
        Train t=repository.findBytrainName(trainName);
        int seatNumber=0;
        if(classType.equals("classA")){
            t.available.classA--;
            t.booked.classA++;
            seatNumber=t.booked.classA;
        }else if(classType.equals("classB")){
            t.available.classB--;
            t.booked.classB++;
            seatNumber=t.booked.classB;
        }else if(classType.equals("classC")){
            t.available.classC--;
            t.booked.classC++;
            seatNumber=t.booked.classC;
        }
        t=repository.save(t);
        return(seatNumber);
    }
}
