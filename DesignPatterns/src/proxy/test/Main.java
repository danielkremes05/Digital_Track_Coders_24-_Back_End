package proxy.test;

import proxy.repository.PeopleRepositoryProxy;
import proxy.service.PeopleService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        List<PeopleService> peopleServices = new ArrayList<>();

        People people1 = new PeopleTestBuilder()
                .getName("Daniel")
                .getRg("1465020423")
                .getCpf("12455656")
                .creationBuilder();


        // System.out.println(people1);

        PeopleRepositoryProxy peopleRepositoryProxy = new PeopleRepositoryProxy();

        // peopleRepositoryProxy.savePeople(people1);

        PeopleService peopleService = new PeopleService(peopleRepositoryProxy);

        // System.out.println(peopleService.findById(1L));

        // System.out.println(peopleRepositoryProxy);

        peopleServices.add(peopleService);

        for (PeopleService value: peopleServices) {
            System.out.println(value.toString());
        }

    }
}
