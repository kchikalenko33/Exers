package netology.task4_4_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CandidateService demoCandidates = new CandidateService();
        demoCandidates.add(new Candidate("Иванов Иван Иванович", Gender.MALE, 25, 4, 5));
        demoCandidates.add(new Candidate("Петров Иван Александрович", Gender.MALE, 28, 4, 3));
        demoCandidates.add(new Candidate("Максимов Иван Александрович", Gender.MALE, 24, 3, 5));
        demoCandidates.add(new Candidate("Сидорова Анна Петровна", Gender.FEMALE, 30, 5, 4));
        demoCandidates.add(new Candidate("Козлов Пётр Сергеевич", Gender.MALE, 35, 5, 5));
        demoCandidates.add(new Candidate("Волкова Мария Ивановна", Gender.FEMALE, 29, 4, 4));
        demoCandidates.add(new Candidate("Смирнов Алексей Викторович", Gender.MALE, 32, 3, 3));
        demoCandidates.add(new Candidate("Орлова Елена Дмитриевна", Gender.FEMALE, 27, 5, 3));
        demoCandidates.add(new Candidate("Белов Дмитрий Николаевич", Gender.MALE, 40, 4, 5));
        demoCandidates.add(new Candidate("Кузнецова Ольга Сергеевна", Gender.FEMALE, 33, 3, 4));
        demoCandidates.add(new Candidate("Павлов Андрей Игоревич", Gender.MALE, 31, 5, 2));

        demoCandidates.print();
    }

}
