package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class l
  implements Parcelable.ClassLoaderCreator<DrawerLayout.e>
{
  public DrawerLayout.e createFromParcel(Parcel paramParcel)
  {
    return new DrawerLayout.e(paramParcel, null);
  }
  
  public DrawerLayout.e createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new DrawerLayout.e(paramParcel, paramClassLoader);
  }
  
  public DrawerLayout.e[] newArray(int paramInt)
  {
    return new DrawerLayout.e[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */