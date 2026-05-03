package leetcode.quests.dataStructuresAndAlgorithms.stack.Q1_buildAnArrayWithStackOperations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SolutionQ1 {

    private final static String PUSH = "Push";
    private final static String POP = "Pop";

    public List<String> buildArray(int[] target,
                                   int n) {

        List<String> commands = new LinkedList<>();
        int i = 1;

        for (int t : target) {

            int toPop = 0;
            while (i < t){
                commands.add(PUSH);
                toPop++;
                i++;
            }
            for (int j = 0; j < toPop; j++) {
                commands.add(POP);
            }

            commands.add(PUSH);
            i++;
        }
        return commands;


    }
}
