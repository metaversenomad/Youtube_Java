package src.forLoop;

public class _5_Continue {
    public static void main(String[] args) {
        int totalData = 20;

        for (int i = 0; i <totalData; i++) {

            if (i==15) {
                continue;
            }

            System.out.println("Datas :"+i);
        }
        for (int i = 20; i >=0; i--) {

            if (i==12){
                continue;
            }
            if (i==4){
                break;
            }
            System.out.println(i);
        }
    }
}
