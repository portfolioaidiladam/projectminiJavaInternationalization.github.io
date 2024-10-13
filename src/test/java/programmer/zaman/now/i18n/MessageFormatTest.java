package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

  // Membuat MessageFormat
  @Test
  void testMessageFormat() {

    var pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetikkan \"{0}\" di pencarian.";
    var messageFormat = new MessageFormat(pattern);

    var format = messageFormat.format(new Object[]{
        "Aidil"
    });

    System.out.println(format);

  }

  // MessageFormat dan ResourceBundle Indonesia dan US
  @Test
  void testMessageFormatResourceBundle() {
    var locale = new Locale("in", "ID");
    var resourceBundle = ResourceBundle.getBundle("message", locale);

    var pattern = resourceBundle.getString("welcome.message");

    var messageFormat = new MessageFormat(pattern);
    var format = messageFormat.format(new Object[]{
        "Aidil", "Manusia Baik Hati"
    });

    System.out.println(format);
  }
}
