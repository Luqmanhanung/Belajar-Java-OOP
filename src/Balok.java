public class Balok extends BangunRuang{
    int p = 10;
    int l =8;
    int t = 6;
    public int volume(){
        return p * l * t;
    }

    public int luasSelimut(){
        return 2 * (p*l + p*t +l*t);
    }
}
