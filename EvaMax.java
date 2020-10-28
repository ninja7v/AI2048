public class EvaMax extends Evaluateur{
	public EvaMax(Tile[][] ta) {
		super(ta);
	}

	public long evaluer(){
        long[] tab1 = new long[16];
        long[] tab2 = new long[16];
        int i = 0;
        int j = 0;
        int k = 0;

        for (int r = 0; r < side; r++) 
            for (int c = 0; c < side; c++) {
                tab1[r*4+c] = 0;
                tab2[r*4+c] = 0;
                if (tilesAct[r][c] != null){
                    tab1[i] = tilesAct[r][c].getValue();
                    i++;
                }
                if (tilesSim[r][c] != null){
                    tab2[j] = tilesSim[r][c].getValue();
                    j++;
                }
            }
        trier(tab1);
        //print(tab1);
        trier(tab2);
        //print(tab2);
        while(tab1[k]==tab2[k] && k<15) k++;
        return tab2[k];
    }

    void trier(long[] tab){
        long temp;
        for(int i=0;i<16;i++)
            for(int j = i;j<16;j++)
                if (tab[i]<tab[j])
                {
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
    }
}
