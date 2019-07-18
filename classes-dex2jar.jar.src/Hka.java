import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public final class hka
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new hka.b();
  public static final hka.a a = new hka.a(null);
  private final String b;
  private final String c;
  private final VOa d;
  private final String e;
  private final int f;
  
  public hka(String paramString1, String paramString2, VOa paramVOa, String paramString3, int paramInt)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramVOa;
    this.e = paramString3;
    this.f = paramInt;
  }
  
  public final String a(String paramString)
  {
    oXa.b(paramString, "separator");
    return gWa.a(new Object[] { this.b, this.c, this.d.getId(), this.e, Integer.valueOf(this.f) }, paramString, null, null, 0, null, null, 62, null);
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof hka))
      {
        paramObject = (hka)paramObject;
        if ((oXa.a(this.b, ((hka)paramObject).b)) && (oXa.a(this.c, ((hka)paramObject).c)) && (oXa.a(this.d, ((hka)paramObject).d)) && (oXa.a(this.e, ((hka)paramObject).e)))
        {
          int i;
          if (this.f == ((hka)paramObject).f) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label100;
          }
        }
      }
      return false;
    }
    label100:
    return true;
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
    localObject = this.d;
    int m;
    if (localObject != null) {
      m = ((Enum)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.e;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return (((j * 31 + k) * 31 + m) * 31 + i) * 31 + this.f;
  }
  
  public final String l()
  {
    return this.e;
  }
  
  public final int m()
  {
    return this.f;
  }
  
  public final String n()
  {
    return this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DemoImage(thumbUri=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", photoCode=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", gender=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", hostName=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", hostPort=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d.name());
    paramParcel.writeString(this.e);
    paramParcel.writeInt(this.f);
  }
  
  public static final class a
  {
    public final hka a(ZY paramZY, bfa parambfa)
    {
      oXa.b(paramZY, "data");
      oXa.b(parambfa, "host");
      String str1 = paramZY.m();
      oXa.a(str1, "data.thumbnail");
      String str2 = paramZY.k();
      oXa.a(str2, "data.code");
      VOa.a locala = VOa.e;
      paramZY = paramZY.l();
      oXa.a(paramZY, "data.gender");
      return new hka(str1, str2, locala.a(paramZY), parambfa.getHost(), parambfa.getPort());
    }
    
    public final hka a(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      return new hka((String)paramString1.get(0), (String)paramString1.get(1), VOa.e.a((String)paramString1.get(2)), (String)paramString1.get(3), Integer.parseInt((String)paramString1.get(4)));
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      return new hka(paramParcel.readString(), paramParcel.readString(), (VOa)Enum.valueOf(VOa.class, paramParcel.readString()), paramParcel.readString(), paramParcel.readInt());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new hka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */