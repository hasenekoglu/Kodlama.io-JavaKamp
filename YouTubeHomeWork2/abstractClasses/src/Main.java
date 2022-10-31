public class Main {
    public static void main(String[] args) {
        GameCalculator[] gameCalculator = new GameCalculator[]{
                new ManGameCalculator(),
                new WomanGameCalculator(),
                new KidsGameCalculator()
        };
        for (GameCalculator gamecalcualter:gameCalculator)
        {
        gamecalcualter.hesapla();

        }

    }
}