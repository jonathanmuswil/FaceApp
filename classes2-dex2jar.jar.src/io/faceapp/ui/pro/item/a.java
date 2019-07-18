package io.faceapp.ui.pro.item;

import RJa.a;
import oXa;

public final class a
{
  private final RJa.a a;
  private final Integer b;
  private final int c;
  private final String d;
  private final int e;
  
  public a(RJa.a parama, Integer paramInteger, int paramInt1, String paramString, int paramInt2)
  {
    this.a = parama;
    this.b = paramInteger;
    this.c = paramInt1;
    this.d = paramString;
    this.e = paramInt2;
  }
  
  public final String a()
  {
    return this.d;
  }
  
  public final int b()
  {
    return this.e;
  }
  
  public final Integer c()
  {
    return this.b;
  }
  
  public final int d()
  {
    return this.c;
  }
  
  public final RJa.a e()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)))
        {
          int i;
          if (this.c == ((a)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.d, ((a)paramObject).d)))
          {
            if (this.e == ((a)paramObject).e) {
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
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((RJa.a)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    int k;
    if (localObject != null) {
      k = ((Integer)localObject).hashCode();
    } else {
      k = 0;
    }
    int m = this.c;
    localObject = this.d;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return (((j * 31 + k) * 31 + m) * 31 + i) * 31 + this.e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ProItemModel(proItem=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", periodNumber=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", periodTextRes=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", extraText=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", paymentPeriodRes=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/pro/item/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */