package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract interface q
  extends IInterface
{
  public abstract void a(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
    throws RemoteException;
  
  public abstract void b(Status paramStatus)
    throws RemoteException;
  
  public abstract void c(Status paramStatus)
    throws RemoteException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */