package leetcode.hard.task_1857_largest_color_value_in_a_directed_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1857 {

    public int largestPathValue(String colors,
                                int[][] edges) {

        //finding paths
        List<StringBuilder> paths = findPossiblePaths(edges);

        if (paths.stream().anyMatch(path-> path.charAt(0)==path.charAt(path.length()-1))){
            return -1;
        }

        List<StringBuilder> coloredPaths = new ArrayList<>();
        for (var path : paths) {
            StringBuilder coloredPath = new StringBuilder();
            for (var node : path.toString().toCharArray()) {
                int colorValue = Character.getNumericValue(node);
                coloredPath.append(colors.charAt(colorValue));
            }
            coloredPaths.add(coloredPath);
        }



        int maxFrequency = 0;
        for(var path:coloredPaths){
            Map<Character,Integer> colorFrequencyMap = new HashMap<>();
           // int currentMaxFrequency = 0;
            for (char c: path.toString().toCharArray()){
                colorFrequencyMap.merge(c,1,Integer::sum);
            }
           var currentMaxFrequency = colorFrequencyMap.values().stream().max(Integer::compareTo).orElseThrow();
            if (currentMaxFrequency>maxFrequency){
                maxFrequency = currentMaxFrequency;
            }
        }





        return maxFrequency;
    }


    public List<StringBuilder> findPossiblePaths(int[][] edges) {

        List<StringBuilder> paths = new ArrayList<>();

        for (var edge : edges) {

            int startNode = edge[0];
            int endNode = edge[1];

            if (somePathEndsWithCurrentStartNode(paths, startNode)) {
                paths.stream()
                        .filter(path -> path.indexOf("" + startNode) != -1)
                        .forEach(path -> path.append(endNode));
            } else {
                paths.add(new StringBuilder()
                        .append(startNode)
                        .append(endNode));
            }
        }
        return paths;
    }

    private boolean somePathEndsWithCurrentStartNode(List<StringBuilder> paths,
                                                     int startNode) {
        return paths.stream()
                .anyMatch(path -> path.indexOf("" + startNode) > 0);
    }


}
