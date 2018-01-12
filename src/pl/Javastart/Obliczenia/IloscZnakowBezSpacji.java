package pl.Javastart.Obliczenia;

public class IloscZnakowBezSpacji {

    public int konwerter2(String nazwa) {
        String zmiennaSpacja = " ";
        int licznik = 0;
        String zmiennaDodatkowa = nazwa.replaceAll(" ", "x");
        for (int i = 0; i < nazwa.length(); i++) {
            if (!zmiennaDodatkowa.isEmpty()) {
                licznik++;
            }
        }
    return (nazwa.length() - licznik);
    }
}
