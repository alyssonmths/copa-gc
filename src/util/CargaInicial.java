package util;
import model.Partida;
import model.Selecao;
import service.Copa;

public class CargaInicial {
    public static void carregar(Copa copa){
        //GRUPO A
        Selecao brasil= new Selecao("Brasil", 'A', "BRA");
        Selecao argentina= new Selecao("Argentina", 'A', "ARG");
        Selecao franca= new Selecao("França", 'A', "FRA");
        Selecao alemanha= new Selecao("Alemanha", 'A', "ALE");

        //GRUPO B
        Selecao espanha= new Selecao("Espanha", 'B', "ESP");
        Selecao portugal= new Selecao("Portugal", 'B', "POR");
        Selecao inglaterra= new Selecao("Inglaterra",'B', "ING");
        Selecao mexico= new Selecao("Mexico", 'B', "MEX");

        copa.adicionarSelecoes(brasil);
        copa.adicionarSelecoes(argentina);
        copa.adicionarSelecoes(franca);
        copa.adicionarSelecoes(alemanha);
        copa.adicionarSelecoes(espanha);
        copa.adicionarSelecoes(mexico);
        copa.adicionarSelecoes(portugal);
        copa.adicionarSelecoes(inglaterra);

        //Partidas
        copa.registrarPartidas(new Partida(brasil,argentina));
        copa.registrarPartidas(new Partida(franca,alemanha));
        copa.registrarPartidas(new Partida(espanha,mexico));
        copa.registrarPartidas(new Partida(portugal,inglaterra));
    }


}