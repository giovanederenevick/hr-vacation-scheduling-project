package br.com.giovanederenevick.hrvacationscheduling;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HrVacationSchedulingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HrVacationSchedulingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		List<LocalDate> list = new ArrayList<>();
//		LocalDate dateInitial = LocalDate.of(2021,01,01);
//		LocalDate dateFinal;
//		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//		for (int i = 0; i < 20; i++) {
//			dateFinal = dateInitial.plusDays(19);
////			System.out.println("1:" + dateInitial + " 2:" + dateFinal);
//			System.out.println("INSERT INTO tb_vacation_dates(initial_date,end_date) VALUES ('" + dateInitial + "','" + dateFinal + "');");
//			dateInitial = dateFinal.plusDays(1);
//
//		}

//		System.out.println(date.format(sdf));
//
//		date = date.plusDays(19);
//
//		System.out.println(date.format(sdf));
	}
}
