package com.yuxiu.flashsale.interview;


import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@ServerEndpoint(value = "/chat/{user-name}")
public class ChatEndpoint {
    //private Session session;
    private static HashMap<Session, String> usersToSession= new HashMap<>();
    @OnOpen
    public void onOpen(Session session, @PathParam("user-name") String userName) throws IOException {
        //this.session = session;
        usersToSession.put(session, userName);
        //System.out.println("Yuxiu: on open");
    }

    //lafikl -url "ws://localhost:8085/chat/user-name"

    @OnMessage
    public void onMessage(Session session, String message) throws IOException {
        // Handle new messages
        for(Map.Entry<Session, String> entry : usersToSession.entrySet()) {
            if(entry.getKey().getId().equals(session.getId())) {
                continue;
            } else {
                entry.getKey().getBasicRemote().sendText(message);
            }
        }

    }


    @OnClose
    public void onClose(Session session) throws IOException {
        usersToSession.remove(session);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        // Do error handling here
    }

}
