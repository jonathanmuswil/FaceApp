package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class a
  implements Parcelable.Creator<ParcelImpl>
{
  public ParcelImpl createFromParcel(Parcel paramParcel)
  {
    return new ParcelImpl(paramParcel);
  }
  
  public ParcelImpl[] newArray(int paramInt)
  {
    return new ParcelImpl[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/versionedparcelable/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */