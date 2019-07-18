package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class ca
{
  public static Bundle a(Notification paramNotification)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19) {
      return paramNotification.extras;
    }
    if (i >= 16) {
      return ea.a(paramNotification);
    }
    return null;
  }
  
  public static class a
  {
    final Bundle a;
    private final ga[] b;
    private final ga[] c;
    private boolean d;
    boolean e = true;
    private final int f;
    public int g;
    public CharSequence h;
    public PendingIntent i;
    
    public a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this(paramInt, paramCharSequence, paramPendingIntent, new Bundle(), null, null, true, 0, true);
    }
    
    a(int paramInt1, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, ga[] paramArrayOfga1, ga[] paramArrayOfga2, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
    {
      this.g = paramInt1;
      this.h = ca.c.a(paramCharSequence);
      this.i = paramPendingIntent;
      if (paramBundle == null) {
        paramBundle = new Bundle();
      }
      this.a = paramBundle;
      this.b = paramArrayOfga1;
      this.c = paramArrayOfga2;
      this.d = paramBoolean1;
      this.f = paramInt2;
      this.e = paramBoolean2;
    }
    
    public PendingIntent a()
    {
      return this.i;
    }
    
    public boolean b()
    {
      return this.d;
    }
    
    public ga[] c()
    {
      return this.c;
    }
    
    public Bundle d()
    {
      return this.a;
    }
    
    public int e()
    {
      return this.g;
    }
    
    public ga[] f()
    {
      return this.b;
    }
    
    public int g()
    {
      return this.f;
    }
    
    public boolean h()
    {
      return this.e;
    }
    
    public CharSequence i()
    {
      return this.h;
    }
  }
  
  public static class b
    extends ca.d
  {
    private CharSequence e;
    
    public b a(CharSequence paramCharSequence)
    {
      this.e = ca.c.a(paramCharSequence);
      return this;
    }
    
    public void a(ba paramba)
    {
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramba = new Notification.BigTextStyle(paramba.a()).setBigContentTitle(this.b).bigText(this.e);
        if (this.d) {
          paramba.setSummaryText(this.c);
        }
      }
    }
  }
  
  public static class c
  {
    String A;
    Bundle B;
    int C = 0;
    int D = 0;
    Notification E;
    RemoteViews F;
    RemoteViews G;
    RemoteViews H;
    String I;
    int J = 0;
    String K;
    long L;
    int M = 0;
    Notification N = new Notification();
    @Deprecated
    public ArrayList<String> O;
    public Context a;
    public ArrayList<ca.a> b = new ArrayList();
    ArrayList<ca.a> c = new ArrayList();
    CharSequence d;
    CharSequence e;
    PendingIntent f;
    PendingIntent g;
    RemoteViews h;
    Bitmap i;
    CharSequence j;
    int k;
    int l;
    boolean m = true;
    boolean n;
    ca.d o;
    CharSequence p;
    CharSequence[] q;
    int r;
    int s;
    boolean t;
    String u;
    boolean v;
    String w;
    boolean x = false;
    boolean y;
    boolean z;
    
    @Deprecated
    public c(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public c(Context paramContext, String paramString)
    {
      this.a = paramContext;
      this.I = paramString;
      this.N.when = System.currentTimeMillis();
      this.N.audioStreamType = -1;
      this.l = 0;
      this.O = new ArrayList();
    }
    
    protected static CharSequence a(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {
        return paramCharSequence;
      }
      CharSequence localCharSequence = paramCharSequence;
      if (paramCharSequence.length() > 5120) {
        localCharSequence = paramCharSequence.subSequence(0, 5120);
      }
      return localCharSequence;
    }
    
    private void a(int paramInt, boolean paramBoolean)
    {
      Notification localNotification;
      if (paramBoolean)
      {
        localNotification = this.N;
        localNotification.flags = (paramInt | localNotification.flags);
      }
      else
      {
        localNotification = this.N;
        localNotification.flags = (paramInt & localNotification.flags);
      }
    }
    
    public Notification a()
    {
      return new da(this).b();
    }
    
    public c a(int paramInt)
    {
      this.C = paramInt;
      return this;
    }
    
    public c a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this.b.add(new ca.a(paramInt, paramCharSequence, paramPendingIntent));
      return this;
    }
    
    public c a(long paramLong)
    {
      this.N.when = paramLong;
      return this;
    }
    
    public c a(PendingIntent paramPendingIntent)
    {
      this.f = paramPendingIntent;
      return this;
    }
    
    public c a(Uri paramUri)
    {
      Notification localNotification = this.N;
      localNotification.sound = paramUri;
      localNotification.audioStreamType = -1;
      if (Build.VERSION.SDK_INT >= 21) {
        localNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
      }
      return this;
    }
    
    public c a(ca.d paramd)
    {
      if (this.o != paramd)
      {
        this.o = paramd;
        paramd = this.o;
        if (paramd != null) {
          paramd.a(this);
        }
      }
      return this;
    }
    
    public c a(String paramString)
    {
      this.I = paramString;
      return this;
    }
    
    public c a(boolean paramBoolean)
    {
      a(16, paramBoolean);
      return this;
    }
    
    public Bundle b()
    {
      if (this.B == null) {
        this.B = new Bundle();
      }
      return this.B;
    }
    
    public c b(int paramInt)
    {
      this.l = paramInt;
      return this;
    }
    
    public c b(PendingIntent paramPendingIntent)
    {
      this.N.deleteIntent = paramPendingIntent;
      return this;
    }
    
    public c b(CharSequence paramCharSequence)
    {
      this.e = a(paramCharSequence);
      return this;
    }
    
    public c b(boolean paramBoolean)
    {
      this.x = paramBoolean;
      return this;
    }
    
    public c c(int paramInt)
    {
      this.N.icon = paramInt;
      return this;
    }
    
    public c c(CharSequence paramCharSequence)
    {
      this.d = a(paramCharSequence);
      return this;
    }
    
    public c d(CharSequence paramCharSequence)
    {
      this.N.tickerText = a(paramCharSequence);
      return this;
    }
  }
  
  public static abstract class d
  {
    protected ca.c a;
    CharSequence b;
    CharSequence c;
    boolean d = false;
    
    public void a(Bundle paramBundle) {}
    
    public abstract void a(ba paramba);
    
    public void a(ca.c paramc)
    {
      if (this.a != paramc)
      {
        this.a = paramc;
        paramc = this.a;
        if (paramc != null) {
          paramc.a(this);
        }
      }
    }
    
    public RemoteViews b(ba paramba)
    {
      return null;
    }
    
    public RemoteViews c(ba paramba)
    {
      return null;
    }
    
    public RemoteViews d(ba paramba)
    {
      return null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */