package com.yuxiu.flashsale.interview;

import com.google.gson.Gson;

import java.net.InetSocketAddress;

public class ChatWebServer //extends WebSocketServer
{

    private static final Gson gson = new Gson();

    public ChatWebServer() {
        //super(new InetSocketAddress(8085));
        //setReuseAddr(true);
        System.out.println("Websocket server started...");
//        try {
//            System.out.println("Debugging - setting motors to half speed. Did this deploy?");
//            MotorController.updateMotors(500, 500);
//        } catch(Throwable e) {
//            e.printStackTrace();
//        }
    }
}
