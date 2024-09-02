package celular;

import funcionalidades.aparelhoTelefonico.Phone;
import funcionalidades.navegadorInternet.Safari;
import funcionalidades.reprodutorMusical.IPod;

public class Iphone{
    public static void main(String[] args) {
        IPod iPod = new IPod();
        Phone phone = new Phone();
        Safari safari = new Safari();
    
        System.out.println("IPod: ");
        iPod.selecionarMusica("Evidências");
        System.out.println();

        System.out.println("Safari: ");
        safari.adicionarNovaAba();
        safari.exibirPagina("instagram.com");
        System.out.println();

        System.out.println("Phone: ");
        phone.ligar(987654321);
        phone.iniciarCorreioVoz();
    }
}
