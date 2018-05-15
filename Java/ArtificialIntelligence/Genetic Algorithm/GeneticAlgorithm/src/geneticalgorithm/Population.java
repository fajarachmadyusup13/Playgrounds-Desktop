/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

import java.util.Arrays;

/**
 *
 * @author ghost
 */
public class Population {
    private Chromosome[]  chromosomes;

    public Population(int length) {
        this.chromosomes = new Chromosome[length];
    }
    
    public Population initializePopulation() {
        for (int i = 0; i < chromosomes.length; i++) {
            chromosomes[i] = new Chromosome(GeneticAlgorithm.TARGET_CHROMOSOME.length).initializeChromosome();
        }
        sortChromosomesByFitness();
        return this;
    }

    public Chromosome[] getChromosomes() {
        return chromosomes;
    }
    
    public void sortChromosomesByFitness(){
        Arrays.sort(chromosomes, (chromosome1, chromosome2) -> {
            int flag = 0;
            if (chromosome1.getFitness() > chromosome2.getFitness()) flag = -1;
            else if (chromosome1.getFitness() < chromosome2.getFitness()) flag = 1;
            return flag;
        });
    }
}
