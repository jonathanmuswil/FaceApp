package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class k
  implements Parcelable.ClassLoaderCreator<BottomSheetBehavior.b>
{
  public BottomSheetBehavior.b createFromParcel(Parcel paramParcel)
  {
    return new BottomSheetBehavior.b(paramParcel, null);
  }
  
  public BottomSheetBehavior.b createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new BottomSheetBehavior.b(paramParcel, paramClassLoader);
  }
  
  public BottomSheetBehavior.b[] newArray(int paramInt)
  {
    return new BottomSheetBehavior.b[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */