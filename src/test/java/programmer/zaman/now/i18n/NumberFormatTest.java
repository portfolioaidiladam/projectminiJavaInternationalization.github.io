package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

  // Number Format
  @Test
  void testNumberFormat() {
    var numberFormat = NumberFormat.getInstance();
    var format = numberFormat.format(10000000.255);
    System.out.println(format);
  }

  // I18N di Number Format Indonesia
  @Test
  void testNumberFormatIndonesia() {
    var indonesia = new Locale("in", "ID");
    var numberFormat = NumberFormat.getInstance(indonesia);
    var format = numberFormat.format(10000000.255);
    System.out.println(format);
  }

  // Parsing Menggunakan Number Format Indonesia
  @Test
  void testNumberFormatParseIndonesia() {
    var indonesia = new Locale("in", "ID");
    var numberFormat = NumberFormat.getInstance(indonesia);

    try {
      var result = numberFormat.parse("10.000.000,255").doubleValue();
      System.out.println(result);
    } catch (ParseException e) {
      System.out.println("Error parse : " + e.getMessage());
    }
  }
}
