
import java.lang.IndexOutOfBoundsException;
import java.lang.IllegalArgumentException;
import edu.princeton.cs.algs4.QuickFindUF;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private int N;
	private int [][] G = new int[N+1][N+1];
	private int top;
	private int bottom;
	
	public Percolation(int N) throws IllegalArgumentException {
		if(N <= 0) throw new IllegalArgumentException();
		this.N = N;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				G[i][j] = 0;
			}
		}
		this.top  = 1;
		this.bottom = 1;
	}
	
	public void open(int i, int j) throws IndexOutOfBoundsException {
		if(!(i > 0 && i < N+1) || !(j > 0 && j < N+1)) throw new IndexOutOfBoundsException();
		G[i][j] = 1;
	}
	
	public boolean isOpen(int i, int j) throws IndexOutOfBoundsException {
		if(!(i > 0 && i < N+1) || !(j > 0 && j < N+1)) throw new IndexOutOfBoundsException();
		return (G[i][j] == 1);
	}
	
	public boolean isFull(int i, int j) throws IndexOutOfBoundsException {
		if(!(i > 0 && i < N+1) || !(j > 0 && j < N+1)) throw new IndexOutOfBoundsException();
		QuickFindUF QF = new QuickFindUF(N+1);
		QF.union(0, 1);
		for(int k = 1; k <= N; k++){
			
		}
		return true;
	}
	
	public boolean percolates(){
		return true;
	}
	
	public static void main(String[] args){
		
	}
}
