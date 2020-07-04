import java.util.List;

public class Greed {

    public int pontuacao(List<Integer> lanceDeDados) {
        int pontuacao = 0;
        for (Integer lanceDeDado : lanceDeDados){
            if(lanceDeDado == 1){
                pontuacao += 100;
            }
        }
        return pontuacao;
    }
}
