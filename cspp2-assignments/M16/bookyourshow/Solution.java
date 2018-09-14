import java.util.Arrays;
import java.util.Scanner;
/**
 * Class for show.
 */
class Show {
    /**
    *
    */
    private String moviename;
    /**
    *
    */
    private String datetime;
    /**
    *
    */
    private String[] seats;
    /**
     * Constructs the object.
     */
    Show() {
    }
    /**
     * Constructs the object.
     *
     * @param      movienamee  The moviename
     * @param      datetimee   The datetime
     * @param      seatss      The seats
     */
    Show(final String movienamee, final String datetimee,
         final String[] seatss) {
        this.moviename = movienamee;
        this.datetime = datetimee;
        this.seats = seatss;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String getmoviename() {
        return moviename;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String getdateTime() {
        return datetime;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String[] getseats() {
        return seats;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String toStringWithoutTickets() {
        String s = "";
        s += moviename + "," + datetime;
        return s;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += moviename + "," + datetime + ",";
        s += Arrays.toString(seats).replace(", ", ",");
        return s;
    }
}
/**
 * Class for patron.
 */
class Patron {
    /**.
    *
    */
    private String name;
    /**.
    *
    */
    private String number;
    /**.
    *
    */
    private String[] bookedseats;
    /**.
     * Constructs the object.
     */
    Patron() {
    }
    /**
     * Constructs the object.
     *
     * @param      namee         The name
     * @param      numberr       The number
     * @param      bookedseatss  The bookedseats
     */
    Patron(final String namee, final String numberr,
        final String[] bookedseatss) {
        this.name = namee;
        this.number = numberr;
        this.bookedseats = bookedseatss;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String getname() {
        return name;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String getnumber() {
        return number;
    }
    /**.
     * Gets the booked seats.
     *
     * @return     The booked seats.
     */
    public String[] getBookedSeats() {
        return bookedseats;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += name + " " + number + " " + Arrays.toString(bookedseats);
        return s;
    }
}
/**
 * Class for book your show.
 */
class BookYourShow {
     /**
     * initializing value of ten.
     */
    private static final int TEN = 10;
    /**
    *
    */
    private Show[] show;
    /**
    *
    */
    private Patron[] patron;
    /**
    *
    */
    private int scount;
    /**
    *
    */
    private int pcount;
    /**
     * Constructs the object.
     */
    BookYourShow() {
        show = new Show[TEN];
        patron = new Patron[TEN];
        scount = 0;
        pcount = 0;
    }
    /**
     * Adds a show.
     *
     * @param      movie  The movie
     */
    public void addAShow(final Show movie) {
        if (scount == show.length) {
            sresize();
        } else {
            show[scount] = movie;
            scount++;
        }
    }
    /**.
     * { function_description }
     */
    public void sresize() {
        show = Arrays.copyOf(show, scount + 2);
    }
    /**
     * Adds an apatron.
     *
     * @param      name  The name
     */
    public void addApatron(final Patron name) {
        if (pcount == patron.length) {
            presize();
        } else {
            patron[pcount] = name;
            pcount++;
        }
    }
    /**.
     * { function_description }
     */
    public void presize() {
        patron = Arrays.copyOf(patron, pcount + 2);
    }
    /**
     * Gets a show.
     *
     * @param      movie     The movie
     * @param      datetime  The datetime
     *
     * @return     A show.
     */
    public Show getAShow(final String movie, final String datetime) {
        for (int i = 0; i < scount; i++) {
            if ((movie.equals(show[i].getmoviename()))
                && (datetime.equals(show[i].getdateTime()))) {
                return show[i];
            }
        }
        return null;
    }
    /**.
     * { function_description }
     *
     * @param      moviename  The moviename
     * @param      datetime   The datetime
     * @param      p          { parameter_description }
     */
    public void bookAShow(final String moviename, final String datetime,
                             final Patron p) {
        addApatron(p);
        Show availableshow = getAShow(moviename, datetime);
        if (availableshow != null) {
            String[] seat = availableshow.getseats();
            String[] bookedseats = p.getBookedSeats();
            // System.out.println(Arrays.toString(seat));
            // System.out.println(Arrays.toString(bookedseats));
            // System.out.println(seat.length + ", " + bookedseats.length);
            for (int i = 0; i < seat.length; i++) {
                for (int j = 0; j < bookedseats.length; j++) {
                    // System.out.println(i + ", " + j);
                    if (seat[i].equals(bookedseats[j])
                        && !seat[i].equals("N/A")) {
                        seat[i] = "N/A";
                    }
                }
            }
        } else {
            System.out.println("No show");
        }
    }
    /**
     * Shows all.
     */
    public void showAll() {
        for (int i = 0; i < scount; i++) {
            System.out.println(show[i]);
        }
    }
    /**.
     * { function_description }
     *
     * @param      movie     The movie
     * @param      datetime  The datetime
     * @param      number    The number
     */
    public void printTicket(final String movie, final String datetime,
         final String number) {
        Show showw = getAShow(movie, datetime);
        if (showw != null) {
            for (int i = 0; i < pcount; i++) {
                if (number.equals(patron[i].getnumber())) {
                    System.out.println(number + " " + movie + " " + datetime);
                    return;
                }
            }
            System.out.println("Invalid");
        } else {
            System.out.println("Invalid");
        }
    }
}
/**.
 * main
 **/
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                              replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
            case "add":
                int k = 2;
                String[] seats = new String[tokens.length - 2];
                for (int j = 0; j < seats.length; j++) {
                    seats[j] = tokens[k++];
                }
                bys.addAShow(new Show(check[1], tokens[1], seats));
                break;
            case "book":
                k = 2 + 2;
                seats = new String[tokens.length - 2 - 2];
                for (int j = 0; j < seats.length; j++) {
                    seats[j] = tokens[k++];
                }
                bys.bookAShow(check[1], tokens[1],
                              new Patron(tokens[2], tokens[2 + 1], seats));
                break;

            case "get":
                Show show = bys.getAShow(check[1], tokens[1]);
                if (show != null) {
                    System.out.println(show.toStringWithoutTickets());
                } else {
                    System.out.println("No show");
                }
                break;

            case "print":
                bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

            case "showAll":
                bys.showAll();
                break;

            default:
                break;
            }
        }
    }
}
