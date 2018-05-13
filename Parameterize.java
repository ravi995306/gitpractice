import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Step1
@RunWith(Parameterized.class)
public class Parameterize {
	
	//step2
	String firstname;
	int age;
	String username;
	String password;
	
	
	//step3
	public Parameterize(String firstname,int age,String username, String password) {
		this.firstname=firstname;
		this.age=age;
		this.username=username;
		this.password=password;
		
	}
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data= new Object[2][4];
		
		//first row
		data[0][0]="joy";
		data[0][1]=30;
		data[0][2]="abcd";
		data[0][3]="test";
		
		data[1][0]="tom";
		data[1][1]=35;
		data[1][2]="zxxd";
		data[1][3]="ttesssd";
		
		return Arrays.asList(data);
		
	}
	@Test
	public void Register() {
		System.out.println(firstname+""+age+""+username+""+password);
		
		
	}
	

}
