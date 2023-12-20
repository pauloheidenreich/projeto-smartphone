package br.com.mysmart.music;

public class MyPlayer implements Player {
    @Override
    public void tocar() {
        System.out.println("\nMyPlayer: Tocando música\n");
    }

    @Override
    public void pausarMusica() {
        System.out.println("\nMyPlayer: Música Pausada !\n");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("\nMyPlayer: Selecione a Faixa desejada\n");
    }
}
