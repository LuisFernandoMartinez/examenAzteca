package com.example.examenLuis;

import com.example.examenLuis.CallableExample.MiCallable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@SpringBootApplication
public class ExamenLuisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExamenLuisApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        try {
            ExecutorService servicio= Executors.newFixedThreadPool(1);

            Future<Integer> resultado= servicio.submit(new MiCallable());
            if(resultado.isDone()) {
                System.out.println(resultado.get());
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @PostConstruct
    private void postConstruct() {

    }


}
