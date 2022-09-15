public class Bola extends BangunRuang{
    int r = 10;
    double phi = 3.14;

    public int volume(){
        return (int) ((4/3) * phi * r * r *r);
    }

    public int luasSelimut(){
        return (int) (4 * phi * r * r);
    }
}
