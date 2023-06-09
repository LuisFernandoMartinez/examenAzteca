package com.example.examenLuis.CallableExample;

import com.example.examenLuis.FiguraInterface.FiguraInterface;
import java.util.concurrent.Callable;
public class MiCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        FiguraInterface figuraObjet = (radio) -> (radio * radio * 3.1416);
        try {
            System.out.println("INICIANDO----");
            Thread.sleep(300);
            System.out.println(figuraObjet.defaultRadio(10));
          } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
          }
           System.out.println(Thread.currentThread().getName());
           System.out.println( "Radio : " + figuraObjet.getRadio(10));
           return 100;
      }
}
