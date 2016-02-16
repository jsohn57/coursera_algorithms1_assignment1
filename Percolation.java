
import java.lang.IndexOutOfBoundsException;
import java.lang.IllegalArgumentException;
import edu.princeton.cs.algs4.QuickFindUF;

public class Percolation {
	private QuickFindUF uf;
	private int N;
	
	public Percolation(int N) throws IllegalArgumentException {
		if(N <= 0) throw new IllegalArgumentException();
		uf = new QuickFindUF(N);
		this.N = N;
	}
	
	public void open(int i, int j) throws IndexOutOfBoundsException {
		if(!(i > 0 && i < N+1) || !(j > 0 && j < N+1)) throw new IndexOutOfBoundsException();
		uf.union(i, j);
	}
	
	public boolean isOpen(int i, int j) throws IndexOutOfBoundsException {
		if(!(i > 0 && i < N+1) || !(j > 0 && j < N+1)) throw new IndexOutOfBoundsException();
		return uf.
	}
	
	public boolean isFull(int i, int j) throws IndexOutOfBoundsException {
		if(!(i > 0 && i < N+1) || !(j > 0 && j < N+1)) throw new IndexOutOfBoundsException();
		return true;
	}
	
	public boolean percolates(){
		return true;
	}
	
	public static void main(String[] args){
		
	}
}
