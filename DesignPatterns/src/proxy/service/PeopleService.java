package proxy.service;

import proxy.repository.PeopleRepositoryProxy;
import proxy.test.People;

public class PeopleService {
    /*
     * Main methods:
     * - storePeople: Saves a People an object to the repository.
     * - findById: Retrieves a People object by its ID from the repository.
     * - PeopleService(PeopleRepository peopleRepository): to create on constructor of PeopleService with information.
     *
     * Attributes:
     * - PeopleRepository: class that contains object people created.
     */


    /*
    private PeopleRepository peopleRepository;

    public PeopleService (PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public void save (People people) {
        peopleRepository.savePeople(people);
    }

    public People findById (Long id) {
        return peopleRepository.findById(id);
    }

     */

    private PeopleRepositoryProxy peopleRepositoryProxy;

    public PeopleService (PeopleRepositoryProxy peopleRepositoryProxy) {
        this.peopleRepositoryProxy = peopleRepositoryProxy;
    }

    public void save (People people) {
        peopleRepositoryProxy.savePeople(people);
    }

    public People findById (Long id) {
        return peopleRepositoryProxy.findById(id);
    }

    @Override
    public String toString () {
        return "PeopleService{" +
                "peopleRepositoryProxy=" + peopleRepositoryProxy +
                '}';
    }
}
