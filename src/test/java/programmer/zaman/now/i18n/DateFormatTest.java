package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

  // Format menggunakan Date Format
  @Test
  void testDateFormat() {
    var pattern = "EEEE dd MMMM yyyy";
    var dateFormat = new SimpleDateFormat(pattern);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  // 18N di Date Format
  @Test
  void testDateFormatIndonesia() {
    var pattern = "EEEE dd MMMM yyyy";
    var indonesia = new Locale("in", "ID");
    var dateFormat = new SimpleDateFormat(pattern, indonesia);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  // 18N di Date Format Jepang
  @Test
  void testDateFormatJapan() {
    var pattern = "EEEE dd MMMM yyyy";
    var japan = new Locale("ja", "JP");
    var dateFormat = new SimpleDateFormat(pattern, japan);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  // Parsing menggunakan Date Format Indonesia
  @Test
  void testDateFormatParseIndonesia() {
    var pattern = "EEEE dd MMMM yyyy";
    var indonesia = new Locale("in", "ID");
    var dateFormat = new SimpleDateFormat(pattern, indonesia);

    try {
      var date = dateFormat.parse("Rabu 03 Maret 2021");
      System.out.println(date);
    } catch (ParseException e) {
      System.out.println("Error parse : " + e.getMessage());
    }
  }

  // Parsing menggunakan Date Format Jepang
  @Test
  void testDateFormatParseJapan() {
    var pattern = "EEEE dd MMMM yyyy";
    var japan = new Locale("ja", "JP");
    var dateFormat = new SimpleDateFormat(pattern, japan);

    try {
      var date = dateFormat.parse("水曜日 03 3月 2021");
      System.out.println(date);
    } catch (ParseException e) {
      System.out.println("Error parse : " + e.getMessage());
    }
  }
}
