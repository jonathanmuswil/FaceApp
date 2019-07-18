import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public final class oka
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new oka.b();
  public static final oka.a a = new oka.a(null);
  private final int b;
  private final List<pka> c;
  
  public oka(int paramInt, List<? extends pka> paramList)
  {
    this.b = paramInt;
    this.c = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof oka))
      {
        paramObject = (oka)paramObject;
        int i;
        if (this.b == ((oka)paramObject).b) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.c, ((oka)paramObject).c))) {}
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
    int i = this.b;
    List localList = this.c;
    int j;
    if (localList != null) {
      j = localList.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public final String l()
  {
    Object localObject1 = this.c.get(this.b);
    boolean bool = localObject1 instanceof mka;
    Object localObject2 = null;
    if (!bool) {
      localObject1 = null;
    }
    mka localmka = (mka)localObject1;
    localObject1 = localObject2;
    if (localmka != null) {
      localObject1 = localmka.c();
    }
    return (String)localObject1;
  }
  
  public final List<pka> m()
  {
    return this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EditorMode(blendingChildIndex=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", children=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeInt(this.b);
    Object localObject = this.c;
    paramParcel.writeInt(((Collection)localObject).size());
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramParcel.writeParcelable((pka)((Iterator)localObject).next(), paramInt);
    }
  }
  
  public static final class a
  {
    public final oka a(kZ paramkZ)
    {
      oXa.b(paramkZ, "data");
      Object localObject1 = paramkZ.l();
      oXa.a(localObject1, "data.childrenList");
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = ((Iterable)localObject1).iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        localObject1 = null;
        if (i >= 0)
        {
          localObject2 = (kZ.b)localObject2;
          oXa.a(localObject2, "child");
          kZ.b.b localb = ((kZ.b)localObject2).l();
          if (localb != null)
          {
            int j = nka.a[localb.ordinal()];
            if (j != 1)
            {
              if (j == 2)
              {
                localObject1 = rka.a;
                localObject2 = ((kZ.b)localObject2).m();
                oXa.a(localObject2, "child.tool");
                localObject1 = ((rka.a)localObject1).a((laa)localObject2);
              }
            }
            else
            {
              localObject1 = mka.a;
              localObject2 = ((kZ.b)localObject2).k();
              oXa.a(localObject2, "child.filtersGroup");
              localObject1 = ((mka.a)localObject1).a(i, (iZ)localObject2);
            }
          }
          if (localObject1 != null) {
            localArrayList.add(localObject1);
          }
          i++;
        }
        else
        {
          mWa.c();
          throw null;
        }
      }
      return new oka(paramkZ.k(), localArrayList);
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      int i = paramParcel.readInt();
      int j = paramParcel.readInt();
      ArrayList localArrayList = new ArrayList(j);
      while (j != 0)
      {
        localArrayList.add((pka)paramParcel.readParcelable(oka.class.getClassLoader()));
        j--;
      }
      return new oka(i, localArrayList);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new oka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */