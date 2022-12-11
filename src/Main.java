import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] JoJo = {1.2, 0.18, 1.32, -3.5, 12.6, 14.3, 1.23, 2.41, 7.3, -26.36, 8.2, 2.18, -1.2, 4.6, 0.153};

        double gold = 0.0;

        int requiem = 0;

        boolean isSilverChariot = false;

        for (double forever : JoJo) {

            if (isSilverChariot && forever < 0) {
                continue;
            }

            if (forever > 0) {
                gold += forever;
                requiem++;
            } else {
                isSilverChariot = true;
                gold = 0;
                requiem = 0;
            }


        }
        double averageOfMassive = gold / requiem;
        System.out.println(averageOfMassive);

        int[] cool = {26, 5, 2, -5, 8, -7, 9, -1, 4, -2};

        boolean Sort = false;
        int old;
        while (!Sort) {
            Sort = true;
            for (int i = 0; i < cool.length - 1; i++) {
                if (cool[i] > cool[i + 1]) {
                    Sort = false;

                    old = cool[i];
                    cool[i] = cool[i + 1];
                    cool[i + 1] = old;
                }
            }
        }
        System.out.println(Arrays.toString(cool));
    }
}