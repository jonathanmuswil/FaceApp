import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class kka
  implements ska
{
  public static final Parcelable.Creator CREATOR = new kka.b();
  public static final kka.a a = new kka.a(null);
  private final String b;
  private final String c;
  private final boolean d;
  private final VOa e;
  private final boolean f;
  private final String g;
  private final String h;
  private final String i;
  private final String j;
  
  public kka(String paramString1, String paramString2, boolean paramBoolean1, VOa paramVOa, boolean paramBoolean2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean1;
    this.e = paramVOa;
    this.f = paramBoolean2;
    this.g = paramString3;
    this.h = paramString4;
    this.i = paramString5;
    this.j = paramString6;
  }
  
  public final String a()
  {
    return Nra.c.a(this.g);
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final VOa c()
  {
    return this.e;
  }
  
  public final String d()
  {
    return Nra.c.a(this.h);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String e()
  {
    String str = this.i;
    if (str != null) {
      str = Nra.c.a(str);
    } else {
      str = null;
    }
    return str;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof kka))
      {
        paramObject = (kka)paramObject;
        if ((oXa.a(this.b, ((kka)paramObject).b)) && (oXa.a(this.c, ((kka)paramObject).c)))
        {
          int k;
          if (this.d == ((kka)paramObject).d) {
            k = 1;
          } else {
            k = 0;
          }
          if ((k != 0) && (oXa.a(this.e, ((kka)paramObject).e)))
          {
            if (this.f == ((kka)paramObject).f) {
              k = 1;
            } else {
              k = 0;
            }
            if ((k != 0) && (oXa.a(this.g, ((kka)paramObject).g)) && (oXa.a(this.h, ((kka)paramObject).h)) && (oXa.a(this.i, ((kka)paramObject).i)) && (oXa.a(this.j, ((kka)paramObject).j))) {
              break label164;
            }
          }
        }
      }
      return false;
    }
    label164:
    return true;
  }
  
  public final String f()
  {
    String str = this.j;
    if (str != null) {
      str = Nra.c.a(str);
    } else {
      str = null;
    }
    return str;
  }
  
  public final String g()
  {
    return this.c;
  }
  
  public final boolean h()
  {
    return this.f;
  }
  
  public int hashCode()
  {
    Object localObject = this.b;
    int k = 0;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.c;
    int n;
    if (localObject != null) {
      n = ((String)localObject).hashCode();
    } else {
      n = 0;
    }
    int i1 = this.d;
    int i3 = i1;
    if (i1 != 0) {
      i3 = 1;
    }
    localObject = this.e;
    int i2;
    if (localObject != null) {
      i2 = ((Enum)localObject).hashCode();
    } else {
      i2 = 0;
    }
    int i4 = this.f;
    int i6 = i4;
    if (i4 != 0) {
      i6 = 1;
    }
    localObject = this.g;
    int i5;
    if (localObject != null) {
      i5 = ((String)localObject).hashCode();
    } else {
      i5 = 0;
    }
    localObject = this.h;
    int i7;
    if (localObject != null) {
      i7 = ((String)localObject).hashCode();
    } else {
      i7 = 0;
    }
    localObject = this.i;
    int i8;
    if (localObject != null) {
      i8 = ((String)localObject).hashCode();
    } else {
      i8 = 0;
    }
    localObject = this.j;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    }
    return (((((((m * 31 + n) * 31 + i3) * 31 + i2) * 31 + i6) * 31 + i5) * 31 + i7) * 31 + i8) * 31 + k;
  }
  
  public final boolean i()
  {
    return this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("BackgroundInfo(id=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", title=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", isPaid=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", imageGender=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", withShadow=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", iconUrl=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", imageUrl=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(", previewUrl0=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(", previewUrl1=");
    localStringBuilder.append(this.j);
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
    paramParcel.writeInt(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.j);
  }
  
  public static final class a
  {
    public final kka a(VY paramVY)
    {
      oXa.b(paramVY, "data");
      String str1 = paramVY.l();
      oXa.a(str1, "data.id");
      String str2 = paramVY.r();
      oXa.a(str2, "data.title");
      boolean bool1 = paramVY.n();
      Object localObject1;
      Object localObject2;
      if (paramVY.s())
      {
        localObject1 = VOa.e;
        localObject2 = paramVY.o();
        oXa.a(localObject2, "data.preview");
        localObject2 = ((daa)localObject2).m();
        oXa.a(localObject2, "data.preview.gender");
        localObject1 = ((VOa.a)localObject1).a((OZ)localObject2);
      }
      else
      {
        localObject1 = VOa.a;
      }
      boolean bool2 = paramVY.p();
      String str3 = paramVY.q();
      oXa.a(str3, "data.thumbUrl");
      String str4 = paramVY.m();
      oXa.a(str4, "data.imageUrl");
      boolean bool3 = paramVY.s();
      String str5 = null;
      if (bool3)
      {
        localObject2 = paramVY.o();
        oXa.a(localObject2, "data.preview");
        localObject2 = ((daa)localObject2).l();
      }
      else
      {
        localObject2 = null;
      }
      if (paramVY.s())
      {
        paramVY = paramVY.o();
        oXa.a(paramVY, "data.preview");
        paramVY = paramVY.n();
        oXa.a(paramVY, "data.preview.second");
        str5 = EPa.b(paramVY);
      }
      return new kka(str1, str2, bool1, (VOa)localObject1, bool2, str3, str4, (String)localObject2, str5);
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
      boolean bool1;
      if (paramParcel.readInt() != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      VOa localVOa = (VOa)Enum.valueOf(VOa.class, paramParcel.readString());
      boolean bool2;
      if (paramParcel.readInt() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      return new kka(str1, str2, bool1, localVOa, bool2, paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new kka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */