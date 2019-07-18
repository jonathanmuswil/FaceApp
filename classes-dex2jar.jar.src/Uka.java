import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class uka
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new uka.b();
  public static final uka.a a = new uka.a(null);
  private final WVa<Float, Float> b;
  private final WVa<Float, Float> c;
  
  public uka(WVa<Float, Float> paramWVa1, WVa<Float, Float> paramWVa2)
  {
    this.b = paramWVa1;
    this.c = paramWVa2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof uka))
      {
        paramObject = (uka)paramObject;
        if ((oXa.a(this.b, ((uka)paramObject).b)) && (oXa.a(this.c, ((uka)paramObject).c))) {}
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
    WVa localWVa = this.b;
    int i = 0;
    int j;
    if (localWVa != null) {
      j = localWVa.hashCode();
    } else {
      j = 0;
    }
    localWVa = this.c;
    if (localWVa != null) {
      i = localWVa.hashCode();
    }
    return j * 31 + i;
  }
  
  public final WVa<Float, Float> l()
  {
    return this.b;
  }
  
  public final WVa<Float, Float> m()
  {
    return this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Eyes(left=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", right=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeSerializable(this.b);
    paramParcel.writeSerializable(this.c);
  }
  
  public static final class a
  {
    public final uka a(qZ.b paramb)
    {
      oXa.b(paramb, "data");
      Object localObject = paramb.l();
      oXa.a(localObject, "data.left");
      float f = ((mZ)localObject).m();
      localObject = paramb.l();
      oXa.a(localObject, "data.left");
      localObject = new WVa(Float.valueOf(f), Float.valueOf(((mZ)localObject).l()));
      mZ localmZ = paramb.m();
      oXa.a(localmZ, "data.right");
      f = localmZ.m();
      paramb = paramb.m();
      oXa.a(paramb, "data.right");
      return new uka((WVa)localObject, new WVa(Float.valueOf(f), Float.valueOf(paramb.l())));
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      return new uka((WVa)paramParcel.readSerializable(), (WVa)paramParcel.readSerializable());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new uka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */