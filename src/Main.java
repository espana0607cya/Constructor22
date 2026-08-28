public class Main {
    public static void main(String[] args) {

        Botella Botella1 = new Botella("Buchanans", "Whisky");

        Botella Botella2 = new Botella("Don Julio", "Tquila", 2);

        Botella Botella3 = new Botella("Smirnoff Tamarindo", "Vodka", 3, 55.000);

        Botella1.mostrarInformacion();
        Botella2.mostrarInformacion();
        Botella3.mostrarInformacion();
    }
}