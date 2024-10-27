package Homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Monitor counts of different types of animal.
 * Sightings are recorded by spotters.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.03.01 (functional)
 */
public class AnimalMonitor
{
    private ArrayList<Sighting> sightings;
    
    /**
     * Create an AnimalMonitor.
     */
    public AnimalMonitor()
    {
        this.sightings = new ArrayList<>();
    }
    
    /**
     * Add the sightings recorded in the given filename to the current list.
     * @param filename A CSV file of Sighting records.
     */
    public void addSightings(String filename)
    {
        SightingReader reader = new SightingReader();
        sightings.addAll(reader.getSightings(filename));
    }
    
    /**
     * Print details of all the sightings.
     */
    public void printList()
    {
        sightings.forEach(sighting -> System.out.println(sighting.getDetails()));
    }
    
    /**
     * Print details of all the sightings of the given animal.
     * @param animal The type of animal.
     */
    public void printSightingsOf(String animal)
    {
        sightings.stream()
                 .filter(sighting -> animal.equals(sighting.getAnimal()))
                 .forEach(sighting -> System.out.println(sighting.getDetails()));        
    }

    /**
     * Return a count of how many sighting records have been made by the given spotter.
     * @param spotterID The ID of the spotter.
     * @return The count of sighting records made by the given spotter.
     */
    public long getCountBySpotter(int spotterID) {
        long specificSightings = sightings.stream()
                .filter(sighting -> sighting.getSpotter() == spotterID)
                .count();
        return specificSightings;
    }

    /**
     * Return the largest count for the given animal in a single Sighting record.
     * @param animal The type of animal.
     * @return The largest count for the given animal.
     */
    public int getLargestCount(String animal) {
        int largestCount = sightings.stream()
                .filter(sighting -> animal.equals(sighting.getAnimal())) // Gets only the sightings of the given animal
                .mapToInt(Sighting::getCount) // Specifically maps to a new stream of integers
                .max() // Gets the maximum value in that stream
                .orElse(0); // Useful to set a default value
        return largestCount;
    }

    /**
     * Return the first Sighting object for the given animal and spotter ID.
     * @param animal The type of animal.
     * @param spotterID The ID of the spotter.
     * @return The first Sighting object for the given animal and spotter ID, or null if none found.
     */
    public Sighting getFirstSighting(String animal, int spotterID) {
        Sighting firstSighting = sightings.stream()
                .filter(sighting -> animal.equals(sighting.getAnimal()) && sighting.getSpotter() == spotterID)
                .findFirst()
                .orElse(null); // Again, useful to set a default value, in this case, null, which makes this method regrettably have an edge case with a null return value

        return firstSighting;
    }

    /**
     * Return a list of a limited number of sightings for a specific animal.
     * @param animal The type of animal.
     * @param limit The maximum number of sightings to return.
     * @return A list of sightings for the specified animal limited to the specified number.
     */
    public List<Sighting> getLimitedSightingsOfAnimal(String animal, int limit) {
        // Save some space by directly returning the result of the stream operation
        return sightings.stream()
                .filter(sighting -> animal.equals(sighting.getAnimal()))
                .limit(limit) // Only gets the first 'limit' number of elements
                .collect(Collectors.toList());
    }

    /**
     * Return a list of sightings for a specific animal after skipping a specified number.
     * @param animal The type of animal.
     * @param skip The number of sightings to skip.
     * @return A list of sightings for the specified animal after skipping the specified number.
     */
    public List<Sighting> getSkippedSightingsOfAnimal(String animal, int skip) {
        return sightings.stream()
                .filter(sighting -> animal.equals(sighting.getAnimal()))
                .skip(skip) // Gets all elements after the first 'skip' number of elements
                .collect(Collectors.toList());
    }

    /**
     * Print all the sightings by the given spotter.
     * @param spotter The ID of the spotter.
     */
    public void printSightingsBy(int spotter)
    {
        sightings.stream()
                 .filter(sighting -> sighting.getSpotter() == spotter)
                 .map(sighting -> sighting.getDetails())
                 .forEach(details -> System.out.println(details));        
    }
    
    /**
     * Return a count of the number of sightings of the given animal.
     * @param animal The type of animal.
     * @return The count of sightings of the given animal.
     */
    public int getCount(String animal)
    {
        return sightings.stream()
                        .filter(sighting -> animal.equals(sighting.getAnimal()))
                        .map(sighting -> sighting.getCount())
                        .reduce(0, (runningSum, count) -> runningSum + count);
    }

    /**
     * Does math!
     * @param numbers A list of numbers to do math on
     */
    public ArrayList<Integer> doMath(ArrayList<Integer> numbers) {

        // Filter out all even, multiply all by 2, then collect and put in a new list

        return numbers.stream()
                .filter(number -> number % 2 != 0) // all odd numbers
                .map(number -> number * 2) // multiply by 2
                .collect(Collectors.toCollection(ArrayList::new)); // Can use method ref on constructor, but also be -> new ArrayList<>()

    }

}
