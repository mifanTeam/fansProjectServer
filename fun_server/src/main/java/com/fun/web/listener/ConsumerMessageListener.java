package com.fun.web.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Milo on 2016/12/2.
 */
public class ConsumerMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        TextMessage textMsg = (TextMessage) message;
        try {
            // 对message进行派发
            




            System.out.println("接收者收到消息：" + textMsg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}