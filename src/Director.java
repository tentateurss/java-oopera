public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return String.format("Режисер: %s %s", getName(), getSurname());
    }

    public void printDirectorInfo() {
        System.out.println("=== Режиссер: ===");
        System.out.printf("Имя: %s %s%n", getName(), getSurname());
        System.out.printf("Поставлено спектаклей: %d%n", numberOfShows);
        System.out.printf("Пол: %s%n", getGender() == Gender.MALE ? "мужской" : "женский");
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}