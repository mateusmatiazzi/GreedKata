import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GreedTeste {

    Greed greed;
    int atual;
    List<Integer> lanceDeDados;

    @BeforeEach
    void inicializaTestes(){
        greed = new Greed();
        atual = 0;
        lanceDeDados = new ArrayList<Integer>();
    }

    @Test
    void deveDarAPontuacaoQuandoSoTemONumeroUm() {
        lanceDeDados.addAll(Arrays.asList(1, 2, 2, 4, 3, 6));
        atual = 100;

        assertEquals(atual, greed.pontuacao(lanceDeDados));
    }

    @Test
    void deveDarAPontuacaoQuandoTemDoisNumerosUns() {
        lanceDeDados.addAll(Arrays.asList(1, 2, 2, 4, 3, 6));
       atual = 200;

       assertEquals(atual, greed.pontuacao(lanceDeDados));
    }
}
