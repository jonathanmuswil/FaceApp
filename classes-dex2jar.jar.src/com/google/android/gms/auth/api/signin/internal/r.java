package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import kr;
import lr;

public abstract class r
  extends kr
  implements q
{
  public r()
  {
    super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 103: 
      c((Status)lr.a(paramParcel1, Status.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 102: 
      b((Status)lr.a(paramParcel1, Status.CREATOR));
      throw null;
    }
    a((GoogleSignInAccount)lr.a(paramParcel1, GoogleSignInAccount.CREATOR), (Status)lr.a(paramParcel1, Status.CREATOR));
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */