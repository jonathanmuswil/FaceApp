import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class tka
  implements ska
{
  public static final Parcelable.Creator CREATOR = new tka.b();
  public static final tka.a a = new tka.a(null);
  private final String b;
  private final String c;
  private final boolean d;
  private final VOa e;
  private final String f;
  private final String g;
  
  public tka(String paramString1, String paramString2, boolean paramBoolean, VOa paramVOa, String paramString3, String paramString4)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
    this.e = paramVOa;
    this.f = paramString3;
    this.g = paramString4;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final VOa b()
  {
    return this.e;
  }
  
  public final String c()
  {
    String str = this.f;
    if (str != null) {
      str = Nra.c.a(str);
    } else {
      str = null;
    }
    return str;
  }
  
  public final String d()
  {
    String str = this.g;
    if (str != null) {
      str = Nra.c.a(str);
    } else {
      str = null;
    }
    return str;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String e()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof tka))
      {
        paramObject = (tka)paramObject;
        if ((oXa.a(this.b, ((tka)paramObject).b)) && (oXa.a(this.c, ((tka)paramObject).c)))
        {
          int i;
          if (this.d == ((tka)paramObject).d) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.e, ((tka)paramObject).e)) && (oXa.a(this.f, ((tka)paramObject).f)) && (oXa.a(this.g, ((tka)paramObject).g))) {
            break label114;
          }
        }
      }
      return false;
    }
    label114:
    return true;
  }
  
  public final boolean f()
  {
    return this.d;
  }
  
  public int hashCode()
  {
    Object localObject = this.b;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.c;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    int m = this.d;
    int i1 = m;
    if (m != 0) {
      i1 = 1;
    }
    localObject = this.e;
    int n;
    if (localObject != null) {
      n = ((Enum)localObject).hashCode();
    } else {
      n = 0;
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
      i = ((String)localObject).hashCode();
    }
    return ((((j * 31 + k) * 31 + i1) * 31 + n) * 31 + i2) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EffectInfo(id=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", title=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", isPaid=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", imageGender=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", previewUrl0=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", previewUrl1=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeString(this.e.name());
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
  }
  
  public static final class a
  {
    public final tka a(oaa paramoaa)
    {
      oXa.b(paramoaa, "data");
      String str1 = paramoaa.l();
      oXa.a(str1, "data.id");
      String str2 = paramoaa.o();
      oXa.a(str2, "data.title");
      boolean bool1 = paramoaa.m();
      Object localObject1;
      Object localObject2;
      if (paramoaa.p())
      {
        localObject1 = VOa.e;
        localObject2 = paramoaa.n();
        oXa.a(localObject2, "data.preview");
        localObject2 = ((daa)localObject2).m();
        oXa.a(localObject2, "data.preview.gender");
        localObject1 = ((VOa.a)localObject1).a((OZ)localObject2);
      }
      else
      {
        localObject1 = VOa.a;
      }
      boolean bool2 = paramoaa.p();
      String str3 = null;
      if (bool2)
      {
        localObject2 = paramoaa.n();
        oXa.a(localObject2, "data.preview");
        localObject2 = ((daa)localObject2).l();
      }
      else
      {
        localObject2 = null;
      }
      if (paramoaa.p())
      {
        paramoaa = paramoaa.n();
        oXa.a(paramoaa, "data.preview");
        paramoaa = paramoaa.n();
        oXa.a(paramoaa, "data.preview.second");
        str3 = EPa.b(paramoaa);
      }
      return new tka(str1, str2, bool1, (VOa)localObject1, (String)localObject2, str3);
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return new tka(str1, str2, bool, (VOa)Enum.valueOf(VOa.class, paramParcel.readString()), paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new tka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */