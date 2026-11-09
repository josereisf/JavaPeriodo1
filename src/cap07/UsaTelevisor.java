package cap07;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.setCanal(150);
        tv.setVolume(3);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.trocarCanal(10);

        System.out.println(tv.mostrar());

        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(5);
        Televisor tv3 = new Televisor(5, 10);

        System.out.println(tv1.mostrar());
        System.out.println(tv2.mostrar());
        System.out.println(tv3.mostrar());
    }
}
