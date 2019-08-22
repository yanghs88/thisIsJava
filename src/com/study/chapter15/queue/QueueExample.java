package com.study.chapter15.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("sendMail", "victor"));
        messageQueue.offer(new Message("sendSms", "victor2"));
        messageQueue.offer(new Message("sendKaKaotalk", "victor3"));

        while (!messageQueue.isEmpty())
        {
            Message message = messageQueue.poll();

            switch (message.command)
            {
                case "sendMail":
                    System.out.println(message.to + "님께 메일을 보냅니다.");
                    break;
                case "sendSms":
                    System.out.println(message.to + "님께 문자을 보냅니다.");
                    break;
                case "sendKaKaotalk":
                    System.out.println(message.to + "님께 카톡을 보냅니다.");
                    break;
            }
        }
    }
}
