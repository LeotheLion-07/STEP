import java.util.*;

public class SeatDuplication {

    public static void CheckSeats(int seat_number[]) {

        if (seat_number == null) {
            System.out.println("Seat Allocation is Possible");
            return;
        }

        boolean seatDuplication = false;

        for (int i = 0; i < seat_number.length; i++) {
            for (int j = i + 1; j < seat_number.length; j++) {

                if (seat_number[i] == seat_number[j]) {
                    System.out.println("Duplicate Seat Number found: " + seat_number[i]);
                    seatDuplication = true;
                }
            }
        }

        if (!seatDuplication) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        int[] seat_number = new int[5];

        Scanner S = new Scanner(System.in);

        System.out.println("Enter 5 seat numbers:");

        for (int i = 0; i < 5; i++) {
            seat_number[i] = S.nextInt();
        }

        CheckSeats(seat_number);

        S.close();
    }
}
