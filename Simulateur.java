

public class Simulateur {
	public Tile[][] tilesAct;
	public Tile[][] tilesSim;
	
	public void simulerUp(Jeu2048 j) {
		Jeu2048 jeu = new Jeu2048();
		jeu.checkingAvailableMoves = false;
		jeu.tiles = new Tile[j.side][j.side];
		for(int i=0;i<j.side;i++)
			for(int t=0;t<j.side;t++)
			{	if(j.tiles[i][t] != null)
			{
				jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
				jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
			}
			}
		jeu.moveUp();
		tilesSim = jeu.tiles.clone();
	}
	
	public void simulerDown(Jeu2048 j) {
		Jeu2048 jeu = new Jeu2048();
		jeu.checkingAvailableMoves = false;
		jeu.tiles = new Tile[j.side][j.side];
		for(int i=0;i<j.side;i++)
			for(int t=0;t<j.side;t++)
			{	if(j.tiles[i][t] != null)
			{
				jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
				jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
			}
			}
		jeu.moveDown();
		tilesSim = jeu.tiles.clone();
	}
	
	public void simulerLeft(Jeu2048 j) {
		Jeu2048 jeu = new Jeu2048();
		jeu.checkingAvailableMoves = false;
		jeu.tiles = new Tile[j.side][j.side];
		for(int i=0;i<j.side;i++)
			for(int t=0;t<j.side;t++)
			{	if(j.tiles[i][t] != null)
			{
				jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
				jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
			}
			}
		jeu.moveLeft();
		tilesSim = jeu.tiles.clone();
	}
	
	public void simulerRight(Jeu2048 j) {
		Jeu2048 jeu = new Jeu2048();
		jeu.checkingAvailableMoves = false;
		jeu.tiles = new Tile[j.side][j.side];
		for(int i=0;i<j.side;i++)
			for(int t=0;t<j.side;t++)
			{	if(j.tiles[i][t] != null)
			{
				jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
				jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
			}
			}
		jeu.moveRight();
		tilesSim = jeu.tiles.clone();
	}
	
	public boolean meilleurCoup1(Evaluateur e, Jeu2048 j)
	{
		int mc = 0;
		long temp = -1;
		long r[] = new long[4];
		j.checkingAvailableMoves = true;
		if(j.moveUp()) {
		simulerUp(j);
		e.tilesSim = tilesSim.clone();
		r[0] = e.evaluer();
		}
		else r[0] = -1;
		if(j.moveRight()) {
		simulerRight(j);
		e.tilesSim = tilesSim.clone();
		r[1] = e.evaluer();
		}
		else r[1] = -1;
		if(j.moveDown()) {
		simulerDown(j);
		e.tilesSim = tilesSim.clone();
		r[2] = e.evaluer();
		}
		else r[2] = -1;
		if(j.moveLeft()) {
		simulerLeft(j);
		e.tilesSim = tilesSim.clone();
		r[3] = e.evaluer();
		}
		else r[3] = -1;
		for (int c = 0; c < 4; c++) {
			if(r[c] > temp) {
				temp = r[c];
				mc = c;
		}
		}
		j.checkingAvailableMoves = false;
		if(mc == 0)
			return j.moveUp();
		else if(mc == 1)
			return j.moveRight();
		else if(mc == 2)
			return j.moveDown();
		return j.moveLeft();
	}
public void simulerUpUp(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveUp();
	jeu.moveUp();
	tilesSim = jeu.tiles.clone();
}

public void simulerUpDown(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveUp();
	jeu.moveDown();
	tilesSim = jeu.tiles.clone();
}

public void simulerUpLeft(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveUp();
	jeu.moveLeft();
	tilesSim = jeu.tiles.clone();
}

public void simulerUpRight(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveUp();
	jeu.moveRight();
	tilesSim = jeu.tiles.clone();
}
public void simulerDownUp(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveDown();
	jeu.moveUp();
	tilesSim = jeu.tiles.clone();
}

public void simulerDownDown(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveDown();
	jeu.moveDown();
	tilesSim = jeu.tiles.clone();
}

public void simulerDownLeft(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveDown();
	jeu.moveLeft();
	tilesSim = jeu.tiles.clone();
}

public void simulerDownRight(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveDown();
	jeu.moveRight();
	tilesSim = jeu.tiles.clone();
}
public void simulerLeftUp(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveLeft();
	jeu.moveUp();
	tilesSim = jeu.tiles.clone();
}

public void simulerLeftDown(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveLeft();
	jeu.moveDown();
	tilesSim = jeu.tiles.clone();
}

public void simulerLeftLeft(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveLeft();
	jeu.moveLeft();
	tilesSim = jeu.tiles.clone();
}

public void simulerLeftRight(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveLeft();
	jeu.moveRight();
	tilesSim = jeu.tiles.clone();
}

public void simulerRightUp(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveRight();
	jeu.moveUp();
	tilesSim = jeu.tiles.clone();
}

public void simulerRightDown(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveRight();
	jeu.moveDown();
	tilesSim = jeu.tiles.clone();
}

public void simulerRightLeft(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveUp();
	jeu.moveLeft();
	tilesSim = jeu.tiles.clone();
}

public void simulerRightRight(Jeu2048 j) {
	Jeu2048 jeu = new Jeu2048();
	jeu.checkingAvailableMoves = false;
	jeu.tiles = new Tile[j.side][j.side];
	for(int i=0;i<j.side;i++)
		for(int t=0;t<j.side;t++)
		{	if(j.tiles[i][t] != null)
		{
			jeu.tiles[i][t]= new Tile(j.tiles[i][t].getValue());
			jeu.tiles[i][t].setMerged(j.tiles[i][t].merged);
		}
		}
	jeu.moveUp();
	jeu.moveRight();
	tilesSim = jeu.tiles.clone();
}

public boolean meilleurCoup2(Evaluateur e, Jeu2048 j)
{
	int mc = 0;
	long temp = -1;
	long r[] = new long[4];
	j.checkingAvailableMoves = true;
	if(j.moveUp()) {
	simulerUpUp(j);
	e.tilesSim = tilesSim.clone();
	long r1 = e.evaluer();
	simulerUpRight(j);
	e.tilesSim = tilesSim.clone();
	long r2 = e.evaluer();
	simulerUpDown(j);
	e.tilesSim = tilesSim.clone();
	long r3 = e.evaluer();
	simulerUpLeft(j);
	e.tilesSim = tilesSim.clone();
	long r4 = e.evaluer();
	r[0] = maximum(r1,r2,r3,r4);
	}
	else r[0] = -1;
	if(j.moveRight()) {
		simulerRightUp(j);
		e.tilesSim = tilesSim.clone();
		long r1 = e.evaluer();
		simulerRightRight(j);
		e.tilesSim = tilesSim.clone();
		long r2 = e.evaluer();
		simulerRightDown(j);
		e.tilesSim = tilesSim.clone();
		long r3 = e.evaluer();
		simulerRightLeft(j);
		e.tilesSim = tilesSim.clone();
		long r4 = e.evaluer();
		r[1] = maximum(r1,r2,r3,r4);
	}
	else r[1] = -1;
	if(j.moveDown()) {
		simulerDownUp(j);
		e.tilesSim = tilesSim.clone();
		long r1 = e.evaluer();
		simulerDownRight(j);
		e.tilesSim = tilesSim.clone();
		long r2 = e.evaluer();
		simulerDownDown(j);
		e.tilesSim = tilesSim.clone();
		long r3 = e.evaluer();
		simulerDownLeft(j);
		e.tilesSim = tilesSim.clone();
		long r4 = e.evaluer();
		r[2] = maximum(r1,r2,r3,r4);
	}
	else r[2] = -1;
	if(j.moveLeft()) {
		simulerLeftUp(j);
		e.tilesSim = tilesSim.clone();
		long r1 = e.evaluer();
		simulerLeftRight(j);
		e.tilesSim = tilesSim.clone();
		long r2 = e.evaluer();
		simulerLeftDown(j);
		e.tilesSim = tilesSim.clone();
		long r3 = e.evaluer();
		simulerLeftLeft(j);
		e.tilesSim = tilesSim.clone();
		long r4 = e.evaluer();
		r[3] = maximum(r1,r2,r3,r4);
	}
	else r[3] = -1;
	for (int c = 0; c < 4; c++) {
		if(r[c] > temp) {
			temp = r[c];
			mc = c;
	}
	}
	j.checkingAvailableMoves = false;
	if(mc == 0)
		return j.moveUp();
	else if(mc == 1)
		return j.moveRight();
	else if(mc == 2)
		return j.moveDown();
	return j.moveLeft();
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

public boolean meilleurCoup3(Evaluateur e, Jeu2048 j)
{
	int mc = 0;
	double temp = -1;
	double r[] = new double[4];
	r[0]=0;
	r[1]=0;
	r[2]=0;
	r[3]=0;
	j.checkingAvailableMoves = true;
	for (int i=0;i<4;i++) {
	if(j.moveUp()) {
	simulerUpUp(j);
	e.tilesSim = tilesSim.clone();
	long r1 = e.evaluer();
	simulerUpRight(j);
	e.tilesSim = tilesSim.clone();
	long r2 = e.evaluer();
	simulerUpDown(j);
	e.tilesSim = tilesSim.clone();
	long r3 = e.evaluer();
	simulerUpLeft(j);
	e.tilesSim = tilesSim.clone();
	long r4 = e.evaluer();
	r[0] = maximum(r1,r2,r3,r4)/100+r[0];
	}
	else r[0] = -1;
	if(j.moveRight()) {
		simulerRightUp(j);
		e.tilesSim = tilesSim.clone();
		long r1 = e.evaluer();
		simulerRightRight(j);
		e.tilesSim = tilesSim.clone();
		long r2 = e.evaluer();
		simulerRightDown(j);
		e.tilesSim = tilesSim.clone();
		long r3 = e.evaluer();
		simulerRightLeft(j);
		e.tilesSim = tilesSim.clone();
		long r4 = e.evaluer();
		r[1] = maximum(r1,r2,r3,r4)/100+r[1];
	}
	else r[1] = -1;
	if(j.moveDown()) {
		simulerDownUp(j);
		e.tilesSim = tilesSim.clone();
		long r1 = e.evaluer();
		simulerDownRight(j);
		e.tilesSim = tilesSim.clone();
		long r2 = e.evaluer();
		simulerDownDown(j);
		e.tilesSim = tilesSim.clone();
		long r3 = e.evaluer();
		simulerDownLeft(j);
		e.tilesSim = tilesSim.clone();
		long r4 = e.evaluer();
		r[2] = maximum(r1,r2,r3,r4)/100+r[2];
	}
	else r[2] = -1;
	if(j.moveLeft()) {
		simulerLeftUp(j);
		e.tilesSim = tilesSim.clone();
		long r1 = e.evaluer();
		simulerLeftRight(j);
		e.tilesSim = tilesSim.clone();
		long r2 = e.evaluer();
		simulerLeftDown(j);
		e.tilesSim = tilesSim.clone();
		long r3 = e.evaluer();
		simulerLeftLeft(j);
		e.tilesSim = tilesSim.clone();
		long r4 = e.evaluer();
		r[3] = maximum(r1,r2,r3,r4)/100+r[3];
	}
	else r[3] = -1;
	}
	for (int c = 0; c < 4; c++) {
		if(r[c] > temp) {
			temp = r[c];
			mc = c;
	}
	}
	j.checkingAvailableMoves = false;
	if(mc == 0)
		return j.moveUp();
	else if(mc == 1)
		return j.moveRight();
	else if(mc == 2)
		return j.moveDown();
	return j.moveLeft();
}

}

