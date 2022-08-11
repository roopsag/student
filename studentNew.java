package collections;

public class studentNew 
{
	String name;
	int roolno;
	String gender;
	long phoneno;
	double cgpa;
	
	public studentNew(String name, int roolno, String gender, long phoneno, double cgpa)
	{
		super();
		this.name = name;
		this.roolno = roolno;
		this.gender = gender;
		this.phoneno = phoneno;
		this.cgpa = cgpa;
	}

	public String getName() 
	{
		return name;
	}

	public int getRoolno()
	{
		return roolno;
	}

	public String getGender()
	{
		return gender;
	}

	public long getPhoneno() 
	
	{
		return phoneno;
	}

	public double getCgpa() 
	{
		return cgpa;
	}
	@Override
	public String toString() 
	{
		return "studentNew [name=" + name + ", roolno=" + roolno + ", gender=" + gender + ", phoneno=" + phoneno
				+ ", cgpa=" + cgpa + "]";
	}
	


	

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		studentNew other = (studentNew) obj;
		if (Double.doubleToLongBits(cgpa) != Double.doubleToLongBits(other.cgpa))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneno != other.phoneno)
			return false;
		if (roolno != other.roolno)
			return false;
		return true;
	}
	

	

	
}
