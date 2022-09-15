public class MethodReturnParam {
    String sayHi(String message ){
        return message + "Luqman Ganteng";
    }

    public static void main(String[] args) {
        MethodReturnParam method = new MethodReturnParam();
        String data = method.sayHi("Hai ");
        System.out.println(data);
    }
}
