import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class osa
  implements Parcelable.Creator<nsa.b>
{
  public nsa.b createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "parcel");
    return new nsa.b(paramParcel);
  }
  
  public nsa.b[] newArray(int paramInt)
  {
    return new nsa.b[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/osa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */