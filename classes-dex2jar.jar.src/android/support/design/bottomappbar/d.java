package android.support.design.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class d
  implements Parcelable.ClassLoaderCreator<BottomAppBar.a>
{
  public BottomAppBar.a createFromParcel(Parcel paramParcel)
  {
    return new BottomAppBar.a(paramParcel, null);
  }
  
  public BottomAppBar.a createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new BottomAppBar.a(paramParcel, paramClassLoader);
  }
  
  public BottomAppBar.a[] newArray(int paramInt)
  {
    return new BottomAppBar.a[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/bottomappbar/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */