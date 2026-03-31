import java.util.*;

class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",1,"B",2,"C",1);
        Map<Integer,List<String>> result = new HashMap<>();

        for(var e : map.entrySet())
            result.computeIfAbsent(e.getValue(), k -> new ArrayList<>())
                  .add(e.getKey());

        System.out.println(result);
    }
}
