public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return String.format("=== Режиссер: ===%n" +
                        "Имя: %s %s%n" +
                        "Поставлено спектаклей: %d%n" +
                        "Пол: %s",
                getName(),
                getSurname(),
                numberOfShows,
                getGender() == Gender.MALE ? "мужской" : "женский");
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}