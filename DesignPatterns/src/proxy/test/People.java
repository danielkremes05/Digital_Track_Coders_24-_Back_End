package proxy.test;

public class People {
    private String name;
    private String rg;
    private String cpf;

    public People (String cpf, String name, String rg) {
        this.cpf = cpf;
        this.name = name;
        this.rg = rg;
    }

    public String getCpf () {
        return cpf;
    }

    public String getName () {
        return name;
    }

    public String getRg () {
        return rg;
    }

    @Override
    public String toString () {
        return "People " +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", rg='" + rg + '\'';
    }
}
