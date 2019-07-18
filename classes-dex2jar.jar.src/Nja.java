import com.android.billingclient.api.F;
import java.util.List;

public final class nja
{
  private static final nja a = new nja(qja.f, "", 0, null, false);
  public static final nja.a b = new nja.a(null);
  private final qja c;
  private final String d;
  private final int e;
  private final String f;
  private final boolean g;
  
  public nja(qja paramqja, String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    this.c = paramqja;
    this.d = paramString1;
    this.e = paramInt;
    this.f = paramString2;
    this.g = paramBoolean;
  }
  
  public final String a(String paramString)
  {
    oXa.b(paramString, "separator");
    String str1 = this.c.f();
    String str2 = this.d;
    int i = this.e;
    String str3 = this.f;
    if (str3 == null) {
      str3 = "null";
    }
    return gWa.a(new Object[] { str1, str2, Integer.valueOf(i), str3, Boolean.valueOf(this.g) }, paramString, null, null, 0, null, null, 62, null);
  }
  
  public final String b()
  {
    return this.d;
  }
  
  public final String c()
  {
    return this.f;
  }
  
  public final qja d()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof nja))
      {
        paramObject = (nja)paramObject;
        if ((oXa.a(this.c, ((nja)paramObject).c)) && (oXa.a(this.d, ((nja)paramObject).d)))
        {
          int i;
          if (this.e == ((nja)paramObject).e) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.f, ((nja)paramObject).f)))
          {
            if (this.g == ((nja)paramObject).g) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label108;
            }
          }
        }
      }
      return false;
    }
    label108:
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.c;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Enum)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.d;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    int m = this.e;
    localObject = this.f;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    int n = this.g;
    int i1 = n;
    if (n != 0) {
      i1 = 1;
    }
    return (((j * 31 + k) * 31 + m) * 31 + i) * 31 + i1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayStorePurchase([sku]: ");
    localStringBuilder.append(this.c.f());
    localStringBuilder.append(" [orderId]: ");
    localStringBuilder.append(this.d);
    localStringBuilder.append(" [purchaseState]: ");
    localStringBuilder.append(ija.a.b(this.e));
    localStringBuilder.append(" [tokenLen]: ");
    Object localObject = this.f;
    if (localObject != null) {
      localObject = Integer.valueOf(((String)localObject).length());
    } else {
      localObject = null;
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(" [isAcknowledged]: ");
    localStringBuilder.append(this.g);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final nja a()
    {
      return nja.a();
    }
    
    public final nja a(F paramF)
    {
      oXa.b(paramF, "purchase");
      Object localObject = qja.o;
      String str = paramF.f();
      oXa.a(str, "purchase.sku");
      qja localqja = ((qja.a)localObject).a(str);
      str = paramF.a();
      oXa.a(str, "purchase.orderId");
      int i = paramF.c();
      localObject = paramF.d();
      oXa.a(localObject, "purchase.purchaseToken");
      return new nja(localqja, str, i, EPa.b((String)localObject), paramF.g());
    }
    
    public final nja a(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      List localList = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      qja localqja = qja.o.a((String)localList.get(0));
      paramString2 = (String)localList.get(1);
      int i = Integer.parseInt((String)localList.get(2));
      paramString1 = localList.get(3);
      if (!(true ^ oXa.a((String)paramString1, "null"))) {
        paramString1 = null;
      }
      return new nja(localqja, paramString2, i, (String)paramString1, Boolean.parseBoolean((String)localList.get(4)));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */