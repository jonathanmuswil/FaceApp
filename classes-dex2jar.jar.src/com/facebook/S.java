package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class s
  implements Parcelable.Creator<t>
{
  public t createFromParcel(Parcel paramParcel)
  {
    return new t(paramParcel, null);
  }
  
  public t[] newArray(int paramInt)
  {
    return new t[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */