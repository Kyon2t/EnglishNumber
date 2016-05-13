package junit.en;
import en.IntToEng;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class EnTest {
	@Test
	public void zero() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void twentyone() {
		IntToEng ite = new IntToEng();
		String expected = "twenty one";
		String actual = ite.translateEng(21);
		assertThat(actual, is(expected));
	}
	@Test
	public void thirty() {
		IntToEng ite = new IntToEng();
		String expected = "thirty";
		String actual = ite.translateEng(30);
		assertThat(actual, is(expected));
	}
}
