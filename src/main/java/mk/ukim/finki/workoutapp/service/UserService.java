package mk.ukim.finki.workoutapp.service;

import mk.ukim.finki.workoutapp.model.User;
import mk.ukim.finki.workoutapp.model.WorkoutFrequency;

import java.util.List;

public interface UserService {

    User registerUser(String username, String password, Integer height, Integer weight, WorkoutFrequency workoutFrequency);

    User authenticate(String username, String password);

    List<User> getAllUsers();

    User getUserById(Long id);

    double calculateBmi(Integer height, Integer weight);

    String getWeightCategory(double bmi);

}

