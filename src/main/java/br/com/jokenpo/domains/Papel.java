package br.com.jokenpo.domains;

import java.util.Map;
public class Papel extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Empate. Papel empata com papel!";
            case TESOURA -> valor = "Perdeu. Tesoura corta o papel!";
            case PEDRA -> valor = "Ganhou. Papel embrulha pedra!";
            case LAGARTO -> valor = "Perdeu. Lagarto come papel!";
            case SPOCK -> valor = "Ganhou. Papel refuta Spock!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }

}
