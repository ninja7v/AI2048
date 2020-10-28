public class EvaVide extends Evaluateur{
    public EvaVide(Tile[][] ta) {
		super(ta);
	}

	public long evaluer(){
	    long vide = 0;
        for (int r = 0; r < side; r++) 
            for (int c = 0; c < side; c++) 
                if (tilesSim[r][c] == null) vide ++;
        return vide;
    }
}
