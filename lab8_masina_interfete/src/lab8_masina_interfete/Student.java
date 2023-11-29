package lab8_masina_interfete;

public class Student implements Cloneable{
	String nume;
	int id;
	Masina masina;
	public Student(String name, int id, Masina masina)
	{
		this.nume=name;
		this.id=id;
		this.masina=masina;
	}
	public Student clone()
	{
		Student copieStudent;
		try {
			
			copieStudent=(Student) super.clone();
			copieStudent.masina=masina.clone();
			copieStudent.masina=new Masina(masina.marca,masina.id, masina.culoare);
			return copieStudent;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not clonable");
			return null;
		}

	}
	
}
