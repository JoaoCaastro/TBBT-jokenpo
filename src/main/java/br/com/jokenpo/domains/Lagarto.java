package br.com.jokenpo.domains;

import java.util.Map;

public class Lagarto extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Ganhou! Lagarto come papel!";
            case TESOURA -> valor = "Perdeu! Tesoura decapita lagarto!";
            case PEDRA -> valor = "Perdeu! Pedra esmaga lagarto!";
            case LAGARTO -> valor = "Empatou! Lagarto empata com lagarto!";
            case SPOCK -> valor = "Ganhou! Lagarto envenena Spock!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}
