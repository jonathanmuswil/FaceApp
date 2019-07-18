import java.util.Comparator;
import java.util.NoSuchElementException;

public enum qja
{
  private static final qja[] j;
  private static final qja[] k;
  private static final qja[] l;
  private static final qja[] m = { e, h };
  private static final Comparator<qja> n = pja.a;
  public static final qja.a o;
  private final String p;
  
  static
  {
    qja localqja1 = new qja("MONTHLY", 0, "pro_monthly_v3");
    a = localqja1;
    qja localqja2 = new qja("YEARLY", 1, "pro_yearly_v3");
    b = localqja2;
    qja localqja3 = new qja("YEARLY_WITH_TRIAL", 2, "pro_yearly_v3_trial");
    c = localqja3;
    qja localqja4 = new qja("YEARLY_WITH_TRIAL_FROM_ADS", 3, "pro_yearly_v3_trial_from_ads");
    d = localqja4;
    qja localqja5 = new qja("LIFETIME", 4, "pro_onetime");
    e = localqja5;
    Object localObject = new qja("MONTHLY_OLD", 5, "pro_monthly");
    f = (qja)localObject;
    qja localqja6 = new qja("YEARLY_OLD", 6, "pro_yearly");
    g = localqja6;
    qja localqja7 = new qja("LIFETIME_OLD", 7, "pro_version");
    h = localqja7;
    i = new qja[] { localqja1, localqja2, localqja3, localqja4, localqja5, localObject, localqja6, localqja7 };
    o = new qja.a(null);
    j = new qja[] { a, f };
    k = new qja[] { b, c, d, g };
    localObject = new xXa(2);
    ((xXa)localObject).b(j);
    ((xXa)localObject).b(k);
    l = (qja[])((xXa)localObject).a(new qja[((xXa)localObject).a()]);
  }
  
  private qja(String paramString)
  {
    this.p = paramString;
  }
  
  public final String f()
  {
    return this.p;
  }
  
  public final boolean g()
  {
    return gWa.a(m, this);
  }
  
  public final boolean h()
  {
    return gWa.a(j, this);
  }
  
  public final boolean i()
  {
    return gWa.a(l, this);
  }
  
  public final boolean j()
  {
    return gWa.a(k, this);
  }
  
  public static final class a
  {
    public final qja a(String paramString)
    {
      oXa.b(paramString, "sku");
      for (qja localqja : qja.values()) {
        if (oXa.a(localqja.f(), paramString)) {
          return localqja;
        }
      }
      throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
    
    public final qja[] a()
    {
      return qja.a();
    }
    
    public final Comparator<qja> b()
    {
      return qja.b();
    }
    
    public final qja[] c()
    {
      return qja.c();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */