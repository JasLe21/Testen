
public class Schildkroete
{
    private int x;
    private int y;  
    private int groesse;

    public void nachRechts()
    {
        x = x + 10;
    }

    public void nachLinks()
    {
      x = x - 10;
    }

    public void nachOben()
    {
       y = y - 10;
    }

    public void nachUnten()
    {
        y = y + 10;    
    }
    
    public void wachsen()
    {
        groesse = groesse + 20;
    }

    public void schrumpfen()
    {
       groesse = groesse - 20;
    }

    public void setX(int neuesX)
    {
        x = neuesX;
    }

    public void setY(int neuesY)
    {
        y = neuesY;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setGroesse(int neueGroesse)
    {
        groesse = neueGroesse;
    }

    public int getGroesse()
    {
        return groesse;
    }


}
