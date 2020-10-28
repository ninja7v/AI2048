public class EvaMonotone extends Evaluateur{

	public EvaMonotone(Tile[][] ta) {
		super(ta);
	}

	public long evaluer(){
        long res1 = 0;
        long res2 = 0;
        long res3 = 0;
        long res4 = 0;
        long max1 = 0;
        long max2 = 0;
        long coeff = 3; 

        for (int r = 0; r < side; r++) 
            for (int c = 0; c < side; c++) {
                    if (r%2==0) {
                    	if(tilesSim[r][c] != null)
                        res1 = (res1 + tilesSim[r][c].getValue())* coeff;
                    	else res1 = res1*coeff;
                    }
                    else{
                    	if(tilesSim[r][side-c-1] != null)
                        res1 = (res1 + tilesSim[r][side-c-1].getValue())* coeff;
                    	else res1 = res1*coeff;
                    }
            }
        for(int c = 0;c <side; c++)
            for (int r = 0;r < side; r++){
                    if (c%2==0) {
                    	if(tilesSim[r][side-c-1] != null)
                        res2 = (res2 + tilesSim[r][side-c-1].getValue())* coeff;
                    	else res2 = res2*coeff;
                    }
                    else{
                    	if(tilesSim[side-r-1][side-c-1] != null)
                        res2 = (res2 + tilesSim[side-r-1][side-c-1].getValue())* coeff;
                    	else res2 = res2*coeff;
                    }
            }
        for (int r = 0; r < side; r++) 
            for (int c = 0; c < side; c++) {
                    if (r%2==0) {
                    	if(tilesSim[side-r-1][c] != null)
                        res3 = (res3 + tilesSim[side-r-1][c].getValue())* coeff;
                    	else res3 = res3*coeff;
                    }
                    else{
                    	if(tilesSim[side-r-1][side-c-1] != null)
                        res3 = (res3 + tilesSim[side-r-1][side-c-1].getValue())* coeff;
                    	else res3 = res3*coeff;
                    }
            }
        for(int c = 0;c <side; c++)
            for (int r = 0;r < side; r++){
                    if (c%2==0) {
                    	if(tilesSim[r][c] != null)
                        res4 = (res4 + tilesSim[r][c].getValue())* coeff;
                    	else res4 = res4*coeff;
                    }
                    else{
                    	if(tilesSim[side-r-1][c] != null)
                        res4 = (res4 + tilesSim[side-r-1][c].getValue())* coeff;
                    	else res4 = res4*coeff;
                    }
            }
        max1 = maximum(res1,res2,res3,res4);
        res1 = 0;
        res2 = 0;
        res3 = 0;
        res4 = 0;
        for (int r = 0; r < side; r++) 
            for (int c = 0; c < side; c++) {
                    if (r%2==1) {
                    	if(tilesSim[r][c] != null)
                        res1 = (res1 + tilesSim[r][c].getValue())* coeff;
                    	else res1 = res1*coeff;
                    }
                    else{
                    	if(tilesSim[r][side-c-1] != null)
                        res1 = (res1 + tilesSim[r][side-c-1].getValue())* coeff;
                    	else res1 = res1*coeff;
                    }
            }
        for(int c = 0;c <side; c++)
            for (int r = 0;r < side; r++){
                    if (c%2==1) {
                    	if(tilesSim[r][side-c-1] != null)
                        res2 = (res2 + tilesSim[r][side-c-1].getValue())* coeff;
                    	else res2 = res2*coeff;
                    }
                    else{
                    	if(tilesSim[side-r-1][side-c-1] != null)
                        res2 = (res2 + tilesSim[side-r-1][side-c-1].getValue())* coeff;
                    	else res2 = res2*coeff;
                    }
            }
        for (int r = 0; r < side; r++) 
            for (int c = 0; c < side; c++) {
                    if (r%2==1) {
                    	if(tilesSim[side-r-1][c] != null)
                        res3 = (res3 + tilesSim[side-r-1][c].getValue())* coeff;
                    	else res3 = res3*coeff;
                    }
                    else{
                    	if(tilesSim[side-r-1][side-c-1] != null)
                        res3 = (res3 + tilesSim[side-r-1][side-c-1].getValue())* coeff;
                    	else res3 = res3*coeff;
                    }
            }
        for(int c = 0;c <side; c++)
            for (int r = 0;r < side; r++){
                    if (c%2==1) {
                    	if(tilesSim[r][c] != null)
                        res4 = (res4 + tilesSim[r][c].getValue())* coeff;
                    	else res4 = res4*coeff;
                    }
                    else{
                    	if(tilesSim[side-r-1][c] != null)
                        res4 = (res4 + tilesSim[side-r-1][c].getValue())* coeff;
                    	else res4 = res4*coeff;
                    }
            }
        max2 = maximum(res1,res2,res3,res4);
        return Math.max(max1, max2);
    }
	public long maximum(long a, long b, long c, long d)
	{
	    long max1=(a>=b)?a:b;
	    long max2=(c>=d)?c:d;
	    long Max;
	    if(max1>=max2){
	        Max=max1;
	    }
	    else{
	        Max=max2;
	    }
	    return Max;
	}
}
