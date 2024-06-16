package proxy.test;

public class PeopleTestBuilder {
    private String name;
    private String rg;
    private String cpf;

    public PeopleTestBuilder getCpf (String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PeopleTestBuilder getName (String name) {
        this.name = name;
        return this;
    }

    public PeopleTestBuilder getRg (String rg) {
        this.rg = rg;
        return this;
    }

    public People creationBuilder () {
        return new People(cpf, name, rg);
    }

    @Override
    public String toString () {
        return "PeopleTestBuilder{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
