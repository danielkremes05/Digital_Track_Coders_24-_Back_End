package proxy.repository;

import proxy.test.People;

import java.util.HashMap;
import java.util.Map;

public class PeopleRepository {
    /*
     * Main methods:
     * - storePeople: Saves a People object to the repository.
     * - findById: Retrieves a People object by its ID from the repository.
     *
     * Attributes:
     * - bank: A Map to store People objects, where the key is the ID and the value is the People object.
     * - countID: A counter to generate unique IDs for each People object.
     */

    // Counter to generate a unique ID for each People object
    private static Long countID = 1L;

    // Map to store People objects, with their IDs as keys
    private Map<Long, People> bank = new HashMap<>();

    // Setter method for the bank map
    public void setBank (Map<Long, People> bank) {
        this.bank = bank;
    }

    // Method to save a People object to the repository
    public void savePeople (People people) {
        // Store the People object in the map with a unique ID
        bank.put(countID++, people);
    }

    // Method to retrieve a People object by its ID from the repository
    public People findById (Long id) {
        try {
            Thread.sleep(1000);
            return bank.get(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString () {
        return "PeopleRepository{" +
                "bank=" + bank +
                '}';
    }
}
