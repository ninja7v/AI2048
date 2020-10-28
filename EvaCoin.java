public class EvaCoin extends Evaluateur{
    public EvaCoin(Tile[][] ta) {
		super(ta);
	}

	public long evaluerCoin(){
        for (int r = 0; r < side; r++) 
            for (int c = 0; c < side; c++) {
                if (tilesAct[r][c] != tilesSim[r][c])
                    return 1;
            }
        return 0;
		}
}
