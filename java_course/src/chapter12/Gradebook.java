package chapter12;

import java.util.HashMap;
import java.util.Map;

/*
Chapter 12 Collections Exercise
Gradebook
Students were given a pop quiz, and collectively, they didn't do so great. As
a result, the instructor decided to give them a make-up exam to allow them to
improve their scores.
Given two maps of test scores, update the students' grades only if they did
better on the make-up exam.
Print the final grades.
 */
public class Gradebook {

    public static void main(String[] args) {

        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeupGrades = TestResults.getMakeUpGrades();
        Map<String, Integer> finalGrades = new HashMap<>();

        for (var originalGrade : originalGrades.entrySet()) {
            if (originalGrade.getValue() > makeupGrades.get(originalGrade.getKey())) {
                finalGrades.put(originalGrade.getKey(), originalGrade.getValue());
            } else {
                finalGrades.put(originalGrade.getKey(), makeupGrades.get(originalGrade.getKey()));
            }
        }

        for (var entry : finalGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
