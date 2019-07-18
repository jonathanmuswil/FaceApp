package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class m
  implements Parcelable.ClassLoaderCreator<l.d>
{
  public l.d createFromParcel(Parcel paramParcel)
  {
    return new l.d(paramParcel, null);
  }
  
  public l.d createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new l.d(paramParcel, paramClassLoader);
  }
  
  public l.d[] newArray(int paramInt)
  {
    return new l.d[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */