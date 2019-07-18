package com.google.android.gms.internal.ads;

import Hq.a;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class nfa
  extends YU
  implements mfa
{
  public nfa()
  {
    super("com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 12: 
      paramParcel1 = b(Hq.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), mf.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 11: 
      paramParcel1 = b(Hq.a.a(paramParcel1.readStrongBinder()), Hq.a.a(paramParcel1.readStrongBinder()), Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 10: 
      paramParcel1 = a(Hq.a.a(paramParcel1.readStrongBinder()), (xea)ZU.a(paramParcel1, xea.CREATOR), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 9: 
      paramParcel1 = d(Hq.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 8: 
      paramParcel1 = f(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 7: 
      paramParcel1 = m(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 6: 
      paramParcel1 = a(Hq.a.a(paramParcel1.readStrongBinder()), mf.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 5: 
      paramParcel1 = b(Hq.a.a(paramParcel1.readStrongBinder()), Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 4: 
      paramParcel1 = s(Hq.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 3: 
      paramParcel1 = a(Hq.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), mf.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 2: 
      paramParcel1 = b(Hq.a.a(paramParcel1.readStrongBinder()), (xea)ZU.a(paramParcel1, xea.CREATOR), paramParcel1.readString(), mf.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
      break;
    case 1: 
      paramParcel1 = a(Hq.a.a(paramParcel1.readStrongBinder()), (xea)ZU.a(paramParcel1, xea.CREATOR), paramParcel1.readString(), mf.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ZU.a(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */