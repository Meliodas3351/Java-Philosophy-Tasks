package exceptions.start_tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task6_7 {
    public static void main(String[] args) {
        try {
            throw new FirstException("Created by Breywo", LocalDateTime.now().toLocalTime());
        } catch (FirstException e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new SecondException("Created by Breywo", LocalDateTime.now().toLocalDate());
        } catch (SecondException e) {
            System.out.println(e.getMessage());
        }
    }
}

class FirstException extends Exception {
    private LocalTime time;

    public FirstException(LocalTime time) {
        this.time = time;
    }

    public FirstException(String message, LocalTime time) {
        super(message);
        this.time = time;
    }

    @Override
    public String getMessage() {
        return "Time - " + time + " .Info - " + super.getMessage();
    }
}

class SecondException extends Exception {
    private LocalDate date;

    public SecondException(LocalDate date) {
        this.date = date;
    }

    public SecondException(String message, LocalDate date) {
        super(message);
        this.date = date;
    }

    @Override
    public String getMessage() {
        return "Time - " + date + " .Info - " + super.getMessage();
    }
}