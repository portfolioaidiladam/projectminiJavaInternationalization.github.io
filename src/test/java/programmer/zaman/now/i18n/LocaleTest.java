package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

  // Menggunakan Locale Indonesia
  @Test
  void testNewLocale() {
    var language = "in";
    var country = "ID";
    var locale = new Locale(language, country);

    System.out.println(locale.getLanguage());
    System.out.println(locale.getCountry());

    System.out.println(locale.getDisplayLanguage());
    System.out.println(locale.getDisplayCountry());
  }

  // Menggunakan Locale US
  @Test
  void testNewLocaleUs() {
    var language = "en";
    var country = "US";
    var locale = new Locale(language, country);

    System.out.println(locale.getLanguage());
    System.out.println(locale.getCountry());

    System.out.println(locale.getDisplayLanguage());
    System.out.println(locale.getDisplayCountry());
  }
}
