package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class b
  implements Parcelable.ClassLoaderCreator<c>
{
  public c createFromParcel(Parcel paramParcel)
  {
    return createFromParcel(paramParcel, null);
  }
  
  public c createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    if (paramParcel.readParcelable(paramClassLoader) == null) {
      return c.a;
    }
    throw new IllegalStateException("superState must be null");
  }
  
  public c[] newArray(int paramInt)
  {
    return new c[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */