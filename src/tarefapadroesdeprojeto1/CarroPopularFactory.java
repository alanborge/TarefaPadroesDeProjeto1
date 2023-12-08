/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefapadroesdeprojeto1;

/**
 *
 * @author alan.menezes
 */
public class CarroPopularFactory extends CarroFactory{

    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new TocaFitas();
    }
    
}
