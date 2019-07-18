package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class c
  implements Parcelable
{
  public static final Parcelable.Creator<c> CREATOR = new b();
  public static final c a = new a();
  private final Parcelable b;
  
  private c()
  {
    this.b = null;
  }
  
  protected c(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    paramParcel = paramParcel.readParcelable(paramClassLoader);
    if (paramParcel == null) {
      paramParcel = a;
    }
    this.b = paramParcel;
  }
  
  protected c(Parcelable paramParcelable)
  {
    if (paramParcelable != null)
    {
      if (paramParcelable == a) {
        paramParcelable = null;
      }
      this.b = paramParcelable;
      return;
    }
    throw new IllegalArgumentException("superState must not be null");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final Parcelable l()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.b, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */