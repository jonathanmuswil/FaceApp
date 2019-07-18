package com.google.firebase.components;

import com.google.android.gms.common.internal.t;

public final class q
{
  private final Class<?> a;
  private final int b;
  private final int c;
  
  private q(Class<?> paramClass, int paramInt1, int paramInt2)
  {
    t.a(paramClass, "Null dependency anInterface.");
    this.a = ((Class)paramClass);
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public static q a(Class<?> paramClass)
  {
    return new q(paramClass, 0, 0);
  }
  
  public static q b(Class<?> paramClass)
  {
    return new q(paramClass, 1, 0);
  }
  
  public static q c(Class<?> paramClass)
  {
    return new q(paramClass, 2, 0);
  }
  
  public Class<?> a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    boolean bool;
    if (this.c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean c()
  {
    int i = this.b;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean d()
  {
    boolean bool;
    if (this.b == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof q;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (q)paramObject;
      bool3 = bool2;
      if (this.a == ((q)paramObject).a)
      {
        bool3 = bool2;
        if (this.b == ((q)paramObject).b)
        {
          bool3 = bool2;
          if (this.c == ((q)paramObject).c) {
            bool3 = true;
          }
        }
      }
    }
    return bool3;
  }
  
  public int hashCode()
  {
    return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Dependency{anInterface=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", type=");
    int i = this.b;
    boolean bool = true;
    String str;
    if (i == 1) {
      str = "required";
    } else if (i == 0) {
      str = "optional";
    } else {
      str = "set";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(", direct=");
    if (this.c != 0) {
      bool = false;
    }
    localStringBuilder.append(bool);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */