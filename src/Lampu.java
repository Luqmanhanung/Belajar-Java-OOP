public class Lampu implements InterfaceActivityLampu{
    public int statusLampu;

    @Override
    public void matikanLampu() {
        if (statusLampu==0){
            System.out.println("Lampu dalam kondisi mati");
        }else if (statusLampu==1){
            statusLampu = -1;
            System.out.println("Lampu sudah dimatikan");
        }
    }

    @Override
    public void hidupkanLampu() {
        if (statusLampu==1){
            System.out.println("lampu sudah dinyalakan \n***");
        } else {
            statusLampu = +1;
            System.out.println("Lampu sudah dalam kondisi menyala");
        }
    }
    public void redupkanLampu() {
        if (statusLampu==3){
            System.out.println("lampu sudah dinyalakan redup \n***");
        } else {
            statusLampu = +3;
            System.out.println("Lampu sudah dalam kondisi menyala redup");
        }
    }

    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }
}
