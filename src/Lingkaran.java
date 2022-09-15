public class Lingkaran extends MethodAbstract{
    int r = 10;
    double phi = 3.14;

    public int luas(){
        return (int) (2 *phi * r);
    }

    public int keliling(){
        return (int) (phi * r * r);
    }
}
