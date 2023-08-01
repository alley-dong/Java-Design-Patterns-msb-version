package com.dongchanglong.builder.demo02;

public class App {

    public static void main(String[] args) {
        RabbitMQClient build = new RabbitMQClient.Builder().setDurable(false).build();

        build.sendMessage("111");

    }
}
