import java.util.*;

class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        Map<String,Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z ]","");

        for(String w : text.split(" "))
            map.put(w, map.getOrDefault(w, 0) + 1);

        System.out.println(map);
    }
}
