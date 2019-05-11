package jmsconsumer;

import javax.annotation.Resource;
import javax.jms.*;

public class Main {

    @Resource(mappedName = "connectionFactoryTopic")
    private static ConnectionFactory con;
    @Resource(mappedName = "myTopic")
    private static Topic t;

//    @Resource(mappedName = "connectionFactoryQueue")
//    private static ConnectionFactory con;
//    @Resource(mappedName = "myQueue")
//    private static Queue q;
    public static void main(String[] args) {
        JMSContext jctx = con.createContext();
        JMSConsumer jc = jctx.createConsumer(t);
        System.out.println("Receiving Message-------");
        String msg = jc.receiveBody(String.class);
        System.out.println("Message Received : " + msg);

    }

}
