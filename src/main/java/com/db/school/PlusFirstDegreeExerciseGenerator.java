package com.db.school;

import java.util.Random;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class PlusFirstDegreeExerciseGenerator implements ExerciseGenerator {
    private Random random = new Random();
    @Override
    public Exercise generate() {
        Exercise exercise = new Exercise(random.nextInt(10), random.nextInt(10));
        exercise.setOperation(Operation.PLUS);
        exercise.setAnswer(exercise.getA()+exercise.getB());
        return exercise;
    }
}
