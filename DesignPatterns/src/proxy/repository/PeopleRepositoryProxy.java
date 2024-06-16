package proxy.repository;

import proxy.test.People;

import java.util.logging.Logger;

public class PeopleRepositoryProxy extends PeopleRepository {

    private static Logger logger = Logger.getLogger(PeopleRepositoryProxy.class.getName());

    @Override
    public void savePeople (People people) {
        logger.info("Execute call method savePeople");
        super.savePeople(people);
    }


    @Override
    public People findById (Long id) {
        logger.info("Execute search method findById");
        return super.findById(id);

    }

    @Override
    public String toString () {
        return "PeopleRepositoryProxy{} " + super.toString();
    }
}
