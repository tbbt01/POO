package lab8_masina_interfete;

import java.awt.Color;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masina dacia=new Masina("logan",3, "gri");
		Masina ford=new Masina("corsa", 2, "negru");
		Masina bmw=new Masina("3 series", 1, "perlat");
		
		Masina[] arr=new Masina[3];
		arr[0]=dacia;
		arr[1]=ford;
		arr[2]=bmw;
		Student s= new Student("Marcel", 1 , dacia);
		Student s1;
		s1=s.clone();
		System.out.println("s=" + s.id + " "+ s.nume + " "+ s.masina.marca + " "+s.masina.culoare);
		System.out.println("s1=" + s1.id + " "+ s1.nume + " "+ s1.masina.marca + " "+s1.masina.culoare);
		
		s1.masina.Revopseste("verde");
		System.out.println("s1=" + s1.id + " "+ s1.nume + " "+ s1.masina.marca + " "+s1.masina.culoare);
		System.out.println("s=" + s.id + " "+ s.nume + " "+ s.masina.marca + " "+s.masina.culoare);
		Student s2=new Student("gica", 2, ford);
		System.out.println();
		System.out.println("s2=" + s2.id + " "+ s2.nume + " "+ s2.masina.marca + " "+s2.masina.culoare);
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<3;i++)
		{
			System.out.println( arr[i].id + " "+ arr[i].marca + " "+ arr[i].culoare );
		}
	}

}
