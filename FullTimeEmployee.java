public class FullTimeEmployee extends Employee {
    private double bonusPercentage = 0.03;

        
    public FullTimeEmployee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        super(name, position, basicSalary, experience, educationalLevel);
    }

    public double bonus() {
        return getBasicSalary() * bonusPercentage;
    }
}


