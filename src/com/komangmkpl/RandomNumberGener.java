package com.komangmkpl;

import java.util.Random;

public class RandomNumberGener {
    public int getRandomNumber(){
        return new Random().nextInt();
    }

    public int getRandomNumber(int limit){
        return new Random().nextInt(limit);
    }
}
