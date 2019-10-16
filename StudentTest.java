import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private static final int INITIAL_RATING = 5;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStudent() {
		try {
			Student s = new Student();

			Integer rating = s.getRating();
			Integer expected = INITIAL_RATING;

			assertEquals(expected, rating);
		} catch (NameException e) {
			fail();
		}
	}

	@Test
	public void testCompareTo() throws NameException {
		Student firstStudent = new Student("x", "Y", 2);
		Student secondStudent = new Student("x", "Y", 3);
		
		
		
		int actual = secondStudent.compareTo(firstStudent);
		boolean result = false;
		if (actual > 0) 
		{
			result = true;
			assertTrue(result);
		}
		
		
		Student student = new Student("x", "Y", 5);
		result = false;
		if (actual < 0) 
		{
			result = true;
			assertTrue(result);
		}
		
		
		result = false;
		
		Student studentSame = new Student("x", "Y", 3);
		actual = secondStudent.compareTo(studentSame);
		int expected = 0;
		assertEquals(expected, actual);

	}
	/*
	Student student = new Student("A", "A", 5);
	Student empty = new Student("Z", "", 3);
	Student secondEmpty = new Student("X", "", 3);
	
	CompareLastFirstName clfn = new CompareLastFirstName();
	
	clfn.compare(firstStudent, secondStudent);
	*/
	@Test
	public void testGet() throws NameException {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
	}

}
