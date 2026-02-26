package br.com.fiapride.main;


import br.com.fiapride.model.Geladeira;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Geladeira MinhaGeladeira = new Geladeira ();
        MinhaGeladeira.cor = "Cinza";
        MinhaGeladeira.material = "Aço";
        MinhaGeladeira.potencia = 400;
        
        Geladeira ProfessorGeladeira = new Geladeira();
        ProfessorGeladeira.cor = "Branca";
        ProfessorGeladeira.material = "Aço";
        ProfessorGeladeira.potencia = 500;
        
        System.out.println("Minha geladeira é da cor:"+ MinhaGeladeira.cor);
        System.out.println("Minha geladeira é feita de:"+ MinhaGeladeira.material);
        System.out.println("A potência da minha geladeira é:"+ MinhaGeladeira.potencia);
        
        System.out.println("A geladeira do professor é da cor:"+ ProfessorGeladeira.cor);
        System.out.println("A geladeira é feita de:"+ ProfessorGeladeira.material);
        System.out.println("A potência da geladeira do professor é:"+ ProfessorGeladeira.potencia);
        
    }
}