package model;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import customExceptions.NotPositionException;
import customExceptions.NotTypeException;
import customExceptions.parNumberException;

class MagicSquareTest {
	private void setupScenary1() {
		
	}
	private int square[][];
	private MagicSquare ms1;
	private void setupScenary2() {
		ms1 = new MagicSquare(5,1,1);
	}
	private MagicSquare ms2;
	private void setupScenary3() {
		ms2 = new MagicSquare(5,1,2);
	}
	private MagicSquare ms3;
	private void setupScenary4() {
		ms3 = new MagicSquare(5,2,3);
	}
	private MagicSquare ms4;
	private void setupScenary5() {
		ms4 = new MagicSquare(5,2,4);
	}
	private MagicSquare ms5;
	private void setupScenary6() {
		ms5 = new MagicSquare(5,4,1);
	}
	private MagicSquare ms6;
	private void setupScenary7() {
		ms6 = new MagicSquare(5,4,3);
	}
	private MagicSquare ms7;
	private void setupScenary8() {
		ms7 = new MagicSquare(5,3,2);
	} 
	private MagicSquare ms8;
	private void setupScenary9() {
		ms8 = new MagicSquare(5,3,4);
	} 
	private MagicSquare ms9;
	private void setupScenary10() {
		ms9 = new MagicSquare(4,1,1);
	}
	private MagicSquare ms10;
	private void setupScenary11() {
		ms10 = new MagicSquare(4,1,2);
	}
	private MagicSquare ms11;
	private void setupScenary12() {
		ms11 = new MagicSquare(4,2,3);
	}
	private MagicSquare ms12;
	private void setupScenary13() {
		ms12 = new MagicSquare(4,2,4);
	}
	private MagicSquare ms13;
	private void setupScenary14() {
		ms13 = new MagicSquare(4,3,2);
	}
	private MagicSquare ms14;
	private void setupScenary15() {
		ms14 = new MagicSquare(4,3,4);
	}
	private MagicSquare ms15;
	private void setupScenary16() {
		ms15 = new MagicSquare(4,4,1);
	}
	private MagicSquare ms16;
	private void setupScenary17() {
		ms16 = new MagicSquare(4,4,3);
	}
	private MagicSquare ms17;
	private void setupScenary18() {
		ms17 = new MagicSquare(5,1,3);
	}
	private MagicSquare ms18;
	private void setupScenary19() {
		ms18 = new MagicSquare(5,1,4);
	}
	private MagicSquare ms19;
	private void setupScenary20() {
		ms19 = new MagicSquare(5,2,2);
	}
	private MagicSquare ms20;
	private void setupScenary21() {
		ms20 = new MagicSquare(5,2,1);
	}
	private MagicSquare ms21;
	private void setupScenary22() {
		ms21 = new MagicSquare(5,3,1);
	}
	private MagicSquare ms22;
	private void setupScenary23() {
		ms22 = new MagicSquare(5,3,3);
	}
	private MagicSquare ms23;
	private void setupScenary24() {
		ms23 = new MagicSquare(5,4,2);
	}
	private MagicSquare ms24;
	private void setupScenary25() {
		ms24 = new MagicSquare(5,4,4);
	}
	private MagicSquare ms25;
	private void setupScenary26() {
		ms25 = new MagicSquare(5,5,1);
	}
	private MagicSquare ms26;
	private void setupScenary27() {
		ms26 = new MagicSquare(5,5,2);
	}
	private MagicSquare ms27;
	private void setupScenary28() {
		ms27 = new MagicSquare(5,5,3);
	}
	private MagicSquare ms28;
	private void setupScenary29() {
		ms28 = new MagicSquare(5,5,4);
	}

	@Test
	void testMagicSquare() {
		setupScenary1();
		int n = 3;
		int position = 1;
		int direction = 1;
		MagicSquare newMagicSquare = new MagicSquare(3,1,1);
		assertNotNull("The new magic square is null", newMagicSquare);
		assertTrue("The MagicSquare size have the wrong value", (n == newMagicSquare.getn()));
		assertTrue("The MAgicSquare position have the wrong value", (position == newMagicSquare.getPosition()));
		assertTrue("The MagicSquare direction have the wrong value", (direction == newMagicSquare.getDirection()));
		assertTrue("The size of the MagicSquare can't be a par number", (n%2 != 0));
	}
	@Test
	void testFillMagicSquare1() {
		setupScenary2();
		assertTrue("This direction is not possible for the position UP", (ms1.getDirection() == 1 || ms1.getDirection() == 2));
		setupScenary3();
		assertTrue("This direction is not possible for the position UP", (ms2.getDirection() == 1 || ms2.getDirection() == 2));
	}
	@Test
	void testFillMagicSquare2() {
		setupScenary4();
		assertTrue("This direction is not possible for the position UP", (ms3.getDirection() == 3 || ms3.getDirection() == 4));
		setupScenary5();
		assertTrue("This direction is not possible for the position UP", (ms4.getDirection() == 3 || ms4.getDirection() == 4));	
	}
	@Test 
	void testFillMagicSquare4() {
		setupScenary6();
		assertTrue("This direction is not possible for the position UP", (ms5.getDirection() == 1 || ms5.getDirection() == 3));	
		setupScenary7();
		assertTrue("This direction is not possible for the position UP", (ms6.getDirection() == 1 || ms6.getDirection() == 3));	
	}
	@Test
	void testFillMagicSquare3() {
		setupScenary8();
		assertTrue("This direction is not possible for the position UP", (ms7.getDirection() == 2 || ms7.getDirection() == 4));
		setupScenary9();
		assertTrue("This direction is not possible for the position UP", (ms8.getDirection() == 2 || ms8.getDirection() == 4));
	}
	@Test
	void printSquare1() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary2();
		int n = ms1.getn();
		int p = ms1.getPosition();
		int d = ms1.getDirection();
		ms1.fillMagicSquare(n, p, d);
		square = new int[n][n];
		assertTrue("It is not filling well", (ms1.getSquare()[0][n/2] == 1) && (ms1.getSquare()[n/2][n/2] == ms1.findCenter()));
		setupScenary3();
		int n2 = ms2.getn();
		int p2 = ms2.getPosition();
		int d2 = ms2.getDirection();
		ms2.fillMagicSquare(n2, p2, d2);
		square = new int[n2][n2];
		assertTrue("It is not filling well", (ms2.getSquare()[0][n2/2] == 1) && (ms2.getSquare()[n/2][n/2] == ms2.findCenter()));
	}
	@Test
	void printSquare2() throws parNumberException, NotTypeException, NotPositionException{
		setupScenary4();
		int n = ms3.getn();
		int p = ms3.getPosition();
		int d = ms3.getDirection();
		ms3.fillMagicSquare(n, p, d);
		square = new int[n][n];
		assertTrue("It is not filling well", (ms3.getSquare()[n - 1][n/2] == 1) && (ms3.getSquare()[n/2][n/2] == ms3.findCenter()));
		setupScenary5();
		int n2 = ms4.getn();
		int p2 = ms4.getPosition();
		int d2 = ms4.getDirection();
		ms4.fillMagicSquare(n2, p2, d2);
		square = new int[n2][n2];
		assertTrue("It is not filling well", (ms4.getSquare()[n2 - 1][n2/2] == 1) && (ms4.getSquare()[n/2][n/2] == ms4.findCenter()));
	}
	@Test
	void printSquare3() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary8();
		int n = ms7.getn();
		int p = ms7.getPosition();
		int d = ms7.getDirection();
		ms7.fillMagicSquare(n, p, d);
		square = new int[n][n];
		assertTrue("It is not filling well", (ms7.getSquare()[n/2][n-1] == 1) && (ms7.getSquare()[n/2][n/2] == ms7.findCenter()));
		setupScenary9();
		int n2 = ms8.getn();
		int p2 = ms8.getPosition();
		int d2 = ms8.getDirection();
		ms8.fillMagicSquare(n2, p2, d2);
		square = new int[n2][n2];
		assertTrue("It is not filling well", (ms8.getSquare()[n2/2][n2-1] == 1) && (ms8.getSquare()[n/2][n/2] == ms8.findCenter()));
	}
	@Test
	void printSquare4() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary6();
		int n = ms5.getn();
		int p = ms5.getPosition();
		int d = ms5.getDirection();
		ms5.fillMagicSquare(n, p, d);
		square = new int[n][n];
		assertTrue("It is not filling well", (ms5.getSquare()[n/2][0] == 1) && (ms5.getSquare()[n/2][n/2] == ms5.findCenter()));
		setupScenary7();
		int n2 = ms6.getn();
		int p2 = ms6.getPosition();
		int d2 = ms6.getDirection();
		ms6.fillMagicSquare(n2, p2, d2);
		square = new int[n2][n2];
		assertTrue("It is not filling well", (ms6.getSquare()[n2/2][0] == 1) && (ms6.getSquare()[n/2][n/2] == ms6.findCenter()));
		
	}
	@Test
	void sums1() throws parNumberException, NotTypeException, NotPositionException{
		setupScenary2();
		int n = ms1.getn();
		int p = ms1.getPosition();
		int d = ms1.getDirection();
		ms1.fillMagicSquare(n, p, d);
		square = new int[n][n];
		assertTrue("The sum of the rows it's incorrect", (ms1.sumRow() == ms1.calculateMagicConstant(n)));
		setupScenary3();
		int n2 = ms2.getn();
		int p2 = ms2.getPosition();
		int d2 = ms2.getDirection();
		ms2.fillMagicSquare(n2, p2, d2);
		square = new int[n2][n2];
		assertTrue("The sum of the rows it's incorrect", (ms2.sumRow() == ms2.calculateMagicConstant(n2)));
	}
	@Test
	void sums2() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary4();
		int n = ms3.getn();
		int p = ms3.getPosition();
		int d = ms3.getDirection();
		ms3.fillMagicSquare(n, p, d);
		square = new int[n][n];
		assertTrue("The sum of the rows it's incorrect", (ms3.sumRow() == ms3.calculateMagicConstant(n)));
		setupScenary5();
		int n2 = ms4.getn();
		int p2 = ms4.getPosition();
		int d2 = ms4.getDirection();
		ms4.fillMagicSquare(n2, p2, d2);
		square = new int[n2][n2];
		assertTrue("The sum of the rows it's incorrect", (ms4.sumRow() == ms4.calculateMagicConstant(n2)));
	}
	@Test
	void sums3() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary8();
		int n = ms7.getn();
		int p = ms7.getPosition();
		int d = ms7.getDirection();
		ms7.fillMagicSquare(n, p, d);
		square = new int[n][n];
		assertTrue("The sum of the rows it's incorrect", (ms7.sumRow() == ms7.calculateMagicConstant(n)));
		setupScenary9();
		int n2 = ms8.getn();
		int p2 = ms8.getPosition();
		int d2 = ms8.getDirection();
		ms8.fillMagicSquare(n2, p2, d2);
		square = new int[n2][n2];
		assertTrue("The sum of the rows it's incorrect", (ms8.sumRow() == ms8.calculateMagicConstant(n2)));
	}
	@Test
	void sums4() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary6();
		int n = ms5.getn();
		int p = ms5.getPosition();
		int d = ms5.getDirection();
		ms5.fillMagicSquare(n, p, d);
		square = new int[n][n];
		assertTrue("The sum of the rows it's incorrect", (ms5.sumRow() == ms5.calculateMagicConstant(n)));
		setupScenary7();
		int n2 = ms6.getn();
		int p2 = ms6.getPosition();
		int d2 = ms6.getDirection();
		ms6.fillMagicSquare(n2, p2, d2);
		square = new int[n2][n2];
		assertTrue("The sum of the rows it's incorrect", (ms6.sumRow() == ms6.calculateMagicConstant(n2)));
	}
	@Test 
	void testparNumberException1() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary10();
		try {
			ms9.fillMagicSquare(ms9.getn(), ms9.getPosition(), ms9.getDirection());
			fail();
		}
		catch(parNumberException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary11();
		try {
			ms10.fillMagicSquare(ms10.getn(), ms10.getPosition(), ms10.getDirection());
			fail();
		}
		catch(parNumberException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		
	}
	@Test
	void testparNumberException2() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary12();
		try {
			ms11.fillMagicSquare(ms11.getn(), ms11.getPosition(), ms11.getDirection());
			fail();
		}
		catch(parNumberException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary13();
		try {
			ms12.fillMagicSquare(ms12.getn(), ms12.getPosition(), ms12.getDirection());
			fail();
		}
		catch(parNumberException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		
	}
	@Test
	void testparNumberException3() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary14();
		try {
			ms13.fillMagicSquare(ms13.getn(), ms13.getPosition(), ms13.getDirection());
			fail();
		}
		catch(parNumberException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary15();
		try {
			ms14.fillMagicSquare(ms14.getn(), ms14.getPosition(), ms14.getDirection());
			fail();
		}
		catch(parNumberException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		
	}
	@Test
	void testparNumberException4() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary16();
		try {
			ms15.fillMagicSquare(ms15.getn(), ms15.getPosition(), ms15.getDirection());
			fail();
		}
		catch(parNumberException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary17();
		try {
			ms16.fillMagicSquare(ms16.getn(), ms16.getPosition(), ms16.getDirection());
			fail();
		}
		catch(parNumberException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		
	}
	@Test
	void testNotTypeException1() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary18();
		try {
			ms17.fillMagicSquare(ms17.getn(), ms17.getPosition(), ms17.getDirection());
			fail();
		}
		catch(NotTypeException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary19();
		try {
			ms18.fillMagicSquare(ms18.getn(), ms18.getPosition(), ms18.getDirection());
			fail();
		}
		catch(NotTypeException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		
	}
	@Test
	void testNotTypeException2() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary20();
		try {
			ms19.fillMagicSquare(ms19.getn(), ms19.getPosition(), ms19.getDirection());
			fail();
		}
		catch(NotTypeException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary21();
		try {
			ms20.fillMagicSquare(ms20.getn(), ms20.getPosition(), ms20.getDirection());
			fail();
		}
		catch(NotTypeException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		
	}
	@Test
	void testNotTypeException3() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary22();
		try {
			ms21.fillMagicSquare(ms21.getn(), ms21.getPosition(), ms21.getDirection());
			fail();
		}
		catch(NotTypeException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary23();
		try {
			ms22.fillMagicSquare(ms22.getn(), ms22.getPosition(), ms22.getDirection());
			fail();
		}
		catch(NotTypeException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		
	}
	@Test
	void testNotTypeException4() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary24();
		try {
			ms23.fillMagicSquare(ms23.getn(), ms23.getPosition(), ms23.getDirection());
			fail();
		}
		catch(NotTypeException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary25();
		try {
			ms24.fillMagicSquare(ms24.getn(), ms24.getPosition(), ms24.getDirection());
			fail();
		}
		catch(NotTypeException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		
	}
	@Test
	void testNotPositionException() throws parNumberException, NotTypeException, NotPositionException {
		setupScenary26();
		try {
			ms25.fillMagicSquare(ms25.getn(), ms25.getPosition(), ms25.getDirection());
			fail();
		}
		catch(NotPositionException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary27();
		try {
			ms26.fillMagicSquare(ms26.getn(), ms26.getPosition(), ms26.getDirection());
			fail();
		}
		catch(NotPositionException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary28();
		try {
			ms27.fillMagicSquare(ms27.getn(), ms27.getPosition(), ms27.getDirection());
			fail();
		}
		catch(NotPositionException e) {
			
		}
		catch(Exception e) {
			fail();
		}
		setupScenary29();
		try {
			ms28.fillMagicSquare(ms28.getn(), ms28.getPosition(), ms28.getDirection());
			fail();
		}
		catch(NotPositionException e) {
			
		}
		catch(Exception e) {
			fail();
		}
	}

}