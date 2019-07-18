import android.net.Uri;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class zo<P extends zo, E>
  implements Fo
{
  private final Uri a;
  private final List<String> b;
  private final String c;
  private final String d;
  private final String e;
  private final Bo f;
  
  protected zo(Parcel paramParcel)
  {
    this.a = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    this.b = a(paramParcel);
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    Bo.a locala = new Bo.a();
    locala.a(paramParcel);
    this.f = locala.a();
  }
  
  private List<String> a(Parcel paramParcel)
  {
    ArrayList localArrayList = new ArrayList();
    paramParcel.readStringList(localArrayList);
    if (localArrayList.size() == 0) {
      paramParcel = null;
    } else {
      paramParcel = Collections.unmodifiableList(localArrayList);
    }
    return paramParcel;
  }
  
  public Uri a()
  {
    return this.a;
  }
  
  public Bo b()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, 0);
    paramParcel.writeStringList(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeParcelable(this.f, 0);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */