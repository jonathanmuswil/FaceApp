package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class w
  implements Parcelable.ClassLoaderCreator<CoordinatorLayout.g>
{
  public CoordinatorLayout.g createFromParcel(Parcel paramParcel)
  {
    return new CoordinatorLayout.g(paramParcel, null);
  }
  
  public CoordinatorLayout.g createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new CoordinatorLayout.g(paramParcel, paramClassLoader);
  }
  
  public CoordinatorLayout.g[] newArray(int paramInt)
  {
    return new CoordinatorLayout.g[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */