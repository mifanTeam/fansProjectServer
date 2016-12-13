package com.fun.web.controller;

import com.alibaba.fastjson.JSON;
import com.fun.web.model.Message;
import com.fun.web.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jms.Destination;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/jms")
public class JmsTextController {

    @Autowired
    private ProducerService producerService;
    @Autowired
    @Qualifier("queueDestination")
    private Destination destination;

    @RequestMapping(value ="/test",method = RequestMethod.POST)
    public @ResponseBody String testSend(Message message) throws Exception {

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("message", message);

        //发送更新数据请求
        producerService.sendMessage(destination, JSON.toJSONString(map));

        return "Send complete";
    }
}