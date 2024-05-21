public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("LENGVESNI UŽDAVINIAI");
        System.out.println("------------------");
        System.out.println("Užduotis 1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Labas");
        }
        System.out.println("------------------");
        System.out.println("Užduotis 2");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("------------------");
        System.out.println("Užduotis 3");
        String[] augalai = {"Aguona", "Agurkas", "Citrina", "Sausmediniai", "Gaiva", "Grikis", "Nasturtiniai", "Obelis", "Rugys", "Zunda"};
        System.out.println("------------------");
        System.out.println("Užduotis 4");
        for (int i = 0; i < augalai.length; i++) {
            System.out.println(augalai[i]);
        }
        System.out.println("------------------");
        System.out.println("Užduotis 5");
        for (int i = augalai.length - 1; i >= 0; i--) {
            System.out.println(augalai[i]);
        }
        System.out.println("------------------");
        System.out.println("Užduotis 6");
        for (int i = 10; i < 51; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------------");
        System.out.println("Užduotis 7");
        for (int i = 10; i < 51; i++) {
            if (i % 2 == 0) {
                if (i % 10 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
        System.out.println("------------------");
        System.out.println("Užduotis 8");
        int count = 0;
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("------------------");
        System.out.println("Užduotis 9");
        int trumpi = 0;
        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() <= 5) {
                trumpi++;
            }
        }
        System.out.println("Žodiai trumpesni nei 5 raidės " + trumpi);
        int ilgi = 0;
        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() > 7) {
                ilgi++;
            }
        }
        System.out.println("Žodiai ilgesni nei 7 raidės " + ilgi);

        System.out.println("------------------");
        System.out.println("Užduotis 10");
        int vidurkis = 0;
        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() < 10) {
                if (augalai[i].length() > 5)
                    vidurkis++;
            }
        }
        System.out.println("Žodiai nuo 5 iki 10 raidžių  " + vidurkis);
        System.out.println("------------------");
        System.out.println("SUNKUSNI UŽDAVINIAI");
        System.out.println("------------------");
        System.out.println("Užduotis 1");

        int skaiciai = 0;
        int max = 300;
        int min = 0;
        for (int i = 0; i < 300; i++) {
            int in = min + (int) Math.round(Math.random() * max - min);
            if (in > 150) {
                skaiciai++;
            }
            if (in > 275) {
                System.out.print("[" + in + "] ");
            } else {
                System.out.print(in + " ");
            }
        }
        System.out.println();
        System.out.println("Skaičių virš 150: " + skaiciai);

        String num77 = "";
        System.out.println("------------------");
        System.out.println("Užduotis 2");
        for (int i = 1; i < 3000; i++) {
            if (i % 77 == 0) {
                num77 += i + ",";
            }
        }
        System.out.println(num77.substring(0, num77.length() - 1));

        System.out.println();
        System.out.println("------------------");
        System.out.println("Užduotis 3");

        int count1 = 0;
        while (true) {
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * ");
            count1++;
            if (count1 > 25) {
                break;
            }
        }
        System.out.println("------------------");
        System.out.println("Užduotis 4");
        int linija = 25;
        for (int i = 0; i < linija; i++) {
            for (int z = 0; z < linija; z++) {
                if (z == i || linija - z == i + 1) {
                    System.out.print("@ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
        System.out.println("Užduotis 5");
        boolean coin1 = true;
        while (coin1) {
            int coin = (int) Math.round(Math.random() * (1 - 0) - 0);
            if (coin == 0) {
                System.out.print("H ");
            } else {
                System.out.print("S ");
            }
            if (coin == 0) {
                coin1 = false;
                System.out.println();
            }
        }
        int herbas = 0;
        boolean coin2 = true;
        while (coin2) {
            int coin = (int) Math.round(Math.random() * (1 - 0) - 0);
            if (coin == 0) {
                herbas++;
                System.out.print("H ");
            } else {
                System.out.print("S ");
            }
            if (herbas == 3) {
                coin2 = false;
                System.out.println();
            }
        }
        int herbas1 = 0;
        boolean coin3 = true;
        while (coin3) {
            int coin = (int) Math.round(Math.random() * (1 - 0) - 0);
            if (coin == 0) {
                herbas1++;
                System.out.print("H ");
            } else {
                System.out.print("S ");
                herbas1 = 0;
            }
            if (herbas1 == 3) {
                coin3 = false;
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println("Užduotis 6");
        int petrassum = 0;
        int kazyssum = 0;

        boolean game = true;
        while (game) {
            int petras = (int) Math.round(Math.random() * (20 - 10) + 10);
            petrassum += petras;
            System.out.print("Petro taškai: " + petras + ", ");
            int kazys = (int) Math.round(Math.random() * (25 - 5) + 5);
            kazyssum += kazys;
            System.out.print("Kazio taškai: " + kazys + ", ");

            if (petras > kazys) {
                System.out.println("Partija laimė: Petras");
            } else {
                System.out.println("Partija laimė: Kazys");
            }
            if (petrassum > 221 || kazyssum > 221) {
                game = false;
                System.out.println();
                System.out.println("Taškai: " + petrassum + " " + kazyssum);
            }
        }
        if (petrassum > kazyssum) {
            System.out.println("Žaidima laimėjo Petras " + petrassum);
        } else {
            System.out.println("Žaidima laimėjo Kazys " + kazyssum);
        }
        if (petrassum == kazyssum) {
            System.out.println("Žaidimo lygiosios");
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println("Užduotis 8");

        int nail = 85;
        int totalCount = 0;
        for (int i = 0; i < 5; i++) {
            int nailsoft = 0;
            int nailsoftk = 0;
            boolean finish = true;
            while (finish) {
                int soft = (int) Math.round(Math.random() * (20 - 5) + 5);
                if (soft < nail) {
                    nailsoftk++;
                    nailsoft += soft;
                    System.out.print(nailsoft + "mm, ");
                }
                if (nailsoft >= nail) {
                    finish = false;
                    totalCount += nailsoftk;
                    System.out.println();
                    System.out.println("kartu ikalti " + nailsoftk);
                }
            }
        }
        System.out.println("total count: " + totalCount);
        System.out.println("---------------------------");
        int totalCount1 = 0;
        for (int i = 0; i < 5; i++) {
            int nailhard = 0;
            int nailhardk = 0;
            boolean finish1 = true;
            while (finish1) {
                nailhardk++;
                if (Math.random() > 0.5) {
                    continue;
                }
                int hard = (int) Math.round(Math.random() * (30 - 20) + 20);
                if (hard < nail) {
                    nailhardk++;
                    nailhard += hard;
                    System.out.print(nailhard + "mm, ");
                }

                if (nailhard >= nail) {
                    finish1 = false;
                    totalCount1 += nailhardk;
                    System.out.println();
                    System.out.println("kartu ikalti " + nailhardk);
                }
            }
        }
        System.out.println("total count: " + totalCount1);


        System.out.println("dasdasd");

    }
}