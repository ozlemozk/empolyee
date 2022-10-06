package patika_dev;

public class Employee {
	
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, int salary, int workHpurs,int hireYear)
	{
		this.hireYear=hireYear;
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;	
	}
	   
	public int tax() 
	{
		if(salary<1000) {
			System.out.println("Maaş 1000 TL'den az veri yoktur.");
			return salary;
		}
		else
		{
			System.out.println("Maaş 1000 TL'den çok verigi vardır.");
			return salary*(3/100);
		}
	} 
	
	
	public int bonus() {
		if(workHours>40)
		{
			int bonus=workHours-40;
			System.out.println("Fazla"+bonus+bonus*30);
            return bonus * 30;
		}
		return salary;
		
	}
	public int raiseSalary()
	{
		int raise=2021 - hireYear;
		if(raise<10) 
		{
			System.out.println("Maaş %5 zam yapılmıştır ");
			return salary*(5/100);
		}
		else if(raise>9 && raise<20)
		{
			System.out.println("Maaş %10 zam yapılmıştır ");
			return salary*(10/100);
		}
		else if(raise>19)
		{
			System.out.println("Maaş %15 zam yapılmıştır ");
			return salary*(15/100);
		}
		return salary;	
		
	}
	
	
	 public void toString(Employee employee) {
         System.out.println("Name : " + this.name);
         System.out.println("Previous Salary : " + this.salary);
         int tax = employee.tax();
         int bonus = employee.bonus();
         int raiseSalary = employee.raiseSalary();

         System.out.println("New Salary : " + (this.salary - tax + bonus + raiseSalary));

	
	 }
	
    
	
}
