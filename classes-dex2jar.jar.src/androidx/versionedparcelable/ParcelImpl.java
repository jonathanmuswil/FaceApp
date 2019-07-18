package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelImpl
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
  private final d a;
  
  protected ParcelImpl(Parcel paramParcel)
  {
    this.a = new c(paramParcel).h();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new c(paramParcel).a(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/versionedparcelable/ParcelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */