import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public final class mka
  implements pka
{
  public static final Parcelable.Creator CREATOR = new mka.b();
  public static final mka.a a = new mka.a(null);
  private final String b;
  private final String c;
  private final String d;
  private final List<lka> e;
  private final String f;
  private final String g;
  
  public mka(String paramString1, String paramString2, String paramString3, List<lka> paramList, String paramString4, String paramString5)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramList;
    this.f = paramString4;
    this.g = paramString5;
  }
  
  public final List<lka> a()
  {
    return this.e;
  }
  
  public final String b()
  {
    return Nra.c.a(this.f);
  }
  
  public final String c()
  {
    return this.b;
  }
  
  public final String d()
  {
    return Nra.c.a(this.g);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String e()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof mka))
      {
        paramObject = (mka)paramObject;
        if ((oXa.a(this.b, ((mka)paramObject).b)) && (oXa.a(this.c, ((mka)paramObject).c)) && (oXa.a(this.d, ((mka)paramObject).d)) && (oXa.a(this.e, ((mka)paramObject).e)) && (oXa.a(this.f, ((mka)paramObject).f)) && (oXa.a(this.g, ((mka)paramObject).g))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final String f()
  {
    return this.c;
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
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.e;
    int n;
    if (localObject != null) {
      n = localObject.hashCode();
    } else {
      n = 0;
    }
    localObject = this.f;
    int i1;
    if (localObject != null) {
      i1 = ((String)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = this.g;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return ((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EditorFolder(id=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", title=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", resetTitle=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", filters=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", iconUrl=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", resetIconUrl=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    Object localObject = this.e;
    paramParcel.writeInt(((Collection)localObject).size());
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((lka)((Iterator)localObject).next()).writeToParcel(paramParcel, 0);
    }
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
  }
  
  public static final class a
  {
    public final mka a(int paramInt, iZ paramiZ)
    {
      oXa.b(paramiZ, "data");
      String str1 = paramiZ.p();
      oXa.a(str1, "data.title");
      String str2 = paramiZ.o();
      oXa.a(str2, "data.resetTitle");
      Object localObject = paramiZ.l();
      oXa.a(localObject, "data.filtersList");
      ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject, 10));
      Iterator localIterator = ((Iterable)localObject).iterator();
      while (localIterator.hasNext())
      {
        gZ localgZ = (gZ)localIterator.next();
        localObject = lka.a;
        oXa.a(localgZ, "it");
        localArrayList.add(((lka.a)localObject).a(localgZ));
      }
      localObject = paramiZ.m();
      oXa.a(localObject, "data.iconUrl");
      paramiZ = paramiZ.n();
      oXa.a(paramiZ, "data.resetIconUrl");
      return new mka(String.valueOf(paramInt), str1, str2, localArrayList, (String)localObject, paramiZ);
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
      String str3 = paramParcel.readString();
      int i = paramParcel.readInt();
      ArrayList localArrayList = new ArrayList(i);
      while (i != 0)
      {
        localArrayList.add((lka)lka.CREATOR.createFromParcel(paramParcel));
        i--;
      }
      return new mka(str1, str2, str3, localArrayList, paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new mka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */