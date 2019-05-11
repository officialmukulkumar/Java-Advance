/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import javax.ejb.*;
import javax.jms.*;

/**
 *
 * @author Mukul Samrat
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "myQueue")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MyMDB implements MessageListener {

    public MyMDB() {
    }

    @Override
    public void onMessage(Message message) {
        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("message: " + tm.getText());

        } catch (JMSException ex) {

            System.out.println(ex);

        }

    }

}
