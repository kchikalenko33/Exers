package netology.task4_4_2;

public class Candidate {
    private String fullName;
    private Gender gender;
    private int age;
    private int relevance;
    private int rating;

    public Candidate(String fullName, Gender gender, int age, int relevance, int rating) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", relevance=" + relevance +
                ", rating=" + rating +
                '}';
    }
}
