package models;

public class JobSeeker {

    private String keyWords;
    private String salary;
    private String salaryNecc;
    private String experience;
    private String schedule;
    private String typeOfEmployment;
    private String vacPeriod;

    public JobSeeker (String keyWords, String salary, String salaryNecc, String experience, String schedule, String typeOfEmployment, String vacPeriod) {
        this.keyWords = keyWords;
        this.salary = salary;
        this.salaryNecc = salaryNecc;
        this.experience = experience;
        this.schedule = schedule;
        this.typeOfEmployment = typeOfEmployment;
        this.vacPeriod = vacPeriod;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalaryNecc() {
        return salaryNecc;
    }

    public void setSalaryNecc(String salaryNecc) {
        this.salaryNecc = salaryNecc;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getTypeOfEmployment() {
        return typeOfEmployment;
    }

    public void setTypeOfEmployment(String typeOfEmployment) {
        this.typeOfEmployment = typeOfEmployment;
    }

    public String getVacPeriod() {
        return vacPeriod;
    }

    public void setVacPeriod(String vacPeriod) {
        this.vacPeriod = vacPeriod;
    }
}
