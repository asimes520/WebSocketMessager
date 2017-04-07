package com.asimes.websocket.handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Created by Asimes on 2017/3/23.
 */
public class MessageHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        System.out.println("text message: " + session.getId() + "-" + message.getPayload());
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session)
            throws Exception {
// 与客户端完成连接后调用 
        System.out.println("afterConnectionEstablished");
        System.out.println("getId:" + session.getId());
        System.out.println("getLocalAddress:" + session.getLocalAddress().toString());
        System.out.println("getTextMessageSizeLimit:" + session.getTextMessageSizeLimit());
        System.out.println("getUri:" + session.getUri().toString());
        System.out.println("getPrincipal:" + session.getPrincipal());
        session.sendMessage(new TextMessage("Hello".getBytes()));
    }

    @Override
    public void handleTransportError(WebSocketSession session,
                                     Throwable exception) throws Exception {
// 消息传输出错时调用
        System.out.println(exception.getMessage());
        System.out.println("handleTransportError");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session,
                                      CloseStatus closeStatus) throws Exception {
// 一个客户端连接断开时关闭 
        System.out.println("afterConnectionClosed");
    }

    @Override
    public boolean supportsPartialMessages() {
// TODO Auto-generated method stub 
        return false;
    }
}
