package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class studentDriver 
{
	public static void main(String[] args)
	{
		ArrayList<studentNew>al= new ArrayList<studentNew>();
		Scanner se=new Scanner(System.in);
		boolean flag=false;
		while(!flag)
		{
			System.out.println("=======Welcome to the student Database=======");
			System.out.println("chose the option of operation which you required");
			System.out.println("1.data entry");
			System.out.println("2.remove data");
			System.out.println("3.show the table");
			System.out.println("4.modify data");
			System.out.println("5.Exit");
			Scanner c=new Scanner(System.in);
			int choice=c.nextInt() ;
					
			switch(choice)
			{
			   case 1:
			   {
				System.out.print("enter the name of student :");
				String name=c.next();
				System.out.print("enter the rool number of student :");
				int roolno=c.nextInt();
				System.out.print("enter the gender of the student :");
				String gender=c.next();
				System.out.print("enter the phonbe number of the student :");
				long phoneno=c.nextLong();
				System.out.print("enter the CGPA of student :");
			    double cgpa=c.nextDouble();
				boolean search=true;
				for(int i=0;i<al.size();i++)
				{
					if(new studentNew(name,roolno,gender,phoneno,cgpa).equals(al.get(i)))
					{
						search =false;
						break;
					}
				}
				if(search)
				{
					al.add(new studentNew(name,roolno,gender,phoneno,cgpa));
					System.out.println("student has been  addded succesfully");
				}
				else
				{
					System.out.println("student with the same details found! so can't able to add in database");
				}
				
			   }break;
			
			case 2:
			{
				if(al.isEmpty())
				{
					System.out.println("no data found in class table");
				}
				else
				{
					for(int i=0;i<al.size();i++)
					{
						System.out.println((i+1)+al.get(i).getName());
					}
					System.out.println("select to the name to whom you need to remove from database");
					int choose=c.nextInt();
					al.remove(choose-1);
					System.out.println("the selected row is deleted");
				}
			}break;
			case 3:
			{
				if(al.isEmpty())
				{
					System.out.println("no dta is entered yet...");
				}
				else
				{
				 for(int i=0;i<al.size();i++)
				 {
					 System.out.println((i+1)+".."+al.get(i).name);
				 }
				 System.out.println("chose the student to know details     :");
				 int choose1=c.nextInt();
				 System.out.println(al.get(choose1-1));
				}
			}break;
			case 4:
			{
				if(al.isEmpty())
				{
					System.out.println("no students added yet...");
					
				}
				else
				{
					System.out.println("enter the name of the student to modify the details");
					String naam=c.next();
					boolean name_flag=false;
					int index=0;
					for(int i=0;i<al.size();i++)
					{
						if(al.get(i).getName().equals(naam))
						{
							name_flag=true;
							index=i;
						}
						
					}
					if(name_flag)
					{
						System.out.println("student deatils found");
						System.out.println("1.name :"+al.get(index).getName());
						System.out.println("2.rool number"+al.get(index).getRoolno());
						System.out.println("3.gender :"+al.get(index).getGender());
						System.out.println("4.phone number :"+al.get(index).getCgpa());
						System.out.println("5.CGPA  :"+al.get(index).getCgpa());
						System.out.println("which details yopu need to modify");
						int md=c.nextInt();
						switch(md)
						{
						case 1:
						{
							System.out.println("enter the name:");
							al.get(index).name=c.next();
							System.out.println("name has modified");
						}break;
						case 2:
						{
						 System.out.println("enter the roll number :");
						 al.get(index).roolno=c.nextInt();
						 System.out.println("roll nuber is modified as"+al.get(index).roolno);
						}break;
						case 3:
						{
							System.out.println("OOP's gender can not be modified");
							
						}break;
						case 4:
						{
							System.out.println("enter the new phone number");
							al.get(index).phoneno=c.nextLong();
							System.out.println("new number is modifiewd in the database");
						}break;
						case 5:
						{
							System.out.println("enter the modified CGPA:");
							al.get(index).cgpa=c.nextDouble();
						}break;
						default:
						{
						System.out.println("invalid choice");
						}
						}
					}
					else
					{
						System.out.println("no student found with the given name");
					}
				}
			}break;
			case 5:
			{
				flag=true;
			}break;
		default:
		{
			System.out.println("invalid choice");
		}
			
			
		}
		c.close();
		}
	}
}
			


