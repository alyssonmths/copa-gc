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

    public void adicionarSelecoes(Selecao selecao) {
        selecoes.add(selecao);
    }

    public void registrarPartidas(Partida partida) {
        partidas.add(partida);
    }

    public void listarGrupos(char grupo) {
        for (Selecao selecao : selecoes){
            if(selecao.getGrupo()==grupo){
                System.out.println(selecao);
            }
        }
    }
    public void adicionarArtilheiros(String nome){
        artilheiros.add(nome);
    }
    public void exibirrArtilheiros() {
        for (String artilheiro : artilheiros) {
            System.out.println(artilheiro);
        }
    }
    public void calcularClassificacao(){
        System.out.println("=== CLASSIFICAÇÃO ===");
        for (Selecao selecao: selecoes){
            System.out.println(selecao.getNome());
        }
    }

}