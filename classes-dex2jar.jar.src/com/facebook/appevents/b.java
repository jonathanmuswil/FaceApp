package com.facebook.appevents;

import com.facebook.FacebookSdk;
import com.facebook.internal.S;
import java.io.Serializable;

class b
  implements Serializable
{
  private final String a;
  private final String b;
  
  public b(com.facebook.b paramb)
  {
    this(paramb.u(), FacebookSdk.e());
  }
  
  public b(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (S.b(paramString1)) {
      str = null;
    }
    this.a = str;
    this.b = paramString2;
  }
  
  private Object writeReplace()
  {
    return new a(this.a, this.b, null);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof b;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (b)paramObject;
    bool1 = bool2;
    if (S.a(((b)paramObject).a, this.a))
    {
      bool1 = bool2;
      if (S.a(((b)paramObject).b, this.b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    String str = this.a;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    str = this.b;
    if (str != null) {
      i = str.hashCode();
    }
    return j ^ i;
  }
  
  static class a
    implements Serializable
  {
    private final String a;
    private final String b;
    
    private a(String paramString1, String paramString2)
    {
      this.a = paramString1;
      this.b = paramString2;
    }
    
    private Object readResolve()
    {
      return new b(this.a, this.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */