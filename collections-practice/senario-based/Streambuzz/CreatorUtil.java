package StreamBuzz;

import java.util.*;

public class CreatorUtil {

    public static List<CreatorStats> engagementBoard = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void registerCreator() {
        CreatorStats newCreator = new CreatorStats();

        System.out.print("Enter Name: ");
        newCreator.creatorName = sc.nextLine();

        for (int i = 0; i < 4; i++) {
            System.out.print("Likes For Week " + (i + 1) + ": ");
            newCreator.weeklyLikes[i] = sc.nextDouble();
        }
        sc.nextLine(); // consume newline

        engagementBoard.add(newCreator);
        System.out.println("Creator Registered Successfully");
    }

    public void getTopPostCounts() {
        System.out.print("Enter Like Threshold: ");
        double likeThreshold = sc.nextDouble();

        Map<String, Integer> map = new HashMap<>();

        for (CreatorStats creator : engagementBoard) {
            int count = 0;
            for (double likes : creator.weeklyLikes) {
                if (likes >= likeThreshold)
                    count++;
            }
            if (count > 0)
                map.put(creator.creatorName, count);
        }

        if (map.isEmpty()) {
            System.out.println("No top-performing posts this week");
            return;
        }

        for (String name : map.keySet()) {
            System.out.println(name + " - " + map.get(name));
        }
    }

    public void calculateAverageLikes() {
        if (engagementBoard.isEmpty()) {
            System.out.println("No creators available");
            return;
        }

        double totalLikes = 0;
        for (CreatorStats creator : engagementBoard) {
            for (double likes : creator.weeklyLikes) {
                totalLikes += likes;
            }
        }

        double average = totalLikes / engagementBoard.size();
        System.out.println("Overall average weekly likes: " + average);
    }
}
