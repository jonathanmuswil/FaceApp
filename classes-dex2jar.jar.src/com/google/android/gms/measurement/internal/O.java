package com.google.android.gms.measurement.internal;

import MG;
import android.os.Parcel;
import android.os.RemoteException;
import hG;

public abstract class o
  extends hG
  implements n
{
  public o()
  {
    super("com.google.android.gms.measurement.internal.IMeasurementService");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    case 3: 
    case 8: 
    default: 
      return false;
    case 18: 
      a((pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 17: 
      paramParcel1 = a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 16: 
      paramParcel1 = a(paramParcel1.readString(), paramParcel1.readString(), (pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 15: 
      paramParcel1 = a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), MG.a(paramParcel1));
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 14: 
      paramParcel1 = a(paramParcel1.readString(), paramParcel1.readString(), MG.a(paramParcel1), (pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 13: 
      a((uc)MG.a(paramParcel1, uc.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 12: 
      a((uc)MG.a(paramParcel1, uc.CREATOR), (pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 11: 
      paramParcel1 = c((pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 10: 
      a(paramParcel1.readLong(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 9: 
      paramParcel1 = a((k)MG.a(paramParcel1, k.CREATOR), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(paramParcel1);
      break;
    case 7: 
      paramParcel1 = a((pc)MG.a(paramParcel1, pc.CREATOR), MG.a(paramParcel1));
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 6: 
      b((pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 5: 
      a((k)MG.a(paramParcel1, k.CREATOR), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      break;
    case 4: 
      d((pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 2: 
      a((ec)MG.a(paramParcel1, ec.CREATOR), (pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
      break;
    case 1: 
      a((k)MG.a(paramParcel1, k.CREATOR), (pc)MG.a(paramParcel1, pc.CREATOR));
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */