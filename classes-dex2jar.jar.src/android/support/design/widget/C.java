package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class c
  implements Parcelable.ClassLoaderCreator<AppBarLayout.BaseBehavior.b>
{
  public AppBarLayout.BaseBehavior.b createFromParcel(Parcel paramParcel)
  {
    return new AppBarLayout.BaseBehavior.b(paramParcel, null);
  }
  
  public AppBarLayout.BaseBehavior.b createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new AppBarLayout.BaseBehavior.b(paramParcel, paramClassLoader);
  }
  
  public AppBarLayout.BaseBehavior.b[] newArray(int paramInt)
  {
    return new AppBarLayout.BaseBehavior.b[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */