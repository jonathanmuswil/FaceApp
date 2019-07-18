import java.util.List;

public final class dka
{
  private static final dka a = new dka("FAKE", "", "", null, null, null);
  public static final dka.a b = new dka.a(null);
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final aka h;
  private final cka i;
  
  public dka(String paramString1, String paramString2, String paramString3, String paramString4, aka paramaka, cka paramcka)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramaka;
    this.i = paramcka;
    paramString1 = new StringBuilder();
    paramString1.append(this.e);
    paramString1.append(' ');
    paramString1.append(this.f);
    paramString1 = paramString1.toString();
    if (paramString1 != null)
    {
      this.c = zYa.d(paramString1).toString();
      return;
    }
    throw new _Va("null cannot be cast to non-null type kotlin.CharSequence");
  }
  
  public final String a(String paramString)
  {
    oXa.b(paramString, "separator");
    String str1 = this.d;
    String str2 = this.e;
    String str3 = this.f;
    String str4 = String.valueOf(this.g);
    Object localObject = this.h;
    String str5 = null;
    if (localObject != null) {
      localObject = ((aka)localObject).a();
    } else {
      localObject = null;
    }
    String str6 = String.valueOf(localObject);
    localObject = this.h;
    if (localObject != null) {
      localObject = ((aka)localObject).c();
    } else {
      localObject = null;
    }
    String str7 = String.valueOf(localObject);
    localObject = this.h;
    if (localObject != null) {
      localObject = ((aka)localObject).b();
    } else {
      localObject = null;
    }
    String str8 = String.valueOf(localObject);
    localObject = this.i;
    if (localObject != null) {
      localObject = ((cka)localObject).a();
    } else {
      localObject = null;
    }
    String str9 = String.valueOf(localObject);
    cka localcka = this.i;
    localObject = str5;
    if (localcka != null) {
      localObject = localcka.b();
    }
    str5 = String.valueOf(localObject);
    localObject = eka.b;
    return gWa.a(new String[] { str1, str2, str3, str4, str6, str7, str8, str9, str5 }, paramString, null, null, 0, null, (cXa)localObject, 30, null);
  }
  
  public final String b()
  {
    return this.g;
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public final aka d()
  {
    return this.h;
  }
  
  public final String e()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof dka))
      {
        paramObject = (dka)paramObject;
        if ((oXa.a(this.d, ((dka)paramObject).d)) && (oXa.a(this.e, ((dka)paramObject).e)) && (oXa.a(this.f, ((dka)paramObject).f)) && (oXa.a(this.g, ((dka)paramObject).g)) && (oXa.a(this.h, ((dka)paramObject).h)) && (oXa.a(this.i, ((dka)paramObject).i))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final String f()
  {
    return this.e;
  }
  
  public final cka g()
  {
    return this.i;
  }
  
  public final String h()
  {
    return this.f;
  }
  
  public int hashCode()
  {
    Object localObject = this.d;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.e;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.f;
    int n;
    if (localObject != null) {
      n = ((String)localObject).hashCode();
    } else {
      n = 0;
    }
    localObject = this.g;
    int i1;
    if (localObject != null) {
      i1 = ((String)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = this.h;
    int i2;
    if (localObject != null) {
      i2 = ((aka)localObject).hashCode();
    } else {
      i2 = 0;
    }
    localObject = this.i;
    if (localObject != null) {
      j = ((cka)localObject).hashCode();
    }
    return ((((k * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + j;
  }
  
  public final boolean i()
  {
    return oXa.a(this, a);
  }
  
  public final boolean j()
  {
    boolean bool;
    if ((this.h == null) && (this.i == null)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean k()
  {
    int j = this.e.length();
    boolean bool = true;
    if (j == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      if (this.f.length() == 0) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        j = 1;
        break label57;
      }
    }
    j = 0;
    label57:
    if ((j == 0) || (!Sra.a.b())) {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("User(id=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", name=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", surname=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", avatarUrl=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", fbInfo=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(", pnInfo=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final dka a()
    {
      return dka.a();
    }
    
    public final dka a(Qea paramQea)
    {
      oXa.b(paramQea, "data");
      String str1 = paramQea.getId();
      String str2 = paramQea.getFirst_name();
      if (str2 == null) {
        str2 = "";
      }
      String str3 = paramQea.getLast_name();
      if (str3 == null) {
        str3 = "";
      }
      String str4 = paramQea.getProfile_pic();
      Object localObject = paramQea.getAccount_fb();
      if (localObject != null) {
        localObject = aka.a.a((Hea)localObject);
      } else {
        localObject = null;
      }
      paramQea = paramQea.getAccount_ak();
      if (paramQea != null) {
        paramQea = cka.a.a(paramQea);
      } else {
        paramQea = null;
      }
      return new dka(str1, str2, str3, str4, (aka)localObject, paramQea);
    }
    
    public final dka a(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      paramString2 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      String str1 = (String)paramString2.get(0);
      String str2 = (String)paramString2.get(1);
      String str3 = (String)paramString2.get(2);
      paramString1 = paramString2.get(3);
      boolean bool = EPa.a((String)paramString1);
      Object localObject = null;
      if (!bool) {
        paramString1 = null;
      }
      String str4 = (String)paramString1;
      paramString1 = paramString2.get(4);
      if (!EPa.a((String)paramString1)) {
        paramString1 = null;
      }
      String str5 = (String)paramString1;
      paramString1 = paramString2.get(5);
      if (!EPa.a((String)paramString1)) {
        paramString1 = null;
      }
      String str6 = (String)paramString1;
      paramString1 = paramString2.get(6);
      if (!EPa.a((String)paramString1)) {
        paramString1 = null;
      }
      String str7 = (String)paramString1;
      paramString1 = paramString2.get(7);
      if (!EPa.a((String)paramString1)) {
        paramString1 = null;
      }
      String str8 = (String)paramString1;
      paramString1 = paramString2.get(8);
      if (!EPa.a((String)paramString1)) {
        paramString1 = null;
      }
      String str9 = (String)paramString1;
      if (str5 != null)
      {
        if ((str6 != null) && (str7 != null)) {
          paramString1 = new aka(str5, str6, str7);
        } else {
          paramString1 = null;
        }
      }
      else {
        paramString1 = null;
      }
      paramString2 = (String)localObject;
      if (str8 != null)
      {
        paramString2 = (String)localObject;
        if (str9 != null) {
          paramString2 = new cka(str8, str9);
        }
      }
      return new dka(str1, str2, str3, str4, paramString1, paramString2);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */