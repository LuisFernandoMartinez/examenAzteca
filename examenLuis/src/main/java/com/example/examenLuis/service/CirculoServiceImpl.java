package com.example.examenLuis.service;

import com.example.examenLuis.FiguraInterface.FiguraInterface;
import com.example.examenLuis.dao.CirculoDao;
import com.example.examenLuis.entity.CirculoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;
@Service
public class CirculoServiceImpl implements CirculoService   {
@Autowired
private CirculoDao circuloDao;
    @Override
    public String saveGeneralDataCircle(CirculoEntity circulo) {
        //final List<Integer> integers =  Arrays.asList(1,2,3,4,5);
        Callable<Integer> callableObj = () -> {
            FiguraInterface figuraObjet = (radio) -> (radio * radio * 3.1416);
            double areaValue=figuraObjet.getRadio(circulo.getRadio());
            circulo.setArea(areaValue);
            //int result = integers.stream().mapToInt(i -> i.intValue()).sum();
            int result = (int) areaValue;
            return result;
        };
        ExecutorService service =  Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(callableObj);
        Integer result=0;
        try {
            result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Area = "+result);

        circuloDao.save(circulo);
        return "DONE";
    }
}
