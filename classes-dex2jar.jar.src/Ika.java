import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public final class ika
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new ika.b();
  public static final ika.a a = new ika.a(null);
  private final String b;
  private final int c;
  private final int d;
  
  public ika(String paramString, int paramInt1, int paramInt2)
  {
    this.b = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final String a(String paramString)
  {
    oXa.b(paramString, "separator");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b);
    localStringBuilder.append(paramString);
    localStringBuilder.append(this.c);
    localStringBuilder.append(paramString);
    localStringBuilder.append(this.d);
    return localStringBuilder.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof ika))
      {
        paramObject = (ika)paramObject;
        if (oXa.a(this.b, ((ika)paramObject).b))
        {
          int i;
          if (this.c == ((ika)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.d == ((ika)paramObject).d) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label80;
            }
          }
        }
      }
      return false;
    }
    label80:
    return true;
  }
  
  public int hashCode()
  {
    String str = this.b;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return (i * 31 + this.c) * 31 + this.d;
  }
  
  public final String l()
  {
    return this.b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FacebookImage(imageUrl=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", width=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", height=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
  }
  
  public static final class a
  {
    public final ika a(afa paramafa)
    {
      oXa.b(paramafa, "data");
      return new ika(paramafa.getSource(), paramafa.getWidth(), paramafa.getHeight());
    }
    
    public final ika a(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      return new ika((String)paramString1.get(0), Integer.parseInt((String)paramString1.get(1)), Integer.parseInt((String)paramString1.get(2)));
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      return new ika(paramParcel.readString(), paramParcel.readInt(), paramParcel.readInt());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new ika[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ika.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */