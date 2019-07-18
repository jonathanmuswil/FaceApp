import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.ads.Xb;
import com.google.android.gms.internal.ads.Zb;
import com.google.android.gms.internal.ads.jfa;
import com.google.android.gms.internal.ads.kfa;
import com.google.android.gms.internal.ads.yh;

@yh
public final class yp
  extends fq
{
  public static final Parcelable.Creator<yp> CREATOR = new Cp();
  private final boolean a;
  private final jfa b;
  private final IBinder c;
  
  yp(boolean paramBoolean, IBinder paramIBinder1, IBinder paramIBinder2)
  {
    this.a = paramBoolean;
    if (paramIBinder1 != null) {
      paramIBinder1 = kfa.a(paramIBinder1);
    } else {
      paramIBinder1 = null;
    }
    this.b = paramIBinder1;
    this.c = paramIBinder2;
  }
  
  public final Xb A()
  {
    return Zb.a(this.c);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, y());
    Object localObject = this.b;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((IInterface)localObject).asBinder();
    }
    hq.a(paramParcel, 2, (IBinder)localObject, false);
    hq.a(paramParcel, 3, this.c, false);
    hq.a(paramParcel, paramInt);
  }
  
  public final boolean y()
  {
    return this.a;
  }
  
  public final jfa z()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */