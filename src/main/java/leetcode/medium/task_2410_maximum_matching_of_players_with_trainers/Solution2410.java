package leetcode.medium.task_2410_maximum_matching_of_players_with_trainers;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2410 {

    public int matchPlayersAndTrainers(int[] players,
                                       int[] trainers) {
        int[] sortedPlayers = Arrays.copyOf(players, players.length);
        int[] sortedTrainers = Arrays.copyOf(trainers, trainers.length);
        Arrays.sort(sortedPlayers);
        Arrays.sort(sortedTrainers);
        int matched = 0;
        int trainerIndex = sortedTrainers.length - 1;
        for (
                int playerIndex = sortedPlayers.length - 1;
                playerIndex >= 0 && trainerIndex >= 0;
                playerIndex--) {
            if (sortedPlayers[playerIndex] <= sortedTrainers[trainerIndex]) {
                matched++;
                trainerIndex--;
            }
        }
        return matched;
    }
}
