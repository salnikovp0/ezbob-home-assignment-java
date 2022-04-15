package com.example.serviceshuffle.service;

import com.example.serviceshuffle.model.ShuffleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class ShuffleService {
    @Autowired
    private LogService logService;

    public int[] shuffle(ShuffleRequest shuffle) throws InterruptedException {
        int[] array = IntStream.rangeClosed(1, shuffle.getValue()).toArray();

        int n = array.length;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomValue = i + random.nextInt(n - i);
            int randomElement = array[randomValue];
            array[randomValue] = array[i];
            array[i] = randomElement;
        }

        this.logService.logRequest(Arrays.toString(array));

        return array;
    }
}
