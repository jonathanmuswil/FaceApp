import android.os.Bundle;
import com.facebook.L;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLogger.a;
import com.facebook.internal.H;
import java.util.Locale;

class jo
{
  private static final String a = "jo";
  private static final long[] b = { 300000L, 900000L, 1800000L, 3600000L, 21600000L, 43200000L, 86400000L, 172800000L, 259200000L, 604800000L, 1209600000L, 1814400000L, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L };
  
  private static int a(long paramLong)
  {
    for (int i = 0;; i++)
    {
      long[] arrayOfLong = b;
      if ((i >= arrayOfLong.length) || (arrayOfLong[i] >= paramLong)) {
        break;
      }
    }
    return i;
  }
  
  private static void a()
  {
    H.a(L.e, a, "Clock skew detected");
  }
  
  public static void a(String paramString1, io paramio, String paramString2)
  {
    Object localObject1 = Long.valueOf(paramio.b() - paramio.e().longValue());
    long l = ((Long)localObject1).longValue();
    Object localObject2 = Long.valueOf(0L);
    if (l < 0L)
    {
      a();
      localObject1 = localObject2;
    }
    Object localObject3 = Long.valueOf(paramio.f());
    Object localObject4 = localObject3;
    if (((Long)localObject3).longValue() < 0L)
    {
      a();
      localObject4 = localObject2;
    }
    localObject3 = new Bundle();
    ((Bundle)localObject3).putInt("fb_mobile_app_interruptions", paramio.c());
    ((Bundle)localObject3).putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] { Integer.valueOf(a(((Long)localObject1).longValue())) }));
    localObject2 = paramio.g();
    if (localObject2 != null) {
      localObject2 = ((lo)localObject2).toString();
    } else {
      localObject2 = "Unclassified";
    }
    ((Bundle)localObject3).putString("fb_mobile_launch_source", (String)localObject2);
    ((Bundle)localObject3).putLong("_logTime", paramio.e().longValue() / 1000L);
    new ho(paramString1, paramString2, null).a("fb_mobile_deactivate_app", ((Long)localObject4).longValue() / 1000L, (Bundle)localObject3);
  }
  
  public static void a(String paramString1, lo paramlo, String paramString2)
  {
    if (paramlo != null) {
      paramlo = paramlo.toString();
    } else {
      paramlo = "Unclassified";
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("fb_mobile_launch_source", paramlo);
    paramString1 = new ho(paramString1, paramString2, null);
    paramString1.a("fb_mobile_activate_app", localBundle);
    if (AppEventsLogger.d() != AppEventsLogger.a.b) {
      paramString1.b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */