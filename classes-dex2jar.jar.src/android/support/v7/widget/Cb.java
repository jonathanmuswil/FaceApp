package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class cb
  implements Parcelable.ClassLoaderCreator<SearchView.e>
{
  public SearchView.e createFromParcel(Parcel paramParcel)
  {
    return new SearchView.e(paramParcel, null);
  }
  
  public SearchView.e createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new SearchView.e(paramParcel, paramClassLoader);
  }
  
  public SearchView.e[] newArray(int paramInt)
  {
    return new SearchView.e[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */