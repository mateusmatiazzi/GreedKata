import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class GreedTeste {

    Greed greed;
    int esperado;

    @BeforeEach
    void inicializaTestes(){
        greed = new Greed();
        esperado = 0;
    }

    @Test
    void deveRetornarAPontuacaoParaONumeroUm() {
        esperado = 100;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(1, 2, 2, 4, 3, 6)));

        esperado = 200;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(1, 1, 2, 4, 3, 6)));

        esperado = 1000;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(1, 1, 1, 4, 3, 6)));

        esperado = 2000;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(1, 1, 1, 1, 3, 6)));

        esperado = 4000;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(1, 1, 1, 1, 1, 6)));

        esperado = 8000;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(1, 1, 1, 1, 1, 1)));
    }

    @Test
    void deveDarAPontuacaoParaNumeroDois() {
        esperado = 0;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(3, 2, 2, 4, 3, 6)));

        esperado = 200;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(2, 2, 2, 4, 3, 6)));

        esperado = 1600;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(2, 2, 2, 2, 2, 2)));
    }

    @Test
    void deveDarAPontuacaoParaNumeroQuatro() {
        esperado = 0;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(3, 2, 2, 4, 3, 6)));

        esperado = 400;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(2, 2, 3, 4, 4, 4)));

        esperado = 1600;
        assertEquals(esperado, greed.pontuacao(Arrays.asList(2, 4, 4, 4, 4, 4)));
    }
}
