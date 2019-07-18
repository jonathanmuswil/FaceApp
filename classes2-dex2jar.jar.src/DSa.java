import android.annotation.SuppressLint;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class dsa
{
  public static final dsa a = new dsa();
  
  private final String a(String paramString)
  {
    if (paramString != null)
    {
      String str = zYa.d(paramString).toString();
      paramString = str;
      if (str.length() > 2000) {
        if (str != null)
        {
          paramString = str.substring(0, 2000);
          oXa.a(paramString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        else
        {
          throw new _Va("null cannot be cast to non-null type java.lang.String");
        }
      }
      return paramString;
    }
    throw new _Va("null cannot be cast to non-null type kotlin.CharSequence");
  }
  
  @SuppressLint({"CheckResult"})
  private final void b(int paramInt, String paramString)
  {
    paramString = new zfa(paramInt, paramString, null, 0, 0, 28, null);
    RPa.a(doa.c.a(paramString)).a(esa.a, fsa.a);
  }
  
  private final String f()
  {
    Object localObject1 = Uma.qa.ea().get();
    oXa.a(localObject1, "AppPreferences.rateUsState.get()");
    dsa.a locala = (dsa.a)localObject1;
    if (!locala.b()) {
      return "Dont show again";
    }
    long l = locala.f();
    Object localObject2 = null;
    localObject1 = null;
    if (l == 0L) {
      return null;
    }
    Integer localInteger = locala.e();
    if ((localInteger != null) && (localInteger.intValue() == 5)) {
      return "Already 5 stars";
    }
    if (locala.c() >= 3) {
      return "3+ dismisses";
    }
    localInteger = locala.e();
    int i = 0;
    int j = 0;
    if (localInteger != null)
    {
      i = j;
      if (System.currentTimeMillis() - locala.f() >= TimeUnit.DAYS.toMillis(30L)) {
        i = 1;
      }
      if (i == 0) {
        localObject1 = "Too early after already rated";
      }
      return (String)localObject1;
    }
    if (locala.c() > 0)
    {
      l = System.currentTimeMillis() - locala.f();
      j = locala.c();
      if (j != 1 ? (j != 2) && ((l < TimeUnit.DAYS.toMillis(14L)) || (locala.d() < 10)) : (l >= TimeUnit.DAYS.toMillis(7L)) || (locala.d() >= 3)) {
        i = 1;
      }
      if (i != 0) {
        localObject1 = localObject2;
      } else {
        localObject1 = "Too early after last dismiss";
      }
      return (String)localObject1;
    }
    return "Unknown";
  }
  
  public final void a()
  {
    icb.a("RateUsHelper").a("neverShowAgain", new Object[0]);
    Object localObject = Uma.qa.ea().get();
    oXa.a(localObject, "AppPreferences.rateUsState.get()");
    localObject = dsa.a.a((dsa.a)localObject, 0L, null, null, 0, 0, false, 31, null);
    Uma.qa.ea().set(localObject);
  }
  
  public final void a(int paramInt, String paramString)
  {
    oXa.b(paramString, "feedback");
    paramString = a(paramString);
    icb.a locala = icb.a("RateUsHelper");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("onDialogFinished [rating]: ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" [feedback]: ");
    ((StringBuilder)localObject).append(paramString);
    locala.a(((StringBuilder)localObject).toString(), new Object[0]);
    localObject = Uma.qa.ea().get();
    oXa.a(localObject, "AppPreferences.rateUsState.get()");
    localObject = dsa.a.a((dsa.a)localObject, 0L, Integer.valueOf(paramInt), paramString, 0, 0, false, 33, null);
    Uma.qa.ea().set(localObject);
    b(paramInt, paramString);
  }
  
  public final void b()
  {
    icb.a("RateUsHelper").a("onDialogDismissed", new Object[0]);
    Object localObject = Uma.qa.ea().get();
    oXa.a(localObject, "AppPreferences.rateUsState.get()");
    localObject = (dsa.a)localObject;
    if (((dsa.a)localObject).e() != null) {
      localObject = dsa.a.a((dsa.a)localObject, 0L, null, null, 0, 0, false, 31, null);
    } else {
      localObject = new dsa.a(((dsa.a)localObject).f(), null, "", ((dsa.a)localObject).c() + 1, 0, ((dsa.a)localObject).b());
    }
    Uma.qa.ea().set(localObject);
  }
  
  public final void c()
  {
    icb.a("RateUsHelper").a("onDialogShown", new Object[0]);
    Object localObject = Uma.qa.ea().get();
    oXa.a(localObject, "AppPreferences.rateUsState.get()");
    localObject = dsa.a.a((dsa.a)localObject, System.currentTimeMillis(), null, null, 0, 0, false, 62, null);
    Uma.qa.ea().set(localObject);
  }
  
  public final void d()
  {
    icb.a("RateUsHelper").a("onImageSaved", new Object[0]);
    Object localObject = Uma.qa.ea().get();
    oXa.a(localObject, "AppPreferences.rateUsState.get()");
    localObject = (dsa.a)localObject;
    localObject = dsa.a.a((dsa.a)localObject, 0L, null, null, 0, ((dsa.a)localObject).d() + 1, false, 47, null);
    Uma.qa.ea().set(localObject);
  }
  
  public final boolean e()
  {
    String str = f();
    if (str != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("false - ");
      ((StringBuilder)localObject).append(str);
      localObject = ((StringBuilder)localObject).toString();
      if (localObject != null) {}
    }
    else
    {
      localObject = "true";
    }
    icb.a locala = icb.a("RateUsHelper");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("shouldShowDialog: ");
    localStringBuilder.append((String)localObject);
    Object localObject = localStringBuilder.toString();
    boolean bool = false;
    locala.a((String)localObject, new Object[0]);
    if (str == null) {
      bool = true;
    }
    return bool;
  }
  
  public static final class a
  {
    private static final a a = new a(0L, null, "", 0, 0, true);
    public static final dsa.a.a b = new dsa.a.a(null);
    private final long c;
    private final Integer d;
    private final String e;
    private final int f;
    private final int g;
    private final boolean h;
    
    public a(long paramLong, Integer paramInteger, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.c = paramLong;
      this.d = paramInteger;
      this.e = paramString;
      this.f = paramInt1;
      this.g = paramInt2;
      this.h = paramBoolean;
    }
    
    public final a a(long paramLong, Integer paramInteger, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      oXa.b(paramString, "lastFeedback");
      return new a(paramLong, paramInteger, paramString, paramInt1, paramInt2, paramBoolean);
    }
    
    public final String a(String paramString)
    {
      oXa.b(paramString, "separator");
      long l = this.c;
      Integer localInteger = this.d;
      if (localInteger == null) {
        localInteger = Integer.valueOf(0);
      }
      return mWa.a(mWa.b(new Object[] { Long.valueOf(l), localInteger, this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h) }), paramString, null, null, 0, null, null, 62, null);
    }
    
    public final boolean b()
    {
      return this.h;
    }
    
    public final int c()
    {
      return this.f;
    }
    
    public final int d()
    {
      return this.g;
    }
    
    public final Integer e()
    {
      return this.d;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          int i;
          if (this.c == ((a)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e)))
          {
            if (this.f == ((a)paramObject).f) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              if (this.g == ((a)paramObject).g) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                if (this.h == ((a)paramObject).h) {
                  i = 1;
                } else {
                  i = 0;
                }
                if (i != 0) {
                  break label139;
                }
              }
            }
          }
        }
        return false;
      }
      label139:
      return true;
    }
    
    public final long f()
    {
      return this.c;
    }
    
    public int hashCode()
    {
      long l = this.c;
      int i = (int)(l ^ l >>> 32);
      Object localObject = this.d;
      int j = 0;
      int k;
      if (localObject != null) {
        k = ((Integer)localObject).hashCode();
      } else {
        k = 0;
      }
      localObject = this.e;
      if (localObject != null) {
        j = ((String)localObject).hashCode();
      }
      int m = this.f;
      int n = this.g;
      int i1 = this.h;
      int i2 = i1;
      if (i1 != 0) {
        i2 = 1;
      }
      return ((((i * 31 + k) * 31 + j) * 31 + m) * 31 + n) * 31 + i2;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("State(lastShownTimestamp=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", lastRating=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", lastFeedback=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", dismissCount=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", imageSavingsAfterDismiss=");
      localStringBuilder.append(this.g);
      localStringBuilder.append(", canShow=");
      localStringBuilder.append(this.h);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
    
    public static final class a
    {
      public final dsa.a a()
      {
        return dsa.a.a();
      }
      
      public final dsa.a a(String paramString1, String paramString2)
      {
        oXa.b(paramString1, "serialized");
        oXa.b(paramString2, "separator");
        int i = 1;
        paramString2 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
        long l = Long.parseLong((String)paramString2.get(0));
        paramString1 = Integer.valueOf(Integer.parseInt((String)paramString2.get(1)));
        if (paramString1.intValue() <= 0) {
          i = 0;
        }
        if (i == 0) {
          paramString1 = null;
        }
        return new dsa.a(l, paramString1, (String)paramString2.get(2), Integer.parseInt((String)paramString2.get(3)), Integer.parseInt((String)paramString2.get(4)), Boolean.parseBoolean((String)paramString2.get(5)));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */