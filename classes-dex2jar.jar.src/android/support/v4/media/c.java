package android.support.v4.media;

import java.util.Arrays;

class c
  implements a
{
  int a = 0;
  int b = 0;
  int c = 0;
  int d = -1;
  
  public int a()
  {
    return this.b;
  }
  
  public int b()
  {
    int i = this.c;
    int j = c();
    int k;
    if (j == 6)
    {
      k = i | 0x4;
    }
    else
    {
      k = i;
      if (j == 7) {
        k = i | 0x1;
      }
    }
    return k & 0x111;
  }
  
  public int c()
  {
    int i = this.d;
    if (i != -1) {
      return i;
    }
    return AudioAttributesCompat.a(false, this.c, this.a);
  }
  
  public int d()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof c;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (c)paramObject;
    bool1 = bool2;
    if (this.b == ((c)paramObject).a())
    {
      bool1 = bool2;
      if (this.c == ((c)paramObject).b())
      {
        bool1 = bool2;
        if (this.a == ((c)paramObject).d())
        {
          bool1 = bool2;
          if (this.d == ((c)paramObject).d) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("AudioAttributesCompat:");
    if (this.d != -1)
    {
      localStringBuilder.append(" stream=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(" derived");
    }
    localStringBuilder.append(" usage=");
    localStringBuilder.append(AudioAttributesCompat.a(this.a));
    localStringBuilder.append(" content=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(" flags=0x");
    localStringBuilder.append(Integer.toHexString(this.c).toUpperCase());
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */