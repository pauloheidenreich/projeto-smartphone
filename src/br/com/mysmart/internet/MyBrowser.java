package br.com.mysmart.internet;

public class MyBrowser implements Browser {

    @Override
    public void exibirPagina() {
        System.out.println("\nMyBrowser: Exibindo página da Web\n");
    }

    @Override
    public void abriNovaAba() {
        System.out.println("\nMyBrowser: Abrindo nova aba\n");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("\nMyBrowser: Atualizando página\n");
    }
}
