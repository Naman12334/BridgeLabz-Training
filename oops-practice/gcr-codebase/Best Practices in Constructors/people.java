class people {
    String name;
    int age;

    people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    people(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}
