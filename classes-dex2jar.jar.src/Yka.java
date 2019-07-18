import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class yka
  implements Dka
{
  public static final Parcelable.Creator CREATOR = new yka.b();
  public static final yka.a a = new yka.a(null);
  private final String b;
  private final String c;
  private final boolean d;
  private final String e;
  private final VOa f;
  private final String g;
  private final String h;
  private final String i;
  
  public yka(String paramString1, String paramString2, boolean paramBoolean, String paramString3, VOa paramVOa, String paramString4, String paramString5, String paramString6)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
    this.e = paramString3;
    this.f = paramVOa;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
  }
  
  public final String a()
  {
    return Nra.c.a(this.g);
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public final boolean d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof yka))
      {
        paramObject = (yka)paramObject;
        if ((oXa.a(this.b, ((yka)paramObject).b)) && (oXa.a(this.c, ((yka)paramObject).c)))
        {
          int j;
          if (this.d == ((yka)paramObject).d) {
            j = 1;
          } else {
            j = 0;
          }
          if ((j != 0) && (oXa.a(this.e, ((yka)paramObject).e)) && (oXa.a(this.f, ((yka)paramObject).f)) && (oXa.a(this.g, ((yka)paramObject).g)) && (oXa.a(this.h, ((yka)paramObject).h)) && (oXa.a(this.i, ((yka)paramObject).i))) {
            break label142;
          }
        }
      }
      return false;
    }
    label142:
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.b;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.c;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    int n = this.d;
    int i2 = n;
    if (n != 0) {
      i2 = 1;
    }
    localObject = this.e;
    int i1;
    if (localObject != null) {
      i1 = ((String)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = this.f;
    int i3;
    if (localObject != null) {
      i3 = ((Enum)localObject).hashCode();
    } else {
      i3 = 0;
    }
    localObject = this.g;
    int i4;
    if (localObject != null) {
      i4 = ((String)localObject).hashCode();
    } else {
      i4 = 0;
    }
    localObject = this.h;
    int i5;
    if (localObject != null) {
      i5 = ((String)localObject).hashCode();
    } else {
      i5 = 0;
    }
    localObject = this.i;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    }
    return ((((((k * 31 + m) * 31 + i2) * 31 + i1) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Filter(id=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", title=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", isPaid=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", similarFilterId=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", imageGender=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", iconUrl=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", previewUrl0=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(", previewUrl1=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f.name());
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
  }
  
  public static final class a
  {
    public final yka a(BZ paramBZ)
    {
      oXa.b(paramBZ, "data");
      String str1 = paramBZ.m();
      oXa.a(str1, "data.id");
      String str2 = paramBZ.q();
      oXa.a(str2, "data.title");
      boolean bool1 = paramBZ.n();
      Object localObject1 = paramBZ.o();
      oXa.a(localObject1, "data.matchingPaidFilterId");
      String str3 = EPa.b((String)localObject1);
      Object localObject2;
      if (paramBZ.r())
      {
        localObject1 = VOa.e;
        localObject2 = paramBZ.p();
        oXa.a(localObject2, "data.preview");
        localObject2 = ((daa)localObject2).m();
        oXa.a(localObject2, "data.preview.gender");
        localObject1 = ((VOa.a)localObject1).a((OZ)localObject2);
      }
      else
      {
        localObject1 = VOa.a;
      }
      String str4 = paramBZ.l();
      oXa.a(str4, "data.iconUrl");
      boolean bool2 = paramBZ.r();
      String str5 = null;
      if (bool2)
      {
        localObject2 = paramBZ.p();
        oXa.a(localObject2, "data.preview");
        localObject2 = ((daa)localObject2).l();
      }
      else
      {
        localObject2 = null;
      }
      if (paramBZ.r())
      {
        paramBZ = paramBZ.p();
        oXa.a(paramBZ, "data.preview");
        paramBZ = paramBZ.n();
        oXa.a(paramBZ, "data.preview.second");
        str5 = EPa.b(paramBZ);
      }
      return new yka(str1, str2, bool1, str3, (VOa)localObject1, str4, (String)localObject2, str5);
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
      return new yka(str1, str2, bool, paramParcel.readString(), (VOa)Enum.valueOf(VOa.class, paramParcel.readString()), paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new yka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */