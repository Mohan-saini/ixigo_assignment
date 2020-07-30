package com.example.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainInfoApplication implements CommandLineRunner {
	@Autowired
	private trains_repo repository;

	public static void main(String[] args) {
		SpringApplication.run(TrainInfoApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception{
		repository.deleteAll();

		repository.save(new Train("1","saheed",15,48,69,10,63,47,"Delhi","Mumbai",450.20f));
		repository.save(new Train("2","malva",150,48,69,10,63,47,"jaipur","delhi",4500.20f));
		repository.save(new Train("3","venki",12,48,69,10,63,47,"mumbai","katra",4570.20f));

		System.out.println("Trains found with findAll():");
		System.out.println("-------------------------------");

		for(Train t:repository.findAll()){
			System.out.println(t.Train_Name);
		}
	}
}
