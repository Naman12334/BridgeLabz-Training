class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startIndex = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalSurplus += petrol[i] - distance[i];
            currentSurplus += petrol[i] - distance[i];

            if (currentSurplus < 0) {
                startIndex = i + 1;
                currentSurplus = 0;
            }
        }

        return totalSurplus >= 0 ? startIndex : -1;
    }
}
