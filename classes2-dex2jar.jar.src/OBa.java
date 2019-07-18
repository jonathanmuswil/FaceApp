import android.os.Bundle;

public final class oBa
{
  private final int a;
  private final Bundle b;
  private final _Aa c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  
  public oBa(int paramInt, Bundle paramBundle, _Aa param_Aa, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramInt;
    this.b = paramBundle;
    this.c = param_Aa;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
  }
  
  public final Bundle a()
  {
    return this.b;
  }
  
  public final oBa a(int paramInt, Bundle paramBundle, _Aa param_Aa, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    oXa.b(paramBundle, "config");
    oXa.b(param_Aa, "source");
    oXa.b(paramString1, "trimapToken");
    oXa.b(paramString2, "depthToken");
    oXa.b(paramString3, "facepointsToken");
    oXa.b(paramString4, "hairmaskToken");
    return new oBa(paramInt, paramBundle, param_Aa, paramString1, paramString2, paramString3, paramString4);
  }
  
  public final String b()
  {
    return this.e;
  }
  
  public final String c()
  {
    return this.f;
  }
  
  public final String d()
  {
    return this.g;
  }
  
  public final int e()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof oBa))
      {
        paramObject = (oBa)paramObject;
        int i;
        if (this.a == ((oBa)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.b, ((oBa)paramObject).b)) && (oXa.a(this.c, ((oBa)paramObject).c)) && (oXa.a(this.d, ((oBa)paramObject).d)) && (oXa.a(this.e, ((oBa)paramObject).e)) && (oXa.a(this.f, ((oBa)paramObject).f)) && (oXa.a(this.g, ((oBa)paramObject).g))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final _Aa f()
  {
    return this.c;
  }
  
  public final String g()
  {
    return this.d;
  }
  
  public int hashCode()
  {
    int i = this.a;
    Object localObject = this.b;
    int j = 0;
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    localObject = this.c;
    int m;
    if (localObject != null) {
      m = localObject.hashCode();
    } else {
      m = 0;
    }
    localObject = this.d;
    int n;
    if (localObject != null) {
      n = ((String)localObject).hashCode();
    } else {
      n = 0;
    }
    localObject = this.e;
    int i1;
    if (localObject != null) {
      i1 = ((String)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = this.f;
    int i2;
    if (localObject != null) {
      i2 = ((String)localObject).hashCode();
    } else {
      i2 = 0;
    }
    localObject = this.g;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    }
    return (((((i * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ProcessingConfig(inputCode=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", config=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", source=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", trimapToken=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", depthToken=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", facepointsToken=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", hairmaskToken=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */