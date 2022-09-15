public class Kerucut extends BangunRuang{
    int r = 10;
    double phi = 3.14;
    int t = 12;
    int s = 15;

    public int volume(){
        return (int) ((1 / 3) * phi * r * r * t);
    }
    public int luasSelimut(){
        return (int) (phi * r *(r+s));
    }
}
