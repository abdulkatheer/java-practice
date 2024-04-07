package org.example.map.learning1;

import java.util.Objects;

public class Student {
    private final String id;
    private final int tamilMark;
    private final int englishMark;
    private final int mathsMark;
    private final int scienceMark;
    private final int socialMark;
    private final int totalMarks;

    public Student(String id, int tamilMark, int englishMark, int mathsMark, int scienceMark, int socialMark) {
        this.id = id;
        this.tamilMark = tamilMark;
        this.englishMark = englishMark;
        this.mathsMark = mathsMark;
        this.scienceMark = scienceMark;
        this.socialMark = socialMark;
        this.totalMarks = tamilMark + englishMark + mathsMark + scienceMark + socialMark;
    }

    public String getId() {
        return id;
    }

    public int getTamilMark() {
        return tamilMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public int getMathsMark() {
        return mathsMark;
    }

    public int getScienceMark() {
        return scienceMark;
    }

    public int getSocialMark() {
        return socialMark;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    @Override
    public String toString() {
        return "%-10s Tamil - %03d; English - %03d; Maths - %03d; Science - %03d; Social Science - %03d; Total - %03d".formatted(id, tamilMark, englishMark, mathsMark, scienceMark, socialMark, totalMarks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
