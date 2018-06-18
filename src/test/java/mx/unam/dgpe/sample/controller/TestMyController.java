package mx.unam.dgpe.sample.controller;

import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

import io.vertx.core.AbstractVerticle;
import static mx.unam.dgpe.sample.controller.RestUtil.*;

public class TestMyController extends AbstractVerticle {
    private static final Logger logger = Logger.getLogger(TestMyController.class);
   
    @Test
    public void ok() throws Exception {
        //String result = sendGet("https://www.binance.com/api/v3/ticker/price?symbol=BTCUSDT");

	String result = sendGet("http://0.0.0.0:8080/api/factorial?fac=5");
        assertTrue("Este es un mensaje", true);
        logger.info(result);

    }

}
