import java.util.Scanner;
import java.util.Arrays;
/**.
  * write your code below this comment
  */
class Task {
    /**
    *
    */
    private String title;
    /**
    *
    */
    private String assignedTo;
    /**
    *
    */
    private int timeToComplete;
    /**
    *
    */
    private boolean important;
    /**
    *
    */
    private boolean urgent;
    /**
    *
    */
    private String status;
    /**
     * Constructs the object.
     */
    Task() {
    }
    /**
     * Constructs the object.
     *
     * @param      titlee           The title
     * @param      assignedToo      The assigned to
     * @param      timeToCompletee  The time to complete
     * @param      importantt       The important
     * @param      urgentt          The urgent
     * @param      statuss          The status
     * @throws Exception
     */
    Task(final String titlee, final String assignedToo, final int timeToCompletee,
        final boolean importantt, final boolean urgentt,
        final String statuss) throws Exception {
        this.assignedTo = assignedToo;
        this.important = importantt;
        this.urgent = urgentt;
        if (titlee.length() > 0) {
            this.title = titlee;
        } else {
            throw new Exception("Title not provided");
        }
        if (timeToCompletee >= 0) {
            this.timeToComplete = timeToCompletee;
        } else {
            throw new Exception("Invalid timeToComplete " + timeToCompletee);
        }
        if (statuss.equals("todo") || statuss.equals("done")) {
            this.status = statuss;
        } else {
            throw new Exception("Invalid status " + statuss);
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        String imp = "";
        String urg = "";
        if (important) {
            imp = "Important";
        } else {
            imp = "Not Important";
        }
        if (urgent) {
            urg = "Urgent";
        } else {
            urg = "Not Urgent";
        }
        s = title + ", " + assignedTo + ", " + timeToComplete + ", "
            + imp + ", " + urg + ", " + status;
        return s;
    }
}
/**
 * Class for todoist.
 */
class Todoist {
    /*
    *
    */
    private String[] task;
    /*
    *
    */
    private int size;

    Todoist() {
        // Task task = new Task[20];
        // size = 0; 
    }
}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            // case "add-task":
            //     testAddTask(todo, tokens);
            // break;
            // case "print-todoist":
            //     System.out.println(todo);
            // break;
            // case "get-next":
            //     System.out.println(todo.getNextTask(tokens[1]));
            // break;
            // case "get-next-n":
            //     int n = Integer.parseInt(tokens[2]);
            //     Task[] tasks = todo.getNextTask(tokens[1], n);
            //     System.out.println(Arrays.deepToString(tasks));
            // break;
            // case "total-time":
            //     System.out.println(todo.totalTime4Completion());
            // break;
            default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    // public static void testAddTask(final Todoist todo, final String[] tokens) {
    //     try {
    //         todo.addTask(createTask(tokens));
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
                   title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
