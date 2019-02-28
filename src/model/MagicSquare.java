package model;

import customExceptions.NotPositionException;
import customExceptions.NotTypeException;
import customExceptions.parNumberException;

public class MagicSquare {
	private int n;
	private int position;
	public final static int UP = 1;
	public final static int DOWN = 2;
	public final static int RIGHT = 3;
	public final static int LEFT = 4;
	private int direction;
	public final static int NO = 1;
	public final static int NE = 2;
	public final static int SO = 3;
	public final static int SE = 4;
	private int[][] square;
	public MagicSquare(int n, int position, int direction) {
		this.position = position;
		this.direction = direction;
		this.n = n;
		this.square = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				this.square[i][j] = -1;
			}
		}
		
	}
	public int getn() {
		return n;
	}
	public int getPosition() {
		return position;
	}
	public int getDirection() {
		return direction;
	}
	public int[][] getSquare(){
		return square;
	}
	public void fillNE1() {
		int m = 1;
		int cu = 0;
		int fu = 0;
		int cs = n/2;
		int fs = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square[fs][cs] = m;
				fu = fs;
				cu = cs;
				fs = fu-1;
				cs = cu + 1;
				if(fs<0) {
					fs = n-1;
				}
				if(cs >= n) {
					fs = fu -1;
					cs = 0;
				}
				if(fs == -1 || square[fs][cs] != -1) {
					fs = fu+1;
					cs = cu;
				}
				m++;
			}
		}
	}
	public void fillNO1() {
		int m = 1;
		int cu = 0;
		int fu = 0;
		int cs = n/2;
		int fs = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square[fs][cs] = m;
				fu = fs;
				cu = cs;
				fs = fu-1;
				cs = cu - 1;
				if(fs<0) {
					fs = n-1;
				}
				if(cs < 0) {
					fs = fu -1;
					cs = n-1;
				}
				if(fs == -1 || square[fs][cs] != -1) {
					fs = fu+1;
					cs = cu;
				}
				m++;
			}
		}
	}
	public void fillSE2() {
		int start = (n)/2;
		square[n -1][start] = 1;
		int m = 1;
		int cu = 0;
		int fu = 0;
		int cs = n/2;
		int fs = n-1;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square[fs][cs] = m;
				fu = fs;
				cu = cs;
				fs = fu+1;
				cs = cu + 1;
				if(fs > (n- 1)) {
					fs = 0;
				}
				if(cs >= n) {
					fs = fu + 1;
					cs = 0;
				}
				if(fs == n || square[fs][cs] != -1) {
					fs = fu-1;
					cs = cu;
				}
				m++;
			}
		}		
	}
	public void fillSO2() {
		int start = (n)/2;
		square[n -1][start] = 1;
		int m = 1;
		int cu = 0;
		int fu = 0;
		int cs = n/2;
		int fs = n-1;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square[fs][cs] = m;
				fu = fs;
				cu = cs;
				fs = fu+1;
				cs = cu - 1;
				if(fs > (n-1)) {
					fs = 0;
				}
				if(cs < 0) {
					fs = fu + 1;
					cs = n-1;
				}
				if(fs == n ||square[fs][cs] != -1) {
					fs = fu-1;
					cs = cu;
				}
				m++;
			}
		}	
	}
	public void fillSE3() {
		int start = (n)/2;
		square[start][n-1] = 1;
		int m = 1;
		int cu = 0;
		int fu = 0;
		int cs = n - 1;
		int fs = n/2;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square[fs][cs] = m;
				fu = fs;
				cu = cs;
				fs = fu+1;
				cs = cu + 1;
				if(fs > (n- 1)) {
					fs = 0;
				}
				if(cs >= n) {
					fs = fu + 1;
					cs = 0;
				}
				if(fs == n || square[fs][cs] != -1) {
					fs = fu;
					cs = cu - 1;
				}
				m++;
			}
		}
	}
	public void fillNE3() {
		int start = (n)/2;
		square[start][n-1] = 1;
		int m = 1;
		int cu = 0;
		int fu = 0;
		int cs = n - 1;
		int fs = n/2;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square[fs][cs] = m;
				fu = fs;
				cu = cs;
				fs = fu-1;
				cs = cu + 1;
				if(fs<0) {
					fs = n-1;
				}
				if(cs >= n) {
					fs = fu -1;
					cs = 0;
				}
				if(fs == -1 || square[fs][cs] != -1) {
					fs = fu;
					cs = cu - 1;
				}
				m++;
			}
		}
	}
	public void fillNO4() {
		int start = (n)/2;
		square[start][0] = 1;
		int m = 1;
		int cu = 0;
		int fu = 0;
		int cs = 0;
		int fs = n/2;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square[fs][cs] = m;
				fu = fs;
				cu = cs;
				fs = fu-1;
				cs = cu - 1;
				if(fs<0) {
					fs = n-1;
				}
				if(cs < 0) {
					fs = fu -1;
					cs = n-1;
				}
				if(fs == -1 || square[fs][cs] != -1) {
					fs = fu;
					cs = cu + 1;
				}
				m++;
			}
		}
	}
	public void fillSO4() {
		int start = (n)/2;
		square[start][0] = 1;
		int m = 1;
		int cu = 0;
		int fu = 0;
		int cs = 0;
		int fs = n/2;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				square[fs][cs] = m;
				fu = fs;
				cu = cs;
				fs = fu+1;
				cs = cu - 1;
				if(fs > (n-1)) {
					fs = 0;
				}
				if(cs < 0) {
					fs = fu + 1;
					cs = n-1;
				}
				if(fs == n ||square[fs][cs] != -1) {
					fs = fu;
					cs = cu + 1;
				}
				m++;
			}
		}
	}
	
	public void fillMagicSquare(int n, int position, int direction) throws parNumberException, NotTypeException, NotPositionException{
		if(n%2 == 0) {
			throw new parNumberException(n);
		}else {
			int start = (n)/2;
			if(position == 1) {
				square[0][start] = 1;
				if(direction == NE) {
					fillNE1();
				}
					
				else if(direction == NO) {
					fillNO1();
				}
				else {
					throw new NotTypeException(direction);
				}
				
			}
			else if(position == 2) {
				if(direction == SE) {
					fillSE2();
					
				}
				else if(direction == SO) {
					fillSO2();
				}
				else {
					throw new NotTypeException(direction);
				}
			}
			else if(position == 3) {
				if(direction == SE) {
					fillSE3();
				}
				else if(direction == NE) {
					fillNE3();
				}
				else {
					throw new NotTypeException(direction);
				}
			}
			else if(position == 4) {
				if(direction == NO) {
					fillNO4();
				}
				else if(direction == SO) {
					fillSO4();
				}
				else {
					throw new NotTypeException(direction);
				}
			}
			else {
				throw new NotPositionException(position);
			}
		}
	}
	public String printSquare() {
		String print = "";
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				print+=square[i][j] + "\t";
			}
			print+= "\n";
		}
		return print;
	}
	public int calculateMagicConstant(int n) {
		int s = (n*(n*n+1))/2;
		return s;
	}
	public int findCenter() {
		int center = 0;
		int a = 1;
		int b = 2;
		for(int i = 1; i<n; i+=2) {
			center = (n*a) + b;
			a++;
			b++;
		}
		return center;
	}
	public int sumRow() {
		int sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				sum += square[i][j];
			}
		}
		return sum/n;
	}
	public int sumColumn() {
		int sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				sum += square[j][i];
			}
		}
		return sum/n;
	}
	public int sumDiagonal1() {
		int sumd1 = 0;
		int i = 0; 
		int j = 0;
		while (i < n && j < n) {
            sumd1 += square[i][j];
            i++;
            j++;
        }
		return sumd1;
	}
	public int sumDiagonal2() {
		int sumd2 = 0;
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            sumd2 += square[i][j];
            i++;
            j--;
        }
        return sumd2;
	}

}
