public class Appliation {
    public static void main(String[] args) {
        String  signs = args[0];
        Astrolog(signs);
    }
    public static void Astrolog(String sign) {
        int i = (int) Math.floor(Math.random() +1.5);
            if (sign.equals("Oven")){
                if (i == 1) {
                    System.out.println("1 гороскоп для овна");
                } else {
                    System.out.println("2 гороскоп для овна");
                }

            } else if (sign.equals("Telec")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Тельца");
                } else {
                    System.out.println("2 гороскоп для Тельца");
                }
            } else if (sign.equals("Bliznetci")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Близнецов");
                } else {
                    System.out.println("2 гороскоп для Близнецов");
                }
            } else if (sign.equals("Rak")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Рака");
                } else {
                    System.out.println("2 гороскоп для Рака");
                }
            } else if (sign.equals("Lev")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Льва");
                } else {
                    System.out.println("2 гороскоп для Льва");
                }
            } else if (sign.equals("Deva")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Девы");
                } else {
                    System.out.println("2 гороскоп для Девы");
                }
            } else if (sign.equals("Veci")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Весов");
                } else {
                    System.out.println("2 гороскоп для Весов");
                }
            } else if (sign.equals("Scorpion")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Скорпиона");
                } else {
                    System.out.println("2 гороскоп для Скорпиона");
                }
            } else if (sign.equals("Strelec")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Стрельца");
                } else {
                    System.out.println("2 гороскоп для Стрельца");
                }
            } else if (sign.equals("Kozerog")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Козерога");
                } else {
                    System.out.println("2 гороскоп для Козерога");
                }
            } else if (sign.equals("Voddolei")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Водолея");
                } else {
                    System.out.println("2 гороскоп для Водолея");
                }
            } else if (sign.equals("Fish")){
                if (i == 1) {
                    System.out.println("1 гороскоп для Рыб");
                } else {
                    System.out.println("2 гороскоп для Рыб");
                }
            }



        }
    }


