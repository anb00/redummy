package com.iesemilidarder.asoto.data;

import com.iesemilidarder.asoto.Exception.IESMyException;

/**
 * com.iesemilidarder.asoto.data
 * Class Moto
 * By berto. 04/10/2018
 */
public class Moto extends Vehicle {

    public void start() {
        doLog("brum brum");

        throw new IESMyException();






    }
}
