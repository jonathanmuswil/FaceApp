import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public final class rka
  implements Dka, pka
{
  public static final Parcelable.Creator CREATOR = new rka.b();
  public static final rka.a a = new rka.a(null);
  private final String b;
  private final String c;
  private final String d;
  private final List<ska> e;
  private final String f;
  private final String g;
  
  public rka(String paramString1, String paramString2, String paramString3, List<? extends ska> paramList, String paramString4, String paramString5)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramList;
    this.f = paramString4;
    this.g = paramString5;
  }
  
  public final List<ska> a()
  {
    return this.e;
  }
  
  public final String b()
  {
    Nra localNra = Nra.c;
    String str = this.f;
    if (str == null) {
      str = "";
    }
    return localNra.a(str);
  }
  
  public final String c()
  {
    return this.b;
  }
  
  public final String d()
  {
    Nra localNra = Nra.c;
    String str = this.g;
    if (str == null) {
      str = "";
    }
    return EPa.b(localNra.a(str));
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
      if ((paramObject instanceof rka))
      {
        paramObject = (rka)paramObject;
        if ((oXa.a(this.b, ((rka)paramObject).b)) && (oXa.a(this.c, ((rka)paramObject).c)) && (oXa.a(this.d, ((rka)paramObject).d)) && (oXa.a(this.e, ((rka)paramObject).e)) && (oXa.a(this.f, ((rka)paramObject).f)) && (oXa.a(this.g, ((rka)paramObject).g))) {}
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
    localStringBuilder.append("EditorTool(id=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", title=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", resetTitle=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", children=");
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
      paramParcel.writeParcelable((ska)((Iterator)localObject).next(), paramInt);
    }
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
  }
  
  public static final class a
  {
    public final rka a(laa paramlaa)
    {
      oXa.b(paramlaa, "data");
      Object localObject1 = paramlaa.k();
      oXa.a(localObject1, "data.childrenList");
      ArrayList localArrayList = new ArrayList();
      Object localObject2 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (maa)((Iterator)localObject2).next();
        oXa.a(localObject1, "it");
        localObject3 = ((maa)localObject1).o();
        if (localObject3 != null)
        {
          int i = qka.a[localObject3.ordinal()];
          if (i == 1) {
            break label224;
          }
          if (i == 2) {
            break label198;
          }
          if (i == 3) {
            break label172;
          }
          if (i == 4) {
            break label146;
          }
          if (i == 5) {}
        }
        else
        {
          localObject1 = null;
          break label247;
        }
        localObject3 = jka.a;
        localObject1 = ((maa)localObject1).k();
        oXa.a(localObject1, "it.adjustment");
        localObject1 = ((jka.a)localObject3).a((RY)localObject1);
        break label247;
        label146:
        localObject3 = Gka.a;
        localObject1 = ((maa)localObject1).p();
        oXa.a(localObject1, "it.overlayImage");
        localObject1 = ((Gka.a)localObject3).a((baa)localObject1);
        break label247;
        label172:
        localObject3 = kka.a;
        localObject1 = ((maa)localObject1).l();
        oXa.a(localObject1, "it.backgroundImage");
        localObject1 = ((kka.a)localObject3).a((VY)localObject1);
        break label247;
        label198:
        localObject3 = Kka.a;
        localObject1 = ((maa)localObject1).n();
        oXa.a(localObject1, "it.faceGraphic");
        localObject1 = ((Kka.a)localObject3).a((uZ)localObject1);
        break label247;
        label224:
        localObject3 = tka.a;
        localObject1 = ((maa)localObject1).m();
        oXa.a(localObject1, "it.effect");
        localObject1 = ((tka.a)localObject3).a((oaa)localObject1);
        label247:
        if (localObject1 != null) {
          localArrayList.add(localObject1);
        }
      }
      localObject2 = paramlaa.n();
      oXa.a(localObject2, "data.id");
      localObject1 = paramlaa.q();
      oXa.a(localObject1, "data.title");
      localObject1 = EPa.b((String)localObject1);
      if (localObject1 == null) {
        localObject1 = "";
      }
      Object localObject3 = paramlaa.p();
      oXa.a(localObject3, "data.resetTitle");
      localObject3 = EPa.b((String)localObject3);
      String str = paramlaa.m();
      oXa.a(str, "data.iconUrl");
      str = EPa.b(str);
      paramlaa = paramlaa.o();
      oXa.a(paramlaa, "data.resetIconUrl");
      return new rka((String)localObject2, (String)localObject1, (String)localObject3, localArrayList, str, EPa.b(paramlaa));
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
        localArrayList.add((ska)paramParcel.readParcelable(rka.class.getClassLoader()));
        i--;
      }
      return new rka(str1, str2, str3, localArrayList, paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new rka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */