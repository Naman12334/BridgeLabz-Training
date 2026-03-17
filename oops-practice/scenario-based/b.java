import java.util.*;

class Version {
    String name;
    int size;

    Version(String n, int s) {
        name = n;
        size = s;
    }
}

public class b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, List<Version>> map = new HashMap<>();

        while (n-- > 0) {

            String line = sc.nextLine();
            String[] p = line.split(" ");

            if (p[0].equals("UPLOAD")) {

                String file = p[1];
                String version = p[2];
                int size = Integer.parseInt(p[3]);

                map.putIfAbsent(file, new ArrayList<>());

                boolean exists = false;
                for (Version v : map.get(file))
                    if (v.name.equals(version))
                        exists = true;

                if (!exists)
                    map.get(file).add(new Version(version, size));
            }

            else if (p[0].equals("FETCH")) {

                String file = p[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                List<Version> list = new ArrayList<>(map.get(file));

                list.sort((a, b) -> {
                    if (a.size != b.size)
                        return a.size - b.size;
                    return a.name.compareTo(b.name);
                });

                for (Version v : list)
                    System.out.println(file + " " + v.name + " " + v.size);
            }

            else if (p[0].equals("LATEST")) {

                String file = p[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                List<Version> list = map.get(file);
                Version v = list.get(list.size() - 1);

                System.out.println(file + " " + v.name + " " + v.size);
            }

            else if (p[0].equals("TOTAL_STORAGE")) {

                String file = p[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                int total = 0;

                for (Version v : map.get(file))
                    total += v.size;

                System.out.println(file + " " + total);
            }
        }
    }
}