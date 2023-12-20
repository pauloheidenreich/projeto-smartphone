package br.com.mysmart.phone;

public class MyPhone implements Phone {

    @Override
    public void ligar() {
        System.out.println("\nMyphone: Ligando..\n");
    }

    @Override
    public void atender() {
        System.out.println("\nMyphone: Atendendo ligação\n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("\nMyphone: Iniciando correio de voz\n");
    }
}
