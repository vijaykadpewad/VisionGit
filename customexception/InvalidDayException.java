package customexception;

public class InvalidDayException extends RuntimeException {
    InvalidDayException(String msg) {
        super(msg);
    }
}

class InvalidMonthException extends RuntimeException {
    InvalidMonthException(String msg1) {
        super(msg1);
    }
}

class MyDate {
    public static void main(String[] args) {

        MyDate md = new MyDate(32, 2, 2022);
    }

    MyDate() {
    }

    MyDate(int day, int month, int year) {
        if (day > 0 && day <= 31) {
            System.out.println("valid day");
        } else {
            throw new InvalidDayException("Please enter  valid Day");
        }
        if (month > 0 && month <= 12) {

            System.out.println("valid month");
        } else {
            throw new InvalidMonthException("Please Enter valid month");
        }

    }
}
