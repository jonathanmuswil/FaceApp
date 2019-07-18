package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class l
{
  private final Messenger a;
  private final O b;
  
  l(IBinder paramIBinder)
    throws RemoteException
  {
    String str = paramIBinder.getInterfaceDescriptor();
    if ("android.os.IMessenger".equals(str))
    {
      this.a = new Messenger(paramIBinder);
      this.b = null;
      return;
    }
    if ("com.google.android.gms.iid.IMessengerCompat".equals(str))
    {
      this.b = new O(paramIBinder);
      this.a = null;
      return;
    }
    paramIBinder = String.valueOf(str);
    if (paramIBinder.length() != 0) {
      paramIBinder = "Invalid interface descriptor: ".concat(paramIBinder);
    } else {
      paramIBinder = new String("Invalid interface descriptor: ");
    }
    Log.w("MessengerIpcClient", paramIBinder);
    throw new RemoteException();
  }
  
  final void a(Message paramMessage)
    throws RemoteException
  {
    Object localObject = this.a;
    if (localObject != null)
    {
      ((Messenger)localObject).send(paramMessage);
      return;
    }
    localObject = this.b;
    if (localObject != null)
    {
      ((O)localObject).a(paramMessage);
      return;
    }
    throw new IllegalStateException("Both messengers are null");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */