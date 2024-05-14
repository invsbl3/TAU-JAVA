package chapter12;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {
        Map<String, Double> popQuiz = new HashMap<>();
        popQuiz.put("John", 5.);
        popQuiz.put("Ellen", 6.);
        popQuiz.put("Mario", 4.);
        popQuiz.put("Joseph", 5.5);
        popQuiz.put("Alice", 7.);
        // printMap(popQuiz);

        Map<String, Double> makeUpExam = new HashMap<>();
        makeUpExam.put("John", 3.);
        makeUpExam.put("Ellen", 9.);
        makeUpExam.put("Mario", 8.);
        makeUpExam.put("Joseph", 4.);
        makeUpExam.put("Alexander", 3.);
        // printMap(makeUpExam);

        Map<String, Double> grades = new HashMap<>();
        //have to run through both maps to catch elements that belongs to just one of them.
        popQuiz.forEach((k, v) -> {
                    if (makeUpExam.containsKey(k) && makeUpExam.get(k) >= v) {
                        System.out.println("Student" + k + " get better at Makeup Exam");
                        grades.put(k, makeUpExam.get(k));
                    } else {
                        grades.put(k, v);
                        System.out.println("Student" + k + " get better at popQuiz");
                    }
                }
        );
        makeUpExam.forEach((k, v) -> {
            if (!grades.containsKey(k)) {
                grades.put(k, v);
            }
        });

        // printMap(grades);

        String formatS = "%-15s%15s%15s%15s\n";
        System.out.println();
        System.out.printf("%-15s%15s%15s%15s\n", "Student", "PopQuiz", "MakeUp Exam", "Grade");
        grades.forEach((k, v) ->
        {
            String popNote = "----";
            String makeNote = "----";
            if (makeUpExam.containsKey(k)) {
                makeNote = String.format("%.2f", makeUpExam.get(k));
            }
            if (popQuiz.containsKey(k)) {
                popNote = String.format("%.2f", popQuiz.get(k));
            }
            System.out.printf(formatS, k, popNote, makeNote, v);
        });
        // Due to some compilations configs, in my pc floats are printed with "00,00" format
        // but String.format() are printed as "00.00" .-.


    }

    public static void printMap(Map<String, Double> map) {
        String formatS = "%-15s%.2f\n";
        System.out.println();
        System.out.printf("%-15s%s\n", "Student", "Grade");
        map.forEach((k, v) -> System.out.printf(formatS, k, v));
    }
}
