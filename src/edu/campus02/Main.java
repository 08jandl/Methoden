package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// Methode für Sytem.out... + Zeilen zählen
        int gerundet = (int)Math.round(1.5);
        schreibe("Dulce et decorum est");
        schreibe("Bent double like old beggars under sacks");
        schreibe("coughing like hags we cursed through the sludge");
        schreibe("till on the haunting flares our backs we turned");
        schreibe("and towards our distant rest began to trudge");

        int fl1 = flaeche(1,3);
        int fl2 = flaeche(45, 290);

        System.out.println("Fl1: " + fl1);
        System.out.println("Fl2: " + fl2);

        int umf = umfang(12,19);
        int umf1 = umfang(478, 3098);

        System.out.println("Umfang: " + umf);
        System.out.println("Umfang1: " + umf1);
    }

    public static int schreibe(String text) {
        System.out.println(text);
        return 1;
        }

        public static int flaeche(int hoehe, int breite) {
            return hoehe*breite;
    }

    public static int umfang(int laenge, int breite) {
        int ergebnis = 2* laenge + 2* breite;
        return ergebnis;
    }
}
