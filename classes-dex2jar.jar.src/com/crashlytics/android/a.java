package com.crashlytics.android;

import Il;
import Il.a;
import Jk;
import Naa;
import Uaa;
import Vaa;
import Yj;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class a
  extends Uaa<Void>
  implements Vaa
{
  public final Yj g;
  public final Jk h;
  public final Il i;
  public final Collection<? extends Uaa> j;
  
  public a()
  {
    this(new Yj(), new Jk(), new Il());
  }
  
  a(Yj paramYj, Jk paramJk, Il paramIl)
  {
    this.g = paramYj;
    this.h = paramJk;
    this.i = paramIl;
    this.j = Collections.unmodifiableCollection(Arrays.asList(new Uaa[] { paramYj, paramJk, paramIl }));
  }
  
  public static void a(int paramInt, String paramString1, String paramString2)
  {
    y();
    x().i.a(paramInt, paramString1, paramString2);
  }
  
  public static void a(String paramString, int paramInt)
  {
    y();
    x().i.a(paramString, paramInt);
  }
  
  public static void a(String paramString, long paramLong)
  {
    y();
    x().i.a(paramString, paramLong);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    y();
    x().i.a(paramString1, paramString2);
  }
  
  public static void a(Throwable paramThrowable)
  {
    y();
    x().i.a(paramThrowable);
  }
  
  public static a x()
  {
    return (a)Naa.a(a.class);
  }
  
  private static void y()
  {
    if (x() != null) {
      return;
    }
    throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
  }
  
  public Collection<? extends Uaa> a()
  {
    return this.j;
  }
  
  protected Void c()
  {
    return null;
  }
  
  public String h()
  {
    return "com.crashlytics.sdk.android:crashlytics";
  }
  
  public String j()
  {
    return "2.9.9.32";
  }
  
  public static class a
  {
    private Yj a;
    private Jk b;
    private Il c;
    private Il.a d;
    
    public a a(Il paramIl)
    {
      if (paramIl != null)
      {
        if (this.c == null)
        {
          this.c = paramIl;
          return this;
        }
        throw new IllegalStateException("CrashlyticsCore Kit already set.");
      }
      throw new NullPointerException("CrashlyticsCore Kit must not be null.");
    }
    
    public a a()
    {
      Il.a locala = this.d;
      if (locala != null) {
        if (this.c == null) {
          this.c = locala.a();
        } else {
          throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
        }
      }
      if (this.a == null) {
        this.a = new Yj();
      }
      if (this.b == null) {
        this.b = new Jk();
      }
      if (this.c == null) {
        this.c = new Il();
      }
      return new a(this.a, this.b, this.c);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/crashlytics/android/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */