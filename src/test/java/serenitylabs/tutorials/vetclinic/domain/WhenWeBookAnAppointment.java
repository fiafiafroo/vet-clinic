package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class WhenWeBookAnAppointment {

    private static final LocalDateTime TODAY_AT_1_PM = LocalDateTime.now().withHour(1).withMinute(0);
    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);
    private static final LocalDateTime TODAY_AT_3_PM = LocalDateTime.now().withHour(3).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.getPetName(), is(equalTo("Fido")));
        assertThat(appointment.getOwner(), is(equalTo("Fred")));
        assertThat(appointment.getAppointmentTime(), is(equalTo(TODAY_AT_2_PM)));
    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        assertThat(appointment.getReason().isPresent(), is(equalTo(true)));
        assertThat(appointment.getReason().get(), is(equalTo("He is sick")));
    }

    @Test
    public void an_appointment_has_a_booking_before_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.isBefore(TODAY_AT_3_PM), is(equalTo(true)));
    }

    @Test
    public void an_appointment_has_a_booking_after_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.isAfter(TODAY_AT_1_PM), is(equalTo(true)));
    }
}
