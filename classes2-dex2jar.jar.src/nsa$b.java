import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.File;

public final class nsa$b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new osa();
  public static final nsa.b.a a = new nsa.b.a(null);
  private final File b;
  private final String c;
  
  public nsa$b(Parcel paramParcel)
  {
    this(localFile, paramParcel);
  }
  
  public nsa$b(File paramFile, String paramString)
  {
    this.b = paramFile;
    this.c = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c))) {}
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
    Object localObject = this.b;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((File)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.c;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public final String l()
  {
    return this.c;
  }
  
  public final File m()
  {
    return this.b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SharedImage(file=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", analyticsTag=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "dest");
    paramParcel.writeString(this.b.getAbsolutePath());
    paramParcel.writeString(this.c);
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nsa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */