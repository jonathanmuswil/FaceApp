import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class cfa
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new cfa.a();
  private final int height;
  private final int width;
  
  public cfa(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof cfa))
      {
        paramObject = (cfa)paramObject;
        int i;
        if (this.width == ((cfa)paramObject).width) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.height == ((cfa)paramObject).height) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label66;
          }
        }
      }
      return false;
    }
    label66:
    return true;
  }
  
  public int hashCode()
  {
    return this.width * 31 + this.height;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MediaSize(width=");
    localStringBuilder.append(this.width);
    localStringBuilder.append(", height=");
    localStringBuilder.append(this.height);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      return new cfa(paramParcel.readInt(), paramParcel.readInt());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new cfa[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */