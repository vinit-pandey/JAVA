import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee e=new Employee();
	ArrayList<String> list=new ArrayList<>();
	{
		list.add("Jack");
		list.add("Mark");
		list.add("Rob");
	}

	@Test
	void testFindName() {
		System.out.println(list);
		assertEquals("Result","Found",e.findName(list,"Rob"));
		assertEquals("Result", "FOUND", e.findName(list, "Jack"));
		System.out.println("test");
	}

}
