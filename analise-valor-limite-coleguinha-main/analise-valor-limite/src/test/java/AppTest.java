import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.ifpr.SimuladorCashback;


public class AppTest {
    // FAIXA BRONZE
    @Test
    public void testCashbackBronzeAbaixoLimiteInferior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 4.9995; // 5% de R$ 99,99
        double resultado = simulador.calculaCashBack(99.99, "Bronze");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackBronzeNoLimiteInferior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 5.0; // 5% de R$ 100,00
        double resultado = simulador.calculaCashBack(100.00, "Bronze");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackBronzeLogoAcimaLimiteInferior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 10.001; // 10% de R$ 100,01
        double resultado = simulador.calculaCashBack(100.01, "Bronze");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackBronzePoucoAcimaLimiteInferior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 10.002; // 10% de R$ 100,02
        double resultado = simulador.calculaCashBack(100.02, "Bronze");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackBronzeProximoAoLimiteSuperior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 49.999; // 10% de R$ 499,99
        double resultado = simulador.calculaCashBack(499.99, "Bronze");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackBronzeNoLimiteSuperior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 50.0; // 10% de R$ 500,00
        double resultado = simulador.calculaCashBack(500.00, "Bronze");
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void testCashbackBronzeNoLimiteSuperior1() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 75.0; // 15% de R$ 500,00
        double resultado = simulador.calculaCashBack(500.00, "Bronze");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackBronzeAcimaLimiteSuperior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 75.0015; // 15% de R$ 500,01
        double resultado = simulador.calculaCashBack(500.01, "Bronze");
        assertEquals(esperado, resultado, 0.01);
    }
    

    // FAIXA PRATA 
    @Test
    public void testCashbackPrataAbaixoLimiteInferior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 9.999; // 10% de R$ 99,99
        double resultado = simulador.calculaCashBack(99.99, "Prata");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackPrataNoLimiteInferior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 10.0; // 10% de R$ 100,00
        double resultado = simulador.calculaCashBack(100.00, "Prata");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackPrataLogoAcimaLimiteInferior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 15.0015; // 15% de R$ 100,01
        double resultado = simulador.calculaCashBack(100.01, "Prata");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackPrataPoucoAcimaLimiteInferior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 15.003; // 15% de R$ 100,02
        double resultado = simulador.calculaCashBack(100.02, "Prata");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackPrataProximoAoLimiteSuperior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 74.9985; // 15% de R$ 499,99
        double resultado = simulador.calculaCashBack(499.99, "Prata");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackPrataNoLimiteSuperior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 75.0; // 15% de R$ 500,00
        double resultado = simulador.calculaCashBack(500.00, "Prata");
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void testCashbackPrataNoLimiteSuperior1() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 100.0; // 20% de R$ 500,00
        double resultado = simulador.calculaCashBack(500.00, "Prata");
        assertEquals(esperado, resultado, 0.01);
    }
    
    @Test
    public void testCashbackPrataAcimaLimiteSuperior() {
        SimuladorCashback simulador = new SimuladorCashback();
        double esperado = 100.002; // 20% de R$ 500,01
        double resultado = simulador.calculaCashBack(500.01, "Prata");
        assertEquals(esperado, resultado, 0.01);
    }
    

    // FAIXA OURO
    @Test
public void testCashbackOuroAbaixoLimiteInferior() {
    SimuladorCashback simulador = new SimuladorCashback();
    double esperado = 14.9985; // 15% de R$ 99,99
    double resultado = simulador.calculaCashBack(99.99, "Ouro");
    assertEquals(esperado, resultado, 0.01);
}

@Test
public void testCashbackOuroNoLimiteInferior() {
    SimuladorCashback simulador = new SimuladorCashback();
    double esperado = 15.0; // 15% de R$ 100,00
    double resultado = simulador.calculaCashBack(100.00, "Ouro");
    assertEquals(esperado, resultado, 0.01);
}

@Test
public void testCashbackOuroLogoAcimaLimiteInferior() {
    SimuladorCashback simulador = new SimuladorCashback();
    double esperado = 20.002; // 20% de R$ 100,01
    double resultado = simulador.calculaCashBack(100.01, "Ouro");
    assertEquals(esperado, resultado, 0.01);
}

@Test
public void testCashbackOuroPoucoAcimaLimiteInferior() {
    SimuladorCashback simulador = new SimuladorCashback();
    double esperado = 20.004; // 20% de R$ 100,02
    double resultado = simulador.calculaCashBack(100.02, "Ouro");
    assertEquals(esperado, resultado, 0.01);
}

@Test
public void testCashbackOuroProximoAoLimiteSuperior() {
    SimuladorCashback simulador = new SimuladorCashback();
    double esperado = 99.998; // 20% de R$ 499,99
    double resultado = simulador.calculaCashBack(499.99, "Ouro");
    assertEquals(esperado, resultado, 0.01);
}

@Test
public void testCashbackOuroNoLimiteSuperior() {
    SimuladorCashback simulador = new SimuladorCashback();
    double esperado = 100.0; // 20% de R$ 500,00
    double resultado = simulador.calculaCashBack(500.00, "Ouro");
    assertEquals(esperado, resultado, 0.01);
}
@Test
public void testCashbackOuroNoLimiteSuperior1() {
    SimuladorCashback simulador = new SimuladorCashback();
    double esperado = 125.0; // 25% de R$ 500,00
    double resultado = simulador.calculaCashBack(500.00, "Ouro");
    assertEquals(esperado, resultado, 0.01);
}

@Test
public void testCashbackOuroAcimaLimiteSuperior() {
    SimuladorCashback simulador = new SimuladorCashback();
    double esperado = 125.0025; // 25% de R$ 500,01
    double resultado = simulador.calculaCashBack(500.01, "Ouro");
    assertEquals(esperado, resultado, 0.01);
}

}
    