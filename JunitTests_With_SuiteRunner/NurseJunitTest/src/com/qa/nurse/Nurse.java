package com.qa.nurse;

public class Nurse {
	private int numOfPatients;
	   private float salary;

	   // Helping function
	   // private void trace(char* s) { cout << s << endl; }
	   
	   public Nurse() {
		   
	   }

	   // Implementor function
	   public Nurse(int a, float s) { 
		   numOfPatients =a; salary=s; 
		   }

	   // Access function
	   public int getNumOfPatients() { return numOfPatients; }
	   public float getSalary() {  return salary; }
	   @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numOfPatients;
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nurse other = (Nurse) obj;
		if (numOfPatients != other.numOfPatients)
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}

	public void  setNumOfPatients(int a) {   numOfPatients=a; }
	
	
	
	   public void  setSalary(float s) {   salary=s; }
	   
	   
	   
	   public boolean isBusy() {
	         // trace("predicate");
	         return numOfPatients > 30;
	   }
	   
	   

	   // Implentor function
	   public void retire() {
	      // trace("implementor");
	      numOfPatients=0;
	      salary=0;
	   }
	   public void payRaise(float raise) {
	      // trace("implementor");
	      salary += raise;
	   }

	   public static void main(String atgv[])
	   {
	      Nurse mary= new Nurse(25, 80000);
	      if (mary.isBusy())
	         System.out.println("Mary is busy");
	      else
	         System.out.println("Mary is not busy");
	      mary.payRaise(3000);
	      System.out.println("Mary's salary is " + mary.getSalary());
	      mary.retire();
	      System.out.println("Mary has " 
	             + mary.getNumOfPatients() 
	             + " of patients after she retired.");
	   }

}
