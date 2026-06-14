package service;
import model.Partida;
import model.Selecao;
import java.util.ArrayList;
import java.util.List;

public class Copa {
    private List<Selecao> selecoes;
    private List<Partida> partidas;
    private List<String> artilheiros;

    public Copa() {
        selecoes = new ArrayList<>();
        partidas = new ArrayList<>();
        artilheiros = new ArrayList<>();
    }

}