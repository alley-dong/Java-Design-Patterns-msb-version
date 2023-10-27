package com.dongchanglong.demo03;

public class Client {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
        trafficLight.switchToRed();
    }
}
