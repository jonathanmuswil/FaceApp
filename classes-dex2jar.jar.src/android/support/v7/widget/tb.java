package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class tb
  implements Parcelable.ClassLoaderCreator<Toolbar.d>
{
  public Toolbar.d createFromParcel(Parcel paramParcel)
  {
    return new Toolbar.d(paramParcel, null);
  }
  
  public Toolbar.d createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new Toolbar.d(paramParcel, paramClassLoader);
  }
  
  public Toolbar.d[] newArray(int paramInt)
  {
    return new Toolbar.d[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */