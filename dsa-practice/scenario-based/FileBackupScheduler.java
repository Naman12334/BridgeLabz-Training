import java.util.PriorityQueue;


class InvalidBackupPathException extends Exception {
    public InvalidBackupPathException(String message) {
        super(message);
    }
}

class BackupTask implements Comparable<BackupTask> {

    private String folderPath;
    private int priority;

    public BackupTask(String folderPath, int priority)
            throws InvalidBackupPathException {

        if (folderPath == null || folderPath.trim().isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }

        this.folderPath = folderPath;
        this.priority = priority;
    }

    @Override
    public int compareTo(BackupTask other) {
      
        return Integer.compare(other.priority, this.priority);
    }

    public void execute() {
        System.out.println("🔄 Backing up: " + folderPath +
                " | Priority: " + priority);
    }
}


class BackupScheduler {

    private PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void addTask(BackupTask task) {
        queue.add(task);
    }

    public void executeBackups() {
        System.out.println("\nExecuting backup tasks...");
        while (!queue.isEmpty()) {
            queue.poll().execute();
        }
    }
}


public class FileBackupScheduler {
    public static void main(String[] args) {

        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.addTask(new BackupTask("C:/System", 10));
            scheduler.addTask(new BackupTask("C:/Documents", 3));
            scheduler.addTask(new BackupTask("C:/Photos", 1));
            scheduler.addTask(new BackupTask("", 5)); 
        } catch (InvalidBackupPathException e) {
            System.out.println("⚠️ " + e.getMessage());
        }

        scheduler.executeBackups();
    }
}
