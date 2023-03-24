package br.com.jokenpo.domains;

import java.util.Map;

public class Pedra extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Perdeu! Papel cobre pedra!";
            case TESOURA -> valor = "Ganhou! Pedra amassa tesoura!";
            case PEDRA -> valor = "Empate! Pedra empata com pedra!";
            case LAGARTO -> valor = "Ganhou! Pedra esmaga lagarto!";
            case SPOCK -> valor = "Perdeu! Spock vaporiza pedra!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}
