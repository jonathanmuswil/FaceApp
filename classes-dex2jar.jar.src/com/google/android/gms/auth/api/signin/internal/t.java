package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import jr;
import lr;

public final class t
  extends jr
  implements s
{
  t(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
  }
  
  public final void a(q paramq, GoogleSignInOptions paramGoogleSignInOptions)
    throws RemoteException
  {
    Parcel localParcel = a();
    lr.a(localParcel, paramq);
    lr.a(localParcel, paramGoogleSignInOptions);
    a(103, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */