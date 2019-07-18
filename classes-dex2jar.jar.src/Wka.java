public final class wka
{
  public static final wka.a a = new wka.a(null);
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  
  public wka(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
  }
  
  public final String a()
  {
    return this.c;
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final String c()
  {
    return this.e;
  }
  
  public final String d()
  {
    return this.f;
  }
  
  public final String e()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof wka))
      {
        paramObject = (wka)paramObject;
        if ((oXa.a(this.b, ((wka)paramObject).b)) && (oXa.a(this.c, ((wka)paramObject).c)) && (oXa.a(this.d, ((wka)paramObject).d)) && (oXa.a(this.e, ((wka)paramObject).e)) && (oXa.a(this.f, ((wka)paramObject).f))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    String str = this.b;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.c;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.d;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = this.e;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = this.f;
    if (str != null) {
      i = str.hashCode();
    }
    return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FaceCursors(faceId=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", depthMap=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", triMap=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", facePoints=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", hairMask=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final wka a(XY paramXY)
    {
      oXa.b(paramXY, "proto");
      String str1 = paramXY.m();
      oXa.a(str1, "proto.faceId");
      String str2 = paramXY.l();
      oXa.a(str2, "proto.depthMap");
      String str3 = paramXY.p();
      oXa.a(str3, "proto.triMap");
      String str4 = paramXY.n();
      oXa.a(str4, "proto.facePoints");
      paramXY = paramXY.o();
      oXa.a(paramXY, "proto.hairMask");
      return new wka(str1, str2, str3, str4, paramXY);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */