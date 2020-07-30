package com.example.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class TrainInfoApplication implements CommandLineRunner {
	@Autowired
	private trains_repo repository;

	public static void main(String[] args) throws Exception{
		try{
			SpringApplication.run(TrainInfoApplication.class, args);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void run(String... args)throws Exception{
		repository.deleteAll();

		repository.save(new Train("1","saheed",new seats(45,89,46),new seats(87,69,36),"Delhi","Mumbai",560.15f));
		repository.save(new Train("2","malva",new seats(45,89,46),new seats(87,69,36),"Mumbai","katra",5600.15f));
		repository.save(new Train("3","shatabadi",new seats(45,89,46),new seats(87,69,36),"Jammu","Agra",456.50f));

		getAllAvailableTrains trainInfo=new getAllAvailableTrains();
		Train t=trainInfo.getTrainInfo(repository,"saheed");
		t.printInfoOfTrain();
		int seat_num=trainInfo.bookSeatInGivenTrain(repository,"shatabadi","classA");
		System.out.println("Seat number = "+seat_num);
	}
}
