package com.facebook.accountkit.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ha
  implements Parcelable.Creator<ia>
{
  public ia createFromParcel(Parcel paramParcel)
  {
    return new ia(paramParcel, null);
  }
  
  public ia[] newArray(int paramInt)
  {
    return new ia[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */