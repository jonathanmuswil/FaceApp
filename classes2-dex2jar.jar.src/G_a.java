import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

class g_a
  extends ThreadLocal<DateFormat>
{
  protected DateFormat initialValue()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
    localSimpleDateFormat.setLenient(false);
    localSimpleDateFormat.setTimeZone(LZa.i);
    return localSimpleDateFormat;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/g_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */