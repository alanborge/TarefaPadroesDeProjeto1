/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefapadroesdeprojeto1;

/**
 *
 * @author alan.menezes
 */
public class TesteFactory {
    
    private static Carro montarCarro(String tipo){
        CarroFactory cf = null;
        switch(tipo){
            case "luxo":
                cf = new CarroLuxoFactory();
                break;
            case "popular":
                cf = new CarroPopularFactory();
                
        }
        
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }
   
    public static void main(String[] args) {
        Carro c1 = montarCarro("luxo");
        Carro c2 = montarCarro("popular");
        System.out.println("Carro1: " + c1.roda + " /" + c1.som +"\n" + "Carro2: " + c2.roda + " /" + c2.som);
    }
}
