import java.util.Arrays;

public final class OBa$a
{
  private final int a;
  private final boolean b;
  private final boolean c;
  private final int[] d;
  
  public OBa$a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt)
  {
    this.a = paramInt;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramArrayOfInt;
  }
  
  public final boolean a()
  {
    return this.c;
  }
  
  public final int[] b()
  {
    return this.d;
  }
  
  public final boolean c()
  {
    return this.b;
  }
  
  public final int d()
  {
    return this.a;
  }
  
  public final int e()
  {
    return this.a - 33984;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.a == ((a)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.c == ((a)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (oXa.a(this.d, ((a)paramObject).d))) {
              break label102;
            }
          }
        }
      }
      return false;
    }
    label102:
    return true;
  }
  
  public int hashCode()
  {
    int i = this.a;
    int j = this.b;
    int k = j;
    int m;
    if (j != 0) {
      m = 1;
    }
    int n = this.c;
    j = n;
    if (n != 0) {
      j = 1;
    }
    int[] arrayOfInt = this.d;
    int i1;
    if (arrayOfInt != null) {
      i1 = Arrays.hashCode(arrayOfInt);
    } else {
      i1 = 0;
    }
    return ((i * 31 + m) * 31 + j) * 31 + i1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TexInfo(texUnit=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", tileable=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", nearest=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", texNames=");
    localStringBuilder.append(Arrays.toString(this.d));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/OBa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */