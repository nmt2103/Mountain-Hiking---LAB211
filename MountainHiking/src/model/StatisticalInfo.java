package model;

public class StatisticalInfo {

  private String mountainCode;
  private int numOfStudents;
  private double totalCost;

  public StatisticalInfo() {
  }

  public StatisticalInfo(String mountainCode, int numOfStudents, double totalCost) {
    this.mountainCode = mountainCode;
    this.numOfStudents = numOfStudents;
    this.totalCost = totalCost;
  }

  public String getMountainCode() {
    return mountainCode;
  }

  public void setMountainCode(String mountainCode) {
    this.mountainCode = mountainCode;
  }

  public int getNumOfStudents() {
    return numOfStudents;
  }

  public void setNumOfStudents(int numOfStudents) {
    this.numOfStudents = numOfStudents;
  }

  public double getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(double totalCost) {
    this.totalCost = totalCost;
  }

  @Override
  public String toString() {
    return "StatisticalInfo{" + "mountainCode=" + mountainCode + ", numOfStudents=" + numOfStudents + ", totalCost=" + totalCost + '}';
  }
}
