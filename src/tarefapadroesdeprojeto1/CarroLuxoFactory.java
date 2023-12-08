/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefapadroesdeprojeto1;

/**
 *
 * @author alan.menezes
 */
public class CarroLuxoFactory extends CarroFactory{

    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new CDPlayer();
    }
    
}
