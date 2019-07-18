import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class jq
{
  public static <T extends iq> void a(T paramT, Intent paramIntent, String paramString)
  {
    paramIntent.putExtra(paramString, a(paramT));
  }
  
  public static <T extends iq> byte[] a(T paramT)
  {
    Parcel localParcel = Parcel.obtain();
    paramT.writeToParcel(localParcel, 0);
    paramT = localParcel.marshall();
    localParcel.recycle();
    return paramT;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */