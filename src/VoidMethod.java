public class VoidMethod {
    int hour, minute,second;

    public void duration(int paramHour, int paramMinute, int paramSecond){
        this.hour = paramHour;
        this.minute = paramMinute;
        this.second = paramSecond;
    }

    public void infoDuration(){
        System.out.println("Total Waktu \n" + hour + " jam " + minute + " Menit " + second + " Detik" );
    }
}
