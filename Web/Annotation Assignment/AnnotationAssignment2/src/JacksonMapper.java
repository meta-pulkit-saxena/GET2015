
/**
 * @class JacksonMapper
 * @author Pulkit
 * @since 16 October,2015
 * Maps The value to the Jackson Mapper
 **/

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonMapper
{
	public static void main(String args[])
	{
		toJSON(); 
		toJava(); 
	}
	
	/**
	 * This function converts the Json to java object.
	 **/
	
	public static void toJava()
	{
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			File json = new File("employee.json");
			Employee employee1 = mapper.readValue(json, Employee.class);
			System.out.println("Java object created from JSON String :");
			System.out.println(employee1.getEmployeeName());
			System.out.println(employee1.getEmployee_id());
			System.out.println(employee1.getDate_Of_Birth());

		} 
		catch (JsonGenerationException ex) 
		{
			ex.printStackTrace();
		} 
		catch (JsonMappingException ex) 
		{
			ex.printStackTrace();
		} 
		catch (IOException ex)
		{
			ex.printStackTrace();

		}
	}

	/**
	 * This  function converts Java Object into JSON String with help of Jackson API
	 **/
	
	public static void toJSON() 
	{
		Employee employee = new Employee("Anurag", 22, "anurag.anand20@gmail.com","3-08-2015");
		// our bridge from Java to JSON and vice versa
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			// Calling employee json file
			File json = new File("employee.json");
			mapper.writeValue(json, employee);
			System.out.println("Java object converted to JSON String, written to file");
			System.out.println(mapper.writeValueAsString(employee));
		} 
		catch (JsonGenerationException ex) 
		{
			ex.printStackTrace();
		}
		catch (JsonMappingException ex)
		{
			ex.printStackTrace();
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
	
	/**
	 * Parse the Class and provide information
	 * @param{Class<?>} tempClass
	 * @throws Exception
	 */
	
	public void parse(Class<?> tempClass) throws Exception
	{
		// object pf methods to call methods
		Method[] methods = tempClass.getMethods();
		for (Method method : methods) 
		{
			if (method.isAnnotationPresent(EmployeeDetails.class)) 
			{
				EmployeeDetails test = method.getAnnotation(EmployeeDetails.class);
				System.out.println("info is awesome!");
				// try to invoke the method with param
				method.invoke(Employee.class.newInstance());
			}
		}
	}
}
