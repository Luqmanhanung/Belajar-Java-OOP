public class PrismaSegitiga extends BangunRuang{
    int s = 10;
    int t = 14;

    public int volume(){
        return (s * s * s) * t;
    }
    public int luasSelimut(){
        return t * (s+s+s)+ (2*((s*s*s)*t));
    }
}
