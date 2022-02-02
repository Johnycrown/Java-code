package Chapter11.MP3OOP;

import java.util.List;

public class ImparativeVersusFunctionalProgramming {
    int getTopScore(List<Student> students) {
        int topScore = 0;
        for (Student s : students) {
            if (s == null) continue;
            topScore = Math.max(topScore, s.getScore());
        }
        return topScore;
    }

}
class Student{
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
