package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;
import java.util.ArrayList;

@yh
public final class wca
{
  private final int a;
  private final int b;
  private final int c;
  private final boolean d;
  private final Jca e;
  private final Tca f;
  private final Object g = new Object();
  private ArrayList<String> h = new ArrayList();
  private ArrayList<String> i = new ArrayList();
  private ArrayList<Hca> j = new ArrayList();
  private int k = 0;
  private int l = 0;
  private int m = 0;
  private int n;
  private String o = "";
  private String p = "";
  private String q = "";
  
  public wca(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramBoolean;
    this.e = new Jca(paramInt4);
    this.f = new Tca(paramInt5, paramInt6, paramInt7);
  }
  
  private final int a(int paramInt1, int paramInt2)
  {
    if (this.d) {
      return this.b;
    }
    return paramInt1 * this.a + paramInt2 * this.b;
  }
  
  private static String a(ArrayList<String> paramArrayList, int paramInt)
  {
    if (paramArrayList.isEmpty()) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i1 = paramArrayList.size();
    paramInt = 0;
    do
    {
      if (paramInt >= i1) {
        break;
      }
      Object localObject = paramArrayList.get(paramInt);
      paramInt++;
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(' ');
    } while (localStringBuilder.length() <= 100);
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    paramArrayList = localStringBuilder.toString();
    if (paramArrayList.length() < 100) {
      return paramArrayList;
    }
    return paramArrayList.substring(0, 100);
  }
  
  private final void c(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if ((paramString != null) && (paramString.length() >= this.c)) {
      synchronized (this.g)
      {
        this.h.add(paramString);
        this.k += paramString.length();
        if (paramBoolean)
        {
          this.i.add(paramString);
          ArrayList localArrayList = this.j;
          paramString = new com/google/android/gms/internal/ads/Hca;
          paramString.<init>(paramFloat1, paramFloat2, paramFloat3, paramFloat4, this.i.size() - 1);
          localArrayList.add(paramString);
        }
        return;
      }
    }
  }
  
  public final int a()
  {
    return this.n;
  }
  
  public final void a(int paramInt)
  {
    this.l = paramInt;
  }
  
  public final void a(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    c(paramString, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    synchronized (this.g)
    {
      if (this.m < 0) {
        Tl.a("ActivityContent: negative number of WebViews.");
      }
      j();
      return;
    }
  }
  
  public final void b(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    c(paramString, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public final boolean b()
  {
    synchronized (this.g)
    {
      boolean bool;
      if (this.m == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public final String c()
  {
    return this.o;
  }
  
  public final String d()
  {
    return this.p;
  }
  
  public final String e()
  {
    return this.q;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof wca)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = ((wca)paramObject).o;
    return (paramObject != null) && (((String)paramObject).equals(this.o));
  }
  
  public final void f()
  {
    synchronized (this.g)
    {
      this.n -= 100;
      return;
    }
  }
  
  public final void g()
  {
    synchronized (this.g)
    {
      this.m -= 1;
      return;
    }
  }
  
  public final void h()
  {
    synchronized (this.g)
    {
      this.m += 1;
      return;
    }
  }
  
  public final int hashCode()
  {
    return this.o.hashCode();
  }
  
  public final void i()
  {
    synchronized (this.g)
    {
      int i1 = a(this.k, this.l);
      if (i1 > this.n) {
        this.n = i1;
      }
      return;
    }
  }
  
  public final void j()
  {
    synchronized (this.g)
    {
      int i1 = a(this.k, this.l);
      if (i1 > this.n)
      {
        this.n = i1;
        if (!k.g().i().f())
        {
          this.o = this.e.a(this.h);
          this.p = this.e.a(this.i);
        }
        if (!k.g().i().b()) {
          this.q = this.f.a(this.i, this.j);
        }
      }
      return;
    }
  }
  
  final int k()
  {
    return this.k;
  }
  
  public final String toString()
  {
    int i1 = this.l;
    int i2 = this.n;
    int i3 = this.k;
    String str1 = a(this.h, 100);
    String str2 = a(this.i, 100);
    String str3 = this.o;
    String str4 = this.p;
    String str5 = this.q;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 165 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
    localStringBuilder.append("ActivityContent fetchId: ");
    localStringBuilder.append(i1);
    localStringBuilder.append(" score:");
    localStringBuilder.append(i2);
    localStringBuilder.append(" total_length:");
    localStringBuilder.append(i3);
    localStringBuilder.append("\n text: ");
    localStringBuilder.append(str1);
    localStringBuilder.append("\n viewableText");
    localStringBuilder.append(str2);
    localStringBuilder.append("\n signture: ");
    localStringBuilder.append(str3);
    localStringBuilder.append("\n viewableSignture: ");
    localStringBuilder.append(str4);
    localStringBuilder.append("\n viewableSignatureForVertical: ");
    localStringBuilder.append(str5);
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */