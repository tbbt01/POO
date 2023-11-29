package lab8_masina_interfete;

public class Masina implements Cloneable, Comparable {
	String marca;
	int id;
	String culoare;
	
	public Masina(String marca,int id, String culoare)
	{
		this.id=id;
		this.marca=marca;
		this.culoare=culoare;
	}
	public void Revopseste(String newColor)
	{
		this.culoare=newColor;
	}
	public Masina clone()
	{
		try {
			return (Masina) super.clone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("not clonable");
			return null;
		}
	}
	public int compareTo(Object O)
	{
		Masina temp=(Masina) O;
		return (id-temp.id);
	}
}
