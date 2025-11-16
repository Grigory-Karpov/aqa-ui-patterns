import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@UtilityClass
public class DataGenerator {

    public static UserData generateUser() {
        Faker faker = new Faker(new Locale("ru"));
        return new UserData(
                faker.address().city(),
                faker.name().fullName(),
                faker.phoneNumber().phoneNumber()
        );
    }

    public static String generateDate(int daysToAdd) {
        return LocalDate.now().plusDays(daysToAdd).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}