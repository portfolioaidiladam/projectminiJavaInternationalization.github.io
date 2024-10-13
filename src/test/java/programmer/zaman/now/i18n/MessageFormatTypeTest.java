package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

  // Message Format Type Indonesia
  @Test
  void testMessageFormatType() {
    var locale = new Locale("in", "ID");
    var resourceBundle = ResourceBundle.getBundle("message", locale);

    var pattern = resourceBundle.getString("status");

    var messageFormat = new MessageFormat(pattern, locale);
    var format = messageFormat.format(new Object[]{
        "Aidil", new Date(), 1000000
    });

    System.out.println(format);
  }

  // Message Format Type US
  @Test
  void testMessageFormatTypeAmerica() {
    var locale = new Locale("en", "US");
    var resourceBundle = ResourceBundle.getBundle("message", locale);

    var pattern = resourceBundle.getString("status");

    var messageFormat = new MessageFormat(pattern, locale);
    var format = messageFormat.format(new Object[]{
        "Aidil", new Date(), 1000000
    });

    System.out.println(format);
  }
}
