import java.util.Scanner;
//import java.util.Arrays;
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
     * @throws     Exception  if task inputs are invalid
     */
    Task(final String titlee, final String assignedToo,
        final int timeToCompletee,
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
    /**
     * Gets the title.
     *
     * @return     The title.
     */
    public String getTitle() {
        return title;
    }
    /**
    * gets the person assigned to.
    *
    * @return     assigned to.
    */
    public String getassignedTo() {
        return assignedTo;
    }
    /**
    * returns time.
    *
    * @return     time.
    */
    public int gettimeToComplete() {
        return timeToComplete;
    }

    /**
    * Gets the important.
    *
    * @return     The important.
    */
    public String getImportant() {
        if (important) {
            return "Important";
        } else {
            return "Not Important";
        }
    }

    /**
    * Gets the urgent.
    *
    * @return     The urgent.
    */
    public String getUrgent() {
        if (urgent) {
            return "Urgent";
        } else {
            return "Not Urgent";
        }
    }
    /**
    * Gets the status.
    *
    * @return     The status.
    */
    public String getStatus() {
        return status;
    }
    /**
    * Gets the imp.
    *
    * @return     The imp.
    */
    public boolean getImp() {
        return important;
    }
    /**
    * Gets the urg.
    *
    * @return     The urg.
    */
    public boolean getUrg() {
        return urgent;
    }
}
/**
 * Class for todoist.
 */
class Todoist {
     /**
    *
    */
   // private static final int TWENTY = 20;
    /**
    *
    **/
    //private Task[] task;
     /**
     *
     **/
   // private int size;
    /**
     * Constructs the object.
     **/
    // Todoist() {
    //     final int n = TWENTY;
    //     task = new Task[n];
    //     size = 0;
   // }
    /**
     * Adds a task.
     *
     * @param      taskk  The taskk
     */
    // public void addTask(final Task taskk) {
    // task[size] = taskk;
    // size += 1;
    //}
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    // public String toString() {
    // String s = "";
    // for (int i = 0; i < size; i++) {
    //   s = s + task[i].getTitle() + ", " + task[i].getassignedTo() +  ", "
    //         + task[i].gettimeToComplete() +  ", " + task[i].getImportant()
    //         +  ", " + task[i].getUrgent() + ", " +  task[i].getStatus()
    //         + "\n";
    // }
    // return s;
    // }
}
/**
 * Class for todoist main.
 */
class TodoistMain {
    /**
    *
    */
    private static final int THREE = 3;
    /**
    *
    */
    private static final int FOUR = 4;
    /**
    *
    */
    private static final int FIVE = 5;
    /**
     * { var_description }
     */
    private static final int SIX = 6;
    private TodoistMain() {
    
    }
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
    // public static void testAddTask(final Todoist todo,
    //  final String[] tokens) {
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
    public static Task createTask(final String[] tokens)
    throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[THREE]);
        boolean important = tokens[FOUR].equals("y");
        boolean urgent = tokens[FIVE].equals("y");
        String status = tokens[SIX];
        return new Task(title, assignedTo, timeToComplete,
                        important, urgent, status);
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