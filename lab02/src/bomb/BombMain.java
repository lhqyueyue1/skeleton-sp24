package bomb;

import common.IntList;

import java.util.HashSet;
import java.util.Random;

public class BombMain {
    public static void answers(String[] args) {
        int phase = 2;
        if (args.length > 0) {
            phase = Integer.parseInt(args[0]);
        }
        // TODO: Find the correct inputs (passwords) to each phase using debugging techniques

        Bomb b = new Bomb();
        if (phase >= 0) {
            b.phase0("39291226");
        }
        if (phase >= 1) {
            IntList list = IntList.of(0, 9, 3, 0, 8);
            b.phase1(list); // Figure this out too
        }
        if (phase >= 2) {
            Random random = new Random(1337);
            HashSet<Integer> paswords = new HashSet<>();
            for (int i = 0; i < 100000; i++) {
                paswords.add(random.nextInt());
            }
            b.phase2(String.valueOf(paswords.stream().toList().get(1337)));
        }
    }
}
