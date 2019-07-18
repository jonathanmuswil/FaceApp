import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public final class lka
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new lka.b();
  public static final lka.a a = new lka.a(null);
  private final String b;
  private final String c;
  private final boolean d;
  private final VOa e;
  private final List<String> f;
  private final String g;
  private final String h;
  private final String i;
  
  public lka(String paramString1, String paramString2, boolean paramBoolean, VOa paramVOa, List<String> paramList, String paramString3, String paramString4, String paramString5)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
    this.e = paramVOa;
    this.f = paramList;
    this.g = paramString3;
    this.h = paramString4;
    this.i = paramString5;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof lka))
      {
        paramObject = (lka)paramObject;
        if ((oXa.a(this.b, ((lka)paramObject).b)) && (oXa.a(this.c, ((lka)paramObject).c)))
        {
          int j;
          if (this.d == ((lka)paramObject).d) {
            j = 1;
          } else {
            j = 0;
          }
          if ((j != 0) && (oXa.a(this.e, ((lka)paramObject).e)) && (oXa.a(this.f, ((lka)paramObject).f)) && (oXa.a(this.g, ((lka)paramObject).g)) && (oXa.a(this.h, ((lka)paramObject).h)) && (oXa.a(this.i, ((lka)paramObject).i))) {
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
      i1 = ((Enum)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = this.f;
    int i3;
    if (localObject != null) {
      i3 = localObject.hashCode();
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
  
  public final String l()
  {
    return Nra.c.a(this.g);
  }
  
  public final String m()
  {
    return this.b;
  }
  
  public final VOa n()
  {
    return this.e;
  }
  
  public final String o()
  {
    String str = this.h;
    if (str != null) {
      str = Nra.c.a(str);
    } else {
      str = null;
    }
    return str;
  }
  
  public final String p()
  {
    String str = this.i;
    if (str != null) {
      str = Nra.c.a(str);
    } else {
      str = null;
    }
    return str;
  }
  
  public final String q()
  {
    return this.c;
  }
  
  public final List<String> r()
  {
    return this.f;
  }
  
  public final boolean s()
  {
    return this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EditorFilter(id=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", title=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", isPaid=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", imageGender=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", variants=");
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
    paramParcel.writeString(this.e.name());
    paramParcel.writeStringList(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
  }
  
  public static final class a
  {
    public final lka a(gZ paramgZ)
    {
      oXa.b(paramgZ, "data");
      String str1 = paramgZ.l();
      oXa.a(str1, "data.id");
      String str2 = paramgZ.o();
      oXa.a(str2, "data.title");
      boolean bool = paramgZ.m();
      Object localObject1;
      if (paramgZ.q())
      {
        localObject1 = VOa.e;
        localObject2 = paramgZ.n();
        oXa.a(localObject2, "data.preview");
        localObject2 = ((daa)localObject2).m();
        oXa.a(localObject2, "data.preview.gender");
        localObject1 = ((VOa.a)localObject1).a((OZ)localObject2);
      }
      else
      {
        localObject1 = VOa.a;
      }
      Object localObject2 = paramgZ.p();
      oXa.a(localObject2, "it");
      if (!(((Collection)localObject2).isEmpty() ^ true)) {
        localObject2 = null;
      }
      Object localObject3;
      if (localObject2 != null)
      {
        localObject3 = new ArrayList(mWa.a((Iterable)localObject2, 10));
        localObject4 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject2 = (gZ.b)((Iterator)localObject4).next();
          oXa.a(localObject2, "it");
          ((Collection)localObject3).add(((gZ.b)localObject2).k());
        }
        localObject2 = localObject3;
      }
      else
      {
        localObject2 = null;
      }
      Object localObject4 = paramgZ.k();
      oXa.a(localObject4, "data.iconUrl");
      if (paramgZ.q())
      {
        localObject3 = paramgZ.n();
        oXa.a(localObject3, "data.preview");
        localObject3 = ((daa)localObject3).l();
      }
      else
      {
        localObject3 = null;
      }
      if (paramgZ.q())
      {
        paramgZ = paramgZ.n();
        oXa.a(paramgZ, "data.preview");
        paramgZ = paramgZ.n();
        oXa.a(paramgZ, "data.preview.second");
        paramgZ = EPa.b(paramgZ);
      }
      else
      {
        paramgZ = null;
      }
      return new lka(str1, str2, bool, (VOa)localObject1, (List)localObject2, (String)localObject4, (String)localObject3, paramgZ);
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
      return new lka(str1, str2, bool, (VOa)Enum.valueOf(VOa.class, paramParcel.readString()), paramParcel.createStringArrayList(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new lka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */