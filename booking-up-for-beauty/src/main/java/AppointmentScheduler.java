import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDate parsedDate = LocalDate.parse(appointmentDateDescription, format);
        LocalTime parsedTime = LocalTime.parse(appointmentDateDescription, format);

        return LocalDateTime.of(parsedDate, parsedTime);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime hoy = LocalDateTime.now();
        boolean fueAntes = appointmentDate.isBefore(hoy);
        return fueAntes;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hora = appointmentDate.getHour();
        return (hora >= 12 && hora < 18);

    }

    public String getDescription(LocalDateTime appointmentDate) {
        // "You have an appointment on Friday, March 29, 2019, at 3:00 PM."
        /*
         * DateTimeFormatter format = DateTimeFormatter
         * .ofPattern("You have an appointment on EEE, MMMM d, yyyy, at h:mm aa.");
         * 
         * String descripcion = format.format(appointmentDate);
         */

        String descripcion = appointmentDate
                .format(DateTimeFormatter.ofPattern("EEE, MMMM d, yyyy hh:mm a"));

        // DateTimeFormatter format = DateTimeFormatter.ofPattern("EEE, MMMM d, yyyy
        // HH:mm a");

        // LocalDate parsedDate = LocalDate.parse(descripcion, format);
        // LocalTime parsedTime = LocalTime.parse(descripcion, format);

        return "You have an appointment on " + descripcion;

    }

    public LocalDate getAnniversaryDate() {
        throw new UnsupportedOperationException(
                "Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
}
