package com.fun.web.service;

import javax.jms.Destination;

/**
 * Created by Milo on 2016/12/2.
 */
public interface ProducerService {
    void sendMessage(Destination destination, String message);
}
