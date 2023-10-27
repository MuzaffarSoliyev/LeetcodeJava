package bitManipulation;

public class NumberOfStepsToReduceANumberToZero {
  public int numberOfSteps(int num) {
    int countOfSteps = 0;
    while (num > 0) {
      if ((num & 1) == 1) {
        num -= 1;
      } else {
        num /= 2;
      }
      countOfSteps++;
    }
    return countOfSteps;
  }
}
