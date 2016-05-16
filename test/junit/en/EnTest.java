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
	public void one() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
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
	public void threehundred() {
		IntToEng ite = new IntToEng();
		String expected = "three hundred";
		String actual = ite.translateEng(300);
		assertThat(actual, is(expected));
	}
	@Test
	public void fivehundredninetythree() {
		IntToEng ite = new IntToEng();
		String expected = "five hundred ninety three";
		String actual = ite.translateEng(593);
		assertThat(actual, is(expected));
	}
	@Test
	public void thousand() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand";
		String actual = ite.translateEng(1000);
		assertThat(actual, is(expected));
	}
	@Test
	public void twothousandthreehundredforty() {
		IntToEng ite = new IntToEng();
		String expected = "two thousand three hundred forty";
		String actual = ite.translateEng(2340);
		assertThat(actual, is(expected));
	}
	@Test
	public void fivehundredforty() {
		IntToEng ite = new IntToEng();
		String expected = "five hundred forty";
		String actual = ite.translateEng(540);
		assertThat(actual, is(expected));
	}
}
