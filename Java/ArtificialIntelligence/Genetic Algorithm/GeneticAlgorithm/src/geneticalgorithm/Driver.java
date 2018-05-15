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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Population population = new Population(GeneticAlgorithm.POPULATION_SIZE).initializePopulation();
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm();
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Generation # 0 " + " | Fittest chromosome fitness: " + population.getChromosomes()[0].getFitness());
        printPopulation(population, "Target Chromosome: " + Arrays.toString(GeneticAlgorithm.TARGET_CHROMOSOME));
        
        int generationNumber = 0;
        while (population.getChromosomes()[0].getFitness() < GeneticAlgorithm.TARGET_CHROMOSOME.length) {
            generationNumber++;
            population = geneticAlgorithm.evolve(population);
            population.sortChromosomesByFitness();
            System.out.println("\n---------------------------------------------------------------------------");
            System.out.println("Generation # " + generationNumber +" | Fittest chromosome fitness: " + 
                    population.getChromosomes()[0].getFitness());
            printPopulation(population, "Target Chromosome: " + Arrays.toString(GeneticAlgorithm.TARGET_CHROMOSOME));
        }
    }
    
    public static void printPopulation(Population population, String heading) {
        System.out.println(heading);
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < population.getChromosomes().length; i++) {
            System.out.println("Chromosome # " + i + " : " + Arrays.toString(population.getChromosomes()[i].getGenes()) + 
                    " | Fitness: " + population.getChromosomes()[i].getFitness());
        }
    }
}
