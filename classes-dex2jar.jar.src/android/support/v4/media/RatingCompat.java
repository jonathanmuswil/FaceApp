package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new m();
  private final int a;
  private final float b;
  
  RatingCompat(int paramInt, float paramFloat)
  {
    this.a = paramInt;
    this.b = paramFloat;
  }
  
  public int describeContents()
  {
    return this.a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Rating:style=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" rating=");
    float f = this.b;
    String str;
    if (f < 0.0F) {
      str = "unrated";
    } else {
      str = String.valueOf(f);
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeFloat(this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/RatingCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */