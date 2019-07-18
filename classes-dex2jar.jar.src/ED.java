import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

public final class ed
{
  private static final Locale a = new Locale("", "");
  
  public static int a(Locale paramLocale)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return TextUtils.getLayoutDirectionFromLocale(paramLocale);
    }
    if ((paramLocale != null) && (!paramLocale.equals(a)))
    {
      String str = ad.a(paramLocale);
      if (str == null) {
        return b(paramLocale);
      }
      if ((str.equalsIgnoreCase("Arab")) || (str.equalsIgnoreCase("Hebr"))) {
        return 1;
      }
    }
    return 0;
  }
  
  private static int b(Locale paramLocale)
  {
    int i = Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0));
    if ((i != 1) && (i != 2)) {
      return 0;
    }
    return 1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */