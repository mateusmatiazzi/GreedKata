import java.util.ArrayList;
import java.util.List;

public class Greed {

    public int pontuacao(List<Integer> lanceDeDados) {
        int pontuacao = 0;
        List<Integer> quantidadeDeCadaNumero = retornaQuantidadeDeCadaNumero(lanceDeDados);

        if(ehUmaSequencia(quantidadeDeCadaNumero)){
            return 1200;
        }

        if (saoTresPares(quantidadeDeCadaNumero)){
            return 800;
        }

        for (int numeroDeRepeticoes=6;numeroDeRepeticoes>=3;numeroDeRepeticoes--){
            if(temNNumeroNaListaDeQuantidades(quantidadeDeCadaNumero, numeroDeRepeticoes)){
                pontuacao += pontuacaoDoNumeroRepetido(quantidadeDeCadaNumero, numeroDeRepeticoes);
            }
        }
        if(quantidadeDeCadaNumero.get(1) <= 2) {
            pontuacao += quantidadeDeCadaNumero.get(1)*100;
        }
        if(quantidadeDeCadaNumero.get(5) <= 2){
            pontuacao += quantidadeDeCadaNumero.get(5)*50;
        }
        return pontuacao;
    }

    private boolean saoTresPares(List<Integer> quantidadeDeCadaNumero) {
        int quantidadeDePares = 0;
        for (int quantidadeNumeroI = 1; quantidadeNumeroI <= 6; quantidadeNumeroI++) {
            if (quantidadeDeCadaNumero.get(quantidadeNumeroI) == 2){
                quantidadeDePares++;
            }
        }
        return quantidadeDePares == 3;
    }

    private boolean ehUmaSequencia(List<Integer> quantidadeDeCadaNumero) {
        boolean ehSequencia = true;

        for (int quantidadeNumeroI = 1; quantidadeNumeroI <= 6; quantidadeNumeroI++) {
            if (quantidadeDeCadaNumero.get(quantidadeNumeroI) != 1) {
                ehSequencia = false;
                break;
            }
        }

        return ehSequencia;
    }

    private int pontuacaoDoNumeroRepetido(List<Integer> quantidadeDeCadaNumero, int numeroDeRepeticoes) {
        return pontuacaoDeTriplaRepeticao(quantidadeDeCadaNumero.indexOf(numeroDeRepeticoes)) * bonus(numeroDeRepeticoes);
    }

    private int bonus(int numeroDeRepeticoes) {
        int bonusMaximo = 8;
        for (int maximo=6;maximo>numeroDeRepeticoes;maximo--){
            bonusMaximo /= 2;
        }
        return  bonusMaximo;
    }

    private int pontuacaoDeTriplaRepeticao(int numeroQueFoiRepetido){
        if (numeroQueFoiRepetido == 1)
            return 1000;
        return 100*numeroQueFoiRepetido;
    }

    private boolean temNNumeroNaListaDeQuantidades(List<Integer> quantidadeDeCadaNumero, int numeroDeRepeticoes){
        return quantidadeDeCadaNumero.contains(numeroDeRepeticoes);
    }

    private List<Integer> retornaQuantidadeDeCadaNumero(List<Integer> lanceDeDados) {
        List<Integer> quantidadeDeCadaNumero = retornaUmaListaContendoSomenteZeros();
        int posicao;

        for (Integer lanceDeDado : lanceDeDados) {
            posicao = lanceDeDado;
            quantidadeDeCadaNumero.set(posicao, quantidadeDeCadaNumero.get(posicao) + 1);
        }
        return quantidadeDeCadaNumero;
    }

    private List<Integer> retornaUmaListaContendoSomenteZeros(){
        List<Integer> listaComZeros = new ArrayList<Integer>();
        for(int i=0;i<=6;i++){
            listaComZeros.add(0);
        }
        return listaComZeros;
    }
}
