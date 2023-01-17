package pl.put.poznan.sortingapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Klasa SortingApplication zawierajaca glowna metode rozruchowa main.
 *
 */

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.sortingapp.rest"})
public class SortingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SortingappApplication.class, args);
	}

}
