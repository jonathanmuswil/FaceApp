import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;

class io
{
  private Long a;
  private Long b;
  private int c;
  private Long d;
  private lo e;
  private UUID f;
  
  public io(Long paramLong1, Long paramLong2)
  {
    this(paramLong1, paramLong2, UUID.randomUUID());
  }
  
  public io(Long paramLong1, Long paramLong2, UUID paramUUID)
  {
    this.a = paramLong1;
    this.b = paramLong2;
    this.f = paramUUID;
  }
  
  public static void a()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.d()).edit();
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
    localEditor.remove("com.facebook.appevents.SessionInfo.interruptionCount");
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionId");
    localEditor.apply();
    lo.a();
  }
  
  public static io h()
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.d());
    long l1 = localSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
    long l2 = localSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
    String str = localSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
    if ((l1 != 0L) && (l2 != 0L) && (str != null))
    {
      io localio = new io(Long.valueOf(l1), Long.valueOf(l2));
      localio.c = localSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
      localio.e = lo.b();
      localio.d = Long.valueOf(System.currentTimeMillis());
      localio.f = UUID.fromString(str);
      return localio;
    }
    return null;
  }
  
  public void a(Long paramLong)
  {
    this.b = paramLong;
  }
  
  public long b()
  {
    Long localLong = this.d;
    long l;
    if (localLong == null) {
      l = 0L;
    } else {
      l = localLong.longValue();
    }
    return l;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public UUID d()
  {
    return this.f;
  }
  
  public Long e()
  {
    return this.b;
  }
  
  public long f()
  {
    if (this.a != null)
    {
      Long localLong = this.b;
      if (localLong != null) {
        return localLong.longValue() - this.a.longValue();
      }
    }
    return 0L;
  }
  
  public lo g()
  {
    return this.e;
  }
  
  public void i()
  {
    this.c += 1;
  }
  
  public void j()
  {
    Object localObject = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.d()).edit();
    ((SharedPreferences.Editor)localObject).putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.a.longValue());
    ((SharedPreferences.Editor)localObject).putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.b.longValue());
    ((SharedPreferences.Editor)localObject).putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.c);
    ((SharedPreferences.Editor)localObject).putString("com.facebook.appevents.SessionInfo.sessionId", this.f.toString());
    ((SharedPreferences.Editor)localObject).apply();
    localObject = this.e;
    if (localObject != null) {
      ((lo)localObject).c();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */