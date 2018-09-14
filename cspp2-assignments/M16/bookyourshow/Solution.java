import java.util.Arrays;
import java.util.Scanner;
class Show {
	private String moviename;
	private String datetime;
	private String[] seats;


	Show() {

	}

	Show(final String moviename, final String datetime, final String[] seats) {
		this.moviename = moviename;
		this.datetime = datetime;
		this.seats = seats;
	}

	public String getmoviename() {
		return moviename;
	}
	public String getdateTime() {
		return datetime;
	}
	public String[] getseats() {
		return seats;
	}
	public String toStringWithoutTickets() {
        String s = "";
        s += moviename + "," + datetime;
        return s;
    }
    public String toString() {
        String s = "";
        s += moviename + "," + datetime + ",";
        s += Arrays.toString(seats).replace(", ",",");
        return s;
    }
}

class Patron {
	private String name;
	private String number;
	private String[] bookedseats;


	Patron() {

	}

	Patron(final String name, final String number, final String[] bookedseats) {
		this.name = name;
		this.number = number;
		this.bookedseats = bookedseats;
	}

	public String getname() {
		return name;
	}
	public String getnumber() {
		return number;
	}
	public String[] getBookedSeats() {
        return bookedseats;
    }
    public String toString() {
        String s = "";
        s += name + " " + number + " " + Arrays.toString(bookedseats);
        return s;
    }
}
class BookYourShow {
	private Show[] show;
	private Patron[] patron;
	private int scount;
	private int pcount;

	BookYourShow() {
		show = new Show[10];
		patron = new Patron[10];
		scount = 0;
		pcount = 0;
	}

	public void addAShow(final Show movie) {
		if (scount == show.length) {
			sresize();
		} else {
			show[scount] = movie;
			scount++;
		}
	}
	public void sresize() {
		show = Arrays.copyOf(show, scount + 5);
	}

	public void addApatron(final Patron name) {
		if (pcount == patron.length) {
			presize();
		} else {
			patron[pcount] = name;
			pcount++;
		}
	}
	public void presize() {
		patron = Arrays.copyOf(patron, pcount + 5);
	}

	public Show getAShow(final String movie, final String datetime) {
		for (int i = 0; i < scount; i++) {
			if ((movie.equals(show[i].getmoviename())) && (datetime.equals(show[i].getdateTime()))) {
				return show[i];
			}
		}
		return null;
	}

	public void bookAShow(final String moviename, final String datetime, final Patron p) {
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
					if (seat[i].equals(bookedseats[j]) && !seat[i].equals("N/A")) {
						seat[i] = "N/A";
					}
				}
			}
		} else {
			System.out.println("No show");
		}
	}
	public void showAll() {
        for (int i = 0; i < scount; i++) {
            System.out.println(show[i]);
        }
    }
    public void printTicket(final String movie, final String datetime, final String number) {
    	Show show = getAShow(movie, datetime);
    	if (show != null) {
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