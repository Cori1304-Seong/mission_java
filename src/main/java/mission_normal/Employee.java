package mission_normal;


interface Employee {
    void work();
}

class Staff implements Employee {
    private String name;

    public Staff(String name, double salary) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is working on tasks.");
    }
}

class Manager implements Employee {
    private String name;

    public Manager(String name, double salary, double bonus) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }

}
