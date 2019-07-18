import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class h_a
{
  private static final ThreadLocal<DateFormat> a = new g_a();
  private static final String[] b = { "EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z" };
  private static final DateFormat[] c = new DateFormat[b.length];
  
  public static String a(Date paramDate)
  {
    return ((DateFormat)a.get()).format(paramDate);
  }
  
  public static Date a(String paramString)
  {
    if (paramString.length() == 0) {
      return null;
    }
    ParsePosition localParsePosition = new ParsePosition(0);
    Object localObject = ((DateFormat)a.get()).parse(paramString, localParsePosition);
    if (localParsePosition.getIndex() == paramString.length()) {
      return (Date)localObject;
    }
    synchronized (b)
    {
      int i = b.length;
      for (int j = 0; j < i; j++)
      {
        DateFormat localDateFormat = c[j];
        localObject = localDateFormat;
        if (localDateFormat == null)
        {
          localObject = new java/text/SimpleDateFormat;
          ((SimpleDateFormat)localObject).<init>(b[j], Locale.US);
          ((DateFormat)localObject).setTimeZone(LZa.i);
          c[j] = localObject;
        }
        localParsePosition.setIndex(0);
        localObject = ((DateFormat)localObject).parse(paramString, localParsePosition);
        if (localParsePosition.getIndex() != 0) {
          return (Date)localObject;
        }
      }
      return null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/h_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */