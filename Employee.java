public class Employee{
    private String name;
    private String position;
    private double basicSalary;
    private int experience;
    private String educationalLevel;

    //constructor
    public Employee(String name, String position, double basicSalary,int experience,String educationLevel )
    {
        this.name=name;
        this.position=position;
        this.basicSalary=basicSalary;
        this.experience=experience;
        this.educationalLevel=educationLevel;
    }

    //get methods
    public String getName() 
    {
        return name;
    }

    public String getPosition()
    {
        return position;
    }

    public double getBasicSalary()
    {
        return basicSalary;
    }

    public int getExperience()
    {
        return experience;
    }

    public String getEducationalLevel() 
    {
        return educationalLevel;
    }
    
    //method to calculate the salary based on 
    public double calculateSalary()
   {
     double salary = basicSalary + (basicSalary * 0.05 * experience);
        String level=educationalLevel.toLowerCase();
        if (level.contains("bachelor")) 
        {
            salary += 500;
        } 
        else if (level.contains("diploma")) {
            salary += 250;
        }

        return salary;
    }
}


