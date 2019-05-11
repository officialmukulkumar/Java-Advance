package jmsproducer;

import javax.annotation.Resource;
import javax.jms.*;

public class Main {

    @Resource(mappedName = "connectionFactoryQueue")
    private static ConnectionFactory con;
    @Resource(mappedName = "myQueue")
    private static Queue q;
//    @Resource(mappedName = "connectionFactoryTopic")
//    private static ConnectionFactory con;
//    @Resource(mappedName = "myTopic")
//    private static Topic t;

    public static void main(String[] args) {

        JMSContext jctx = con.createContext();
        JMSProducer jp = jctx.createProducer();
        String msg = "Hello All, Hows Life ?";
        System.out.println("Message Sending -------");
        jp.send(q, msg);
        System.out.println("Message Sent Sucessfully");
    }

}
