import java.util.ArrayList;
public class StepTracker
{
 private int stepGoal;
 private int totalSteps = 0;
 private int totalDays = 0;
 private int daysActive = 0;
 public StepTracker(int goal) {
  stepGoal = goal;
 }
 public void addDailySteps(int steps) {
  totalSteps += steps;
  if(steps >= stepGoal) {
   daysActive++;
  }
  totalDays++;
 }
 public int activeDays() {
  return daysActive;
 }
 public double averageSteps(){
  return (double)totalSteps/totalDays;
 }
} 
